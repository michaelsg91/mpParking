package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class cargaFactura {
	private conexion conexion;
	public ResultSet rs,rs2;
	private PreparedStatement pst;
	private Connection conecta;
	private final String sql="select idRecibo from recibo where idRecibo not in(select idRecibo from factura)";
	private final String sql2="select idTipoTar,fechaEntrada,horaEntrada,idTipoVeh from recibo where idRecibo=?";
	private final String sql3="select valorTarifa from tarifa where idTipoTar=? and idTipoVeh=?";
	private final String sql4="select datediff(now(),fechaEntrada)*24*60,abs(timediff(curtime(),horaEntrada)),hour(curtime())-hour(horaEntrada) from recibo where idRecibo=?";
	private final String sql5="select minute(curtime())-minute(horaEntrada) from recibo where idRecibo=?";
	private final String sql6="select round(time_to_sec(?)/60,0)";
	private final String sql7="select datediff(now(),fechaEntrada)*24, abs(timediff(curtime(),horaEntrada)), hour(curtime())-hour(horaEntrada) from recibo where idRecibo=?";
	private final String sql8="select round(time_to_sec(?)/60/60,0)";
	private final String sql9="insert into factura(idRecibo,idUsuariO,fechaSalida,horaSalida,subtotal,iva,total) values (?,?,now(),curtime(),?,?,?)";
	public String idTipoTar,fechaEntrada,horaEntrada,idTipoVeh,diferenciaMin;
	public Double tarifa,valorDia,valorMin,subtotal,total,iva;
	public int horas,minutos;
	private double tot;
	public cargaFactura(){
		conexion=new conexion();
	}
	
	public void consulta(){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql);
			rs2=pst.executeQuery();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error: cargaFactura");
		}	
		
	}
	
	public void ingresa(String idRecibo,String idUsuario,String subtotal,String iva,String total){
		
		try{
			tot=Double.parseDouble(total);
			conecta=conexion.getConexion();
			pst=conecta.prepareStatement(sql9);
			pst.setString(1, idRecibo);
			pst.setString(2, idUsuario);
			pst.setString(3, subtotal);
			pst.setString(4, iva);
			pst.setString(5, total);
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "La factura ha sido registrada con éxito");
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "No hay elementos para regitrar");
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Valor total no válido");
		}
	}
	
	public void proceso(String idRecibo){		
		conecta=conexion.getConexion();
		
		try{
			pst=conecta.prepareStatement(sql2);
			pst.setString(1, idRecibo);
			rs=pst.executeQuery();
			while(rs.next()){
				idTipoTar=rs.getString(1);
				fechaEntrada=rs.getString(2);
				horaEntrada=rs.getString(3);
				idTipoVeh=rs.getString(4);
			}
			pst=conecta.prepareStatement(sql3);
			pst.setString(1, idTipoTar);
			pst.setString(2, idTipoVeh);
			rs=pst.executeQuery();
			
			while(rs.next()){
				tarifa=rs.getDouble(1);
			}
			
			if(idTipoTar.equals("1")){
				pst=conecta.prepareStatement(sql4);
				pst.setString(1, idRecibo);
				rs=pst.executeQuery();
				while(rs.next()){
					valorDia=rs.getDouble(1);
					diferenciaMin=rs.getString(2);
					horas=rs.getInt(3);
				}
								
				if(horas==0){
					pst=conecta.prepareStatement(sql5);
					pst.setString(1, idRecibo);
					rs=pst.executeQuery();
					while(rs.next()){
						minutos=rs.getInt(1);
					}
				}
				
				pst=conecta.prepareStatement(sql6);
				pst.setString(1, diferenciaMin);
				rs=pst.executeQuery();
				while(rs.next()){
					valorMin=rs.getDouble(1);
				}
								
				if(horas<0 || minutos<0){
					valorMin=valorMin*-1;
				}
				
				valorMin=valorMin+1;				
				subtotal=(valorDia+valorMin)*tarifa;
				iva=subtotal*0.19;
				total=subtotal+iva;
				horas=0;
				minutos=0;
			}else if(idTipoTar.equals("2")){
				pst=conecta.prepareStatement(sql7);
				pst.setString(1, idRecibo);
				rs=pst.executeQuery();
				
				while(rs.next()){
					valorDia=rs.getDouble(1);
					diferenciaMin=rs.getString(1);
					horas=rs.getInt(1);
				}
				
				pst=conecta.prepareStatement(sql8);
				pst.setString(1, diferenciaMin);
				rs=pst.executeQuery();
				while(rs.next()){
					valorMin=rs.getDouble(1);
				}
				
				if(horas<0){
					valorMin=valorMin*-1;
				}
				
				valorMin=valorMin+1;
				
				subtotal=(valorDia+valorMin)*tarifa;
				iva=subtotal*0.19;
				total=subtotal+iva;
				horas=0;
			}
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error: proceso cargaFactura"+e.getMessage());
		}
	}
	
}
