package controlador;
import vista.*;
import java.awt.event.*;
import javax.swing.*;
import modelo.*;

public class botonSesion implements ActionListener{
	marcoPrincipal mp;
	private String usu, contra;
	private boolean b;
	public botonSesion(marcoPrincipal mp){
		this.mp=mp;
	}
	
	public void actionPerformed(ActionEvent e){
		if(!mp.jpSesion.usuario.getText().isEmpty() && !mp.jpSesion.contra.getText().isEmpty()){
			usu=mp.jpSesion.usuario.getText();
			contra=mp.jpSesion.contra.getText();
			
			b=mp.iSesion.comprobar(usu, contra);
			
			if(b){
				mp.jpMenu.setVisible(true);
				mp.jpSesion.setVisible(false);
				mp.jpSesion.mensaje.setVisible(false);
				mp.jpSesion.usuario.setText("");
				mp.jpSesion.contra.setText("");
				if(mp.iSesion.online.equals("1")){
					mp.jpMenu.confUsu.setVisible(true);
					mp.jpMenu.confTarCamp.setVisible(true);
					mp.jpMenu.configurar.setVisible(true);
					mp.jpFactura.total.setEditable(true);
				}else{
					mp.jpMenu.confUsu.setVisible(false);
					mp.jpMenu.confTarCamp.setVisible(false);
					mp.jpMenu.configurar.setVisible(false);
					mp.jpFactura.total.setEditable(false);
				}
			}else{
				mp.jpSesion.mensaje.setText("<html><p align='center'>Usuario o</p><p align='center'>contraseña invalido</p></html>");
				mp.jpSesion.mensaje.setVisible(true);
			}
		}else{
			mp.jpSesion.mensaje.setText("<html><p align='center'>Rellene los</p><p align='center'>campos requeridos</p></html>");
			mp.jpSesion.mensaje.setVisible(true);
		}
		
		
	}
}
