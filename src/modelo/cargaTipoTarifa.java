package modelo;
import java.sql.*;
import javax.swing.JOptionPane;

public class cargaTipoTarifa{
	private conexion conexion;
	public ResultSet rs;
	private Statement st;
	private Connection conecta;
	private final String sql="select tarifa from tipoTar order by idTipoTar";
	
	public cargaTipoTarifa(){
		conexion=new conexion();
	}
	
	public void consulta(){
		conecta=conexion.getConexion();
		try{
			st=conecta.createStatement();
			rs=st.executeQuery(sql);
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Error cargaTipoTar");
		}
	}
}