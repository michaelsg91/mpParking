package modelo;

import java.sql.*;
import javax.swing.*;

public class conexion {
	private Connection conexion=null;
	public conexion(){
		
	}	
	public Connection getConexion(){
		try{
		conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/mpParking","root","");
		
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "no conectado   "+ e.getMessage());
			 e.printStackTrace();
			 
		}
		return conexion;
	}
}