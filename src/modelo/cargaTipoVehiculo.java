package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class cargaTipoVehiculo {
	private conexion conexion;
	public ResultSet rs;
	private Statement st;
	private Connection conecta;
	private final String sql="select tipoVeh from tipoVeh";
	public cargaTipoVehiculo(){
		conexion=new conexion();
	}
	
	public void consulta(){
		conecta=conexion.getConexion();
		try{
			st=conecta.createStatement();
			rs=st.executeQuery(sql);
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error cargaTipoVehiculo");
		}
	}
}
