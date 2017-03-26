package controlador;
import vista.*;
import java.awt.event.*;
import javax.swing.*;
import modelo.*;

public class botonSesion implements ActionListener{
	marcoPrincipal marco;
	private String usu, contra;
	private boolean b;
	public botonSesion(marcoPrincipal marco){
		this.marco=marco;
	}
	
	public void actionPerformed(ActionEvent e){
		if(!marco.jpSesion.usuario.getText().isEmpty() && !marco.jpSesion.contra.getText().isEmpty()){
			usu=marco.jpSesion.usuario.getText();
			contra=marco.jpSesion.contra.getText();
			
			b=marco.iSesion.comprobar(usu, contra);
			
			if(b){
				marco.jpMenu.setVisible(true);
				marco.jpSesion.setVisible(false);
				marco.jpSesion.mensaje.setVisible(false);
				marco.jpSesion.usuario.setText("");
				marco.jpSesion.contra.setText("");
			}else{
				marco.jpSesion.mensaje.setText("<html><p align='center'>Usuario o</p><p align='center'>contraseña invalido</p></html>");
				marco.jpSesion.mensaje.setVisible(true);
			}
		}else{
			marco.jpSesion.mensaje.setText("<html><p align='center'>Rellene los</p><p align='center'>campos requeridos</p></html>");
			marco.jpSesion.mensaje.setVisible(true);
		}
		
		
	}
}
