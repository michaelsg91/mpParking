package controlador;
import vista.*;
import java.awt.event.*;

public class botonesMenu implements ActionListener{
	marcoPrincipal marco;
	public botonesMenu(marcoPrincipal marco){
		this.marco=marco;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(marco.jpMenu.recibo)){
			marco.jpRecibo.setVisible(true);
			marco.jpFactura.setVisible(false);
			marco.jpIngresos.setVisible(false);
			marco.jpUsuario.setVisible(false);
			marco.jpTarCamp.setVisible(false);			
		}
		if(e.getSource().equals(marco.jpMenu.factura)){
			marco.jpRecibo.setVisible(false);
			marco.jpFactura.setVisible(true);
			marco.jpIngresos.setVisible(false);
			marco.jpUsuario.setVisible(false);
			marco.jpTarCamp.setVisible(false);			
		}
		if(e.getSource().equals(marco.jpMenu.ingresos)){
			marco.jpRecibo.setVisible(false);
			marco.jpFactura.setVisible(false);
			marco.jpIngresos.setVisible(true);
			marco.jpUsuario.setVisible(false);
			marco.jpTarCamp.setVisible(false);			
		}
		if(e.getSource().equals(marco.jpMenu.cambUsu)){
			marco.jpRecibo.setVisible(false);
			marco.jpFactura.setVisible(false);
			marco.jpIngresos.setVisible(false);
			marco.jpUsuario.setVisible(false);
			marco.jpTarCamp.setVisible(false);
			marco.jpMenu.setVisible(false);
			marco.jpSesion.setVisible(true);
			marco.iSesion.cerrarSesion();
		}
		if(e.getSource().equals(marco.jpMenu.confTarCamp)){
			marco.jpRecibo.setVisible(false);
			marco.jpFactura.setVisible(false);
			marco.jpIngresos.setVisible(false);
			marco.jpUsuario.setVisible(false);
			marco.jpTarCamp.setVisible(true);			
		}
		if(e.getSource().equals(marco.jpMenu.confUsu)){
			marco.jpRecibo.setVisible(false);
			marco.jpFactura.setVisible(false);
			marco.jpIngresos.setVisible(false);
			marco.jpUsuario.setVisible(true);
			marco.jpTarCamp.setVisible(false);			
		}
	}
}
