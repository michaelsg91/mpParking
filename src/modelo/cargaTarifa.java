package modelo;
import java.sql.*;
import javax.swing.*;

public class cargaTarifa {
	private conexion conexion;
	public ResultSet rs;
	private PreparedStatement pst;
	private Connection conecta;
	private final String sql="select idTipoVeh,idTipoTar from tipoTar,tipoVeh where tipoVeh=? and tarifa=?";
	private final String sql2="select valorTarifa from tarifa where idTipoVeh=? and idTipoTar=?";
	private final String sql3="update tarifa set valorTarifa=? where idTipoVeh=? and idTipoTar=?";
	private String idVeh,idTar;
	public cargaTarifa(){
		conexion=new conexion();
	}
	
	public void consulta(String veh,String tar){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql);
			pst.setString(1, veh);
			pst.setString(2, tar);
			rs=pst.executeQuery();
			while(rs.next()){
				idVeh=rs.getString(1);
				idTar=rs.getString(2);
			}
			pst=conecta.prepareStatement(sql2);
			pst.setString(1, idVeh);
			pst.setString(2, idTar);
			rs=pst.executeQuery();
			
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error cargaTarifa");
		}
	}
	
	public void actualiza(String valor){
		//System.out.println(idVeh + "  " + idTar + " " + valor);
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql3);
			pst.setString(1, valor);
			pst.setString(2, idVeh);
			pst.setString(3, idTar);
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
			
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto");
		}
		
	}
}
