package controlador;
import java.awt.event.*;
import vista.*;
import java.sql.*;

import javax.swing.JOptionPane;

public class botonCampos implements ActionListener{
	marcoPrincipal mp;
	private String cantVeh,cantMot;
	public botonCampos(marcoPrincipal mp){
		this.mp=mp;
	}
	
	public void actionPerformed(ActionEvent e){
		if(!mp.jpTarCamp.auto.getText().isEmpty() && !mp.jpTarCamp.auto.getText().isEmpty()){
			cantVeh=mp.jpTarCamp.auto.getText();
			cantMot=mp.jpTarCamp.moto.getText();
			
			mp.cCampos.actualiza(cantVeh, cantMot);
		}else{
			JOptionPane.showMessageDialog(null, "Ingrese el valor solicitado");
		}
			
	}
		
	
}
