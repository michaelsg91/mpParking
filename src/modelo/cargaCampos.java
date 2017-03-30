package modelo;
import java.sql.*;
import javax.swing.*;

public class cargaCampos{
	private conexion conexion;
	public ResultSet rs,rs2;
	private PreparedStatement pst;
	private Connection conecta;
	private final String sql="select cantidad from campos where idTipoVeh=1";
	private final String sql2="select cantidad from campos where idTipoVeh=2";
	private final String sql3="update campos set cantidad=? where idTipoVeh=1";
	private final String sql4="update campos set cantidad=? where idTipoVeh=2";
	private final String sql5="select count(idTipoVeh) from recibo where idRecibo not in(select idRecibo from factura) and idTipoVeh=1";
	private final String sql6="select count(idTipoVeh) from recibo where idRecibo not in(select idRecibo from factura) and idTipoVeh=2";
	public String cantVeh,cantMot;
	public int dispAutos,dispMotos,ocupAutos,ocupMotos;
	public cargaCampos(){
		conexion=new conexion();
	}
	
	public void consulta(){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				cantVeh=rs.getString(1);
			}
			pst=conecta.prepareStatement(sql2);
			rs=pst.executeQuery();
			while(rs.next()){
				cantMot=rs.getString(1);
			}
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error cargaCampos");
		}
	}
	
	public void actualiza(String veh,String mot){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql3);
			pst.setString(1, veh);
			pst.executeUpdate();
			
			pst=conecta.prepareStatement(sql4);			
			pst.setString(1, mot);
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto");
		}
	
	}
	
	public void disponibles(){
		conecta=conexion.getConexion();
		ocupAutos=0;
		ocupMotos=0;
		try{
			pst=conecta.prepareStatement(sql5);
			rs2=pst.executeQuery();
			while(rs2.next()){
				ocupAutos=rs2.getInt(1);
			}
			pst=conecta.prepareStatement(sql6);
			rs2=pst.executeQuery();
			while(rs2.next()){
				ocupMotos=rs2.getInt(1);
			}
			
			dispAutos=Integer.parseInt(cantVeh)-ocupAutos;
			dispMotos=Integer.parseInt(cantMot)-ocupMotos;
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error cargaCampos");
		}
	}

}
