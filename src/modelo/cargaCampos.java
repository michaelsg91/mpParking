package modelo;
import java.sql.*;
import javax.swing.*;

public class cargaCampos{
	private conexion conexion;
	public ResultSet rs;
	private PreparedStatement pst;
	private Connection conecta;
	private final String sql="select cantidad from campos where idTipoVeh=1";
	private final String sql2="select cantidad from campos where idTipoVeh=2";
	private final String sql3="update campos set cantidad=? where idTipoVeh=1";
	private final String sql4="update campos set cantidad=? where idTipoVeh=2";
	public String cantVeh,cantMot;
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

}
