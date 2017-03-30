package controlador;
import java.awt.event.*;
import vista.*;
import java.sql.*;

public class accionVentana extends WindowAdapter implements ActionListener{
	marcoPrincipal mp;
	private String tipoVeh;
	public accionVentana(marcoPrincipal mp){
		this.mp=mp;
	}
	public void windowGainedFocus(WindowEvent e){
		mp.cTipoVeh.consulta();
		mp.cTipoTar.consulta();
		mp.cCampos.consulta();
		mp.cFactura.consulta();
		mp.jpTarCamp.auto.setText(mp.cCampos.cantVeh);
		mp.jpTarCamp.moto.setText(mp.cCampos.cantMot);
		mp.jpRecibo.tipoveh.removeAllItems();
		mp.jpRecibo.tarifa.removeAllItems();
		mp.jpTarCamp.vehiculo.removeAllItems();
		mp.jpTarCamp.tarifa.removeAllItems();
		mp.jpFactura.recibo.removeAllItems();
		mp.jpIngresos.vehiculo.removeAllItems();
		
		mp.jpIngresos.vehiculo.addItem("Ambos");
		try{
			while(mp.cTipoVeh.rs.next()){
				mp.jpRecibo.tipoveh.addItem(mp.cTipoVeh.rs.getString(1));
				mp.jpTarCamp.vehiculo.addItem(mp.cTipoVeh.rs.getString(1));
				mp.jpIngresos.vehiculo.addItem(mp.cTipoVeh.rs.getString(1));
			}
			while(mp.cTipoTar.rs.next()){
				mp.jpRecibo.tarifa.addItem(mp.cTipoTar.rs.getString(1));
				mp.jpTarCamp.tarifa.addItem(mp.cTipoTar.rs.getString(1));
			}
			while(mp.cFactura.rs2.next()){
				mp.jpFactura.recibo.addItem(mp.cFactura.rs2.getString(1));				
			}
		
		}catch(SQLException ex){
			
		}
	}
	
	public void windowClosing(WindowEvent e){
		mp.iSesion.cerrarSesion();
		System.out.println("Cerraste la ventana");
	}
	
	public void actionPerformed(ActionEvent e){
		tipoVeh=(String)mp.jpRecibo.tipoveh.getSelectedItem();
		mp.cMarca.consulta(tipoVeh);
		
		mp.jpRecibo.marca.removeAllItems();
		mp.jpRecibo.marca.addItem("---  Selecciona  ---");
		try{
			while(mp.cMarca.rs.next()){
				mp.jpRecibo.marca.addItem(mp.cMarca.rs.getString(1));
			}
		
		}catch(SQLException ex){}
	}
}
