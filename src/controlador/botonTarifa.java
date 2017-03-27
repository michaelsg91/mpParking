package controlador;
import java.awt.event.*;
import vista.*;
import modelo.*;
import javax.swing.*;

public class botonTarifa implements ActionListener{
	marcoPrincipal mp;
	private String idTar,idVeh,valor;
	public botonTarifa(marcoPrincipal mp){
		this.mp=mp;
	}
	public void actionPerformed(ActionEvent e){
		idTar=(String)mp.jpTarCamp.tarifa.getSelectedItem();
		idVeh=(String)mp.jpTarCamp.vehiculo.getSelectedItem();
		
		
		if(e.getSource().equals(mp.jpTarCamp.ok)){
			if(!mp.jpTarCamp.valor.getText().isEmpty()){
				valor=mp.jpTarCamp.valor.getText();
				mp.cTarifa.actualiza(valor);			
				
			}else{
				JOptionPane.showMessageDialog(null, "Ingrese el valor solicitado");
			}
		}
		
		mp.cTarifa.consulta(idVeh, idTar);
		try{	
			while(mp.cTarifa.rs.next()){
				mp.jpTarCamp.valor.setText(mp.cTarifa.rs.getString(1));
			}
		}catch(Exception er){
			JOptionPane.showMessageDialog(null, "Error botonTarifa");
		}
		
		
		
		}
		
		
	

}
