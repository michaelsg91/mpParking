package modelo;
import java.sql.*;

import javax.swing.JOptionPane;

public class ingresaRecibo {
	private conexion conexion;
	public ResultSet rs;
	private PreparedStatement pst;
	private Connection conecta;
	private final String sql="select idTipoTar from tipoTar where tarifa=?";
	private final String sql2="select idTipoVeh from tipoVeh where tipoVeh=?";
	private final String sql3="select idMarca from marca where marca=?";
	private final String sql4="insert into recibo (idVeh,idUsuario,idTipoTar,idTipoVeh,fechaEntrada,horaEntrada,idMarca,idCliente) values (?,?,?,?,?,?,?,?)";
	public String idTipoTar,idTipoVeh,idMarca;
	public ingresaRecibo(){
		conexion=new conexion();
	}
	
	public void ingresa(String idVeh,String idUsu,String tipoTar,String tipoVeh,String fecha,String hora,String marca,String idCliente){
		conecta=conexion.getConexion();
		try{
			pst=conecta.prepareStatement(sql);
			pst.setString(1, tipoTar);
			rs=pst.executeQuery();
			while(rs.next()){
				idTipoTar=rs.getString(1);
			}
			pst=conecta.prepareStatement(sql2);
			pst.setString(1, tipoVeh);
			rs=pst.executeQuery();
			while(rs.next()){
				idTipoVeh=rs.getString(1);
			}
			pst=conecta.prepareStatement(sql3);
			pst.setString(1, marca);
			rs=pst.executeQuery();
			while(rs.next()){
				idMarca=rs.getString(1);
			}
			pst=conecta.prepareStatement(sql4);
			pst.setString(1, idVeh);
			pst.setString(2, idUsu);
			pst.setString(3, idTipoTar);
			pst.setString(4, idTipoVeh);
			pst.setString(5, fecha);
			pst.setString(6, hora);
			pst.setString(7, idMarca);
			pst.setString(8, idCliente);
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "El recibo ha sido registrado con éxito");
			
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
}
