package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class cargaIngresos{
	private conexion conexion;
	public ResultSet rs,rs2,rs3;
	private PreparedStatement pst;
	private Connection conecta;
	private final String sql="select distinctrow idVeh from factura,recibo where factura.idRecibo=recibo.idRecibo";
	private final String sql2="select distinctrow idVeh from factura,recibo where factura.idRecibo=recibo.idRecibo and idTipoVeh=?";
	private final String sql3="select idTipoVeh from tipoVeh where tipoVeh=?";

	private final String sql4="select sum(subtotal),sum(iva),sum(total) from factura,recibo where factura.idRecibo=recibo.idRecibo and fechaSalida between ? and ? and idTipoVeh=?";
	private final String sql5="select sum(subtotal),sum(iva),sum(total) from factura where fechaSalida between ? and ?";
	private final String sql6="select sum(subtotal),sum(iva),sum(total) from factura,recibo where factura.idRecibo=recibo.idRecibo and fechaSalida between ? and ? and idTipoVeh=? and idVeh=?";
	private final String sql7="select sum(subtotal),sum(iva),sum(total) from factura,recibo where factura.idRecibo=recibo.idRecibo and fechaSalida between ? and ? and idVeh=?";

	private String tipoVeh;
	public cargaIngresos(){
		conexion=new conexion();
		tipoVeh="Ambos";
	}
	
	public void recibeTipo(String tipoVeh){
		if(!tipoVeh.equals("Ambos")){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql3);
			pst.setString(1, tipoVeh);
			rs2=pst.executeQuery();
			
			while(rs2.next()){
				this.tipoVeh=rs2.getString(1);
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error: cargaIngresos rec" + e.getMessage());
		}
		}else{
			this.tipoVeh=tipoVeh;
		}
	}
	
	public void consulta(){
		conecta=conexion.getConexion();
		try{
			if(tipoVeh.equals("Ambos")){
				pst=conecta.prepareStatement(sql);
				rs3=pst.executeQuery();
			}else{
				pst=conecta.prepareStatement(sql2);
				pst.setString(1, tipoVeh);
				rs3=pst.executeQuery();
			}
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error: cargaIngresos " + e.getMessage());
		}
	}
	
	public void filtrar(String fInicial,String fFinal,String placa){
		conecta=conexion.getConexion();
		try{
			if(!tipoVeh.equals("Ambos")){

			
			if(!placa.equals("Todas")){
			pst=conecta.prepareStatement(sql6);
			pst.setString(1, fInicial);
			pst.setString(2, fFinal);
			pst.setString(3, tipoVeh);
			pst.setString(4, placa);
			rs=pst.executeQuery();
			}else{
				pst=conecta.prepareStatement(sql4);
				pst.setString(1, fInicial);
				pst.setString(2, fFinal);
				pst.setString(3, tipoVeh);
				rs=pst.executeQuery();
			}
			}else{
				if(!placa.equals("Todas")){
					pst=conecta.prepareStatement(sql7);
					pst.setString(1, fInicial);
					pst.setString(2, fFinal);
					pst.setString(3, placa);
					rs=pst.executeQuery();
				}else{
					pst=conecta.prepareStatement(sql5);
					pst.setString(1, fInicial);
					pst.setString(2, fFinal);
					rs=pst.executeQuery();
				}
			}
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error: cons_ingre");
		}
	}
	
}