package controlador;
import java.awt.event.*;
import javax.swing.JOptionPane;
import vista.*;
import modelo.*;

public class botonRecibo implements ActionListener{
	marcoPrincipal mp;
	private String idVeh,idUsu,tipoTar,tipoVeh,fecha,hora,marca,idCliente;
	public botonRecibo(marcoPrincipal mp){
		this.mp=mp;
	}
	public void actionPerformed(ActionEvent e){
		if(!mp.jpRecibo.placa.getText().isEmpty()){
			tipoVeh=mp.jpRecibo.tipoveh.getSelectedItem().toString();
			
			if(mp.cCampos.dispMotos==0 && tipoVeh.equals("Motocicleta")){
				JOptionPane.showMessageDialog(null, "No puede registrar más motocicletas. Campos llenos.");
			}else if(mp.cCampos.dispAutos==0 && tipoVeh.equals("Automovil")){
				JOptionPane.showMessageDialog(null, "No puede registrar más automoviles. Campos llenos.");
			}else{
			
			idVeh=mp.jpRecibo.placa.getText().toUpperCase();
			
			idUsu=mp.iSesion.online;
			tipoTar=mp.jpRecibo.tarifa.getSelectedItem().toString();
			fecha=mp.jpRecibo.fentrada.getText();
			hora=mp.jpRecibo.hentrada.getText();
			marca=mp.jpRecibo.marca.getSelectedItem().toString();
			idCliente=mp.jpRecibo.cliente.getText();
			if(idCliente.equals(""))idCliente=null;
			if(marca.equals("---  Selecciona  ---"))marca=null;
			
			mp.iRecibo.ingresa(idVeh, idUsu, tipoTar, tipoVeh, fecha, hora, marca, idCliente);
			mp.jpRecibo.placa.setText("");
			mp.jpRecibo.cliente.setText("");
			}
		}else{
			JOptionPane.showMessageDialog(null, "Ingrese la placa del vehículo");
		}
	}
}
