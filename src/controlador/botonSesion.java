package controlador;
import vista.*;
import java.awt.event.*;

public class botonSesion implements ActionListener{
	marcoPrincipal marco;
	public botonSesion(marcoPrincipal marco){
		this.marco=marco;
	}
	
	public void actionPerformed(ActionEvent e){
		marco.jpMenu.setVisible(true);
		marco.jpSesion.setVisible(false);
	}
}
