package modelo;

import java.sql.*;

public class cargaMarca {
	private conexion conexion;
	public ResultSet rs;
	private PreparedStatement pst;
	private final String sql2="select marca from marca where idTipoVeh=?";
	private final String sql="select idTipoVeh from tipoVeh where tipoVeh=?";
	private String idTipoVeh;
	private Connection conecta;
	
	public cargaMarca(){
		conexion=new conexion();
	}
	
	public void consulta(String tipoVeh){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql);
			pst.setString(1, tipoVeh);
			rs=pst.executeQuery();
			while(rs.next()){
				idTipoVeh=rs.getString(1);
			}
			
			pst=conecta.prepareStatement(sql2);
			pst.setString(1, idTipoVeh);
			rs=pst.executeQuery();
			
		}catch(SQLException e){
			
		}
	}
}
