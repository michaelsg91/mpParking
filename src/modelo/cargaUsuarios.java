package modelo;
import java.sql.*;
import javax.swing.*;

public class cargaUsuarios {
	private conexion conexion;
	public ResultSet rs;
	private PreparedStatement pst;
	private Connection conecta;
	private final String sql="insert into usuarios(usuario,contra,habilitado) values (?,?,1)";
	private final String sql2="select idUsuario,usuario,contra,habilitado from usuarios where usuario=?";
	private final String sql3="update usuarios set usuario=?,contra=?,habilitado=? where idUsuario=?";
	private final String sql4="select usuario,contra,habilitado from usuarios";
	public String idUsu,usuario,contra,habilitado;
	
	public cargaUsuarios(){
		conexion=new conexion();
	}
	
	public void registra(String usu,String contra){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql);
			pst.setString(1, usu);			
			pst.setString(2, contra);
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Usuario ha sido registrado correctamente");
			
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
	
	public void buscar(String usu){
		idUsu="";
		usuario="";
		contra="";
		habilitado="";
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql2);
			pst.setString(1, usu);
			rs=pst.executeQuery();
			while(rs.next()){
				idUsu=rs.getString(1);
				usuario=rs.getString(2);
				contra=rs.getString(3);
				habilitado=rs.getString(4);
			}
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error cargaUsuarios");
		}
		
	}	
	public void actualiza(String usu,String contra,String hab){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql3);
			pst.setString(1, usu);			
			pst.setString(2, contra);
			pst.setString(3, hab);
			pst.setString(4, idUsu);
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Usuario ha sido actualizado correctamente");
			
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "El usuario ya existe");
		}
	}	

	public void ver(){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql4);
			rs=pst.executeQuery();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error cargaUsuarios");
		}
	}
	
}
