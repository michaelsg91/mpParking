package controlador;
import modelo.*;
import vista.*;
import java.awt.event.*;

public class comboFactura implements ActionListener{
	marcoPrincipal mp;
	private String idRecibo,subtotal,iva,total,idUsuario;
	public comboFactura(marcoPrincipal mp){
		this.mp=mp;
	}
	
	public void actionPerformed(ActionEvent e){
		idRecibo=(String)mp.jpFactura.recibo.getSelectedItem();	
		
		if(e.getSource().equals(mp.jpFactura.recibo)){

			
			
			if(idRecibo!=null){
				
				mp.cFactura.proceso(idRecibo);
				mp.jpFactura.subtotal.setText(""+mp.cFactura.subtotal);
				mp.jpFactura.iva.setText(""+mp.cFactura.iva);
				mp.jpFactura.total.setText(""+mp.cFactura.total);
			}else{
				mp.jpFactura.subtotal.setText("");
				mp.jpFactura.iva.setText("");
				mp.jpFactura.total.setText("");
			}
		}
		
		if(e.getSource().equals(mp.jpFactura.ok)){
			
			subtotal=mp.jpFactura.subtotal.getText();
			iva=mp.jpFactura.iva.getText();
			total=mp.jpFactura.total.getText();
			idUsuario=mp.iSesion.online;
			
			mp.cFactura.ingresa(idRecibo, idUsuario, subtotal, iva, total);
		}
	}
}
