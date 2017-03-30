package modelo;
import java.sql.*;
import javax.swing.*;

public class inicioSesion {
	private conexion conexion;
	private ResultSet rs;
	private PreparedStatement pst;
	private final String sql="select idUsuario from usuarios where usuario=? and contra=?";
	private final String sql2="select contra,habilitado from usuarios where usuario=?";
	private final String sql3="update usuarios set enLinea=1 where idUsuario=?";
	private final String sql4="update usuarios set enLinea=0 where idUsuario=?";
	private final String sql5="select idUsuario from usuarios where enLinea=1";
	private Connection conecta;
	public boolean b;
	public String contra,habilitado,id,online;
	public inicioSesion(){
		conexion=new conexion();
	}
	
	public boolean comprobar(String usu,String contra){
		b=false;
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql);
			pst.setString(1, usu);
			pst.setString(2, contra);
			rs=pst.executeQuery();
			
			while(rs.next()){
				id=rs.getString(1);
				b=true;
			}
			
			pst=conecta.prepareStatement(sql2);
			pst.setString(1, usu);
			rs=pst.executeQuery();
			
			while(rs.next()){
				this.contra=rs.getString(1);
				habilitado=rs.getString(2);
				if(this.contra.equals(contra) && habilitado.equals("1")){
					b=true;
				}else{
					b=false;
				}
			}
			
			if(b){
				pst=conecta.prepareStatement(sql3);
				pst.setString(1, id);
				pst.executeUpdate();
				
				pst=conecta.prepareStatement(sql5);
				rs=pst.executeQuery();
				while(rs.next()){
					online=rs.getString(1);
				}
			}
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error inicioSesion");
		}
		return b;
	}
	
	public void cerrarSesion(){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql4);
			pst.setString(1, id);
			pst.executeUpdate();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error inicioSesion");
		}
	}
	

}
