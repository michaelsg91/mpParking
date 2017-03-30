package controlador;
import vista.*;
import modelo.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class botonIngresos implements ActionListener{
	marcoPrincipal mp;
	private Date fecha1,fecha2;
	private SimpleDateFormat sm;
	private String fInicial,fFinal,tipoVeh,placa;
	
	public botonIngresos(marcoPrincipal mp){
		this.mp=mp;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(mp.jpIngresos.vehiculo)){
			
			
			tipoVeh=(String)mp.jpIngresos.vehiculo.getSelectedItem();
			
			if(tipoVeh!=null){
				mp.cIngresos.recibeTipo(tipoVeh);
				mp.cIngresos.consulta();
				
				try{
					mp.jpIngresos.placa.removeAllItems();
					mp.jpIngresos.placa.addItem("Todas");
					while(mp.cIngresos.rs3.next()){
						mp.jpIngresos.placa.addItem(mp.cIngresos.rs3.getString(1));
					}
				}catch(Exception el){
					JOptionPane.showMessageDialog(null, "Error: botonIngresos"+el.getMessage());
				}
			}
			
			
		}
		
		if(e.getSource().equals(mp.jpIngresos.ok)){

			if(mp.jpIngresos.calendario1.getDate()!=null && mp.jpIngresos.calendario2.getDate()!=null){
			fecha1=mp.jpIngresos.calendario1.getDate();
			fecha2=mp.jpIngresos.calendario2.getDate();
			sm=new SimpleDateFormat("yyyy-MM-dd");		
			fInicial=sm.format(fecha1);
			fFinal=sm.format(fecha2);
			
			tipoVeh=(String)mp.jpIngresos.vehiculo.getSelectedItem();
			placa=(String)mp.jpIngresos.placa.getSelectedItem();
			
			mp.cIngresos.filtrar(fInicial, fFinal, placa);
			try{
				while(mp.cIngresos.rs.next()){
					mp.jpIngresos.subtotal.setText(mp.cIngresos.rs.getString(1) + " $");
					mp.jpIngresos.iva.setText(mp.cIngresos.rs.getString(2) + " $");
					mp.jpIngresos.total.setText(mp.cIngresos.rs.getString(3) + " $");				
				}
			}catch(Exception el){
				JOptionPane.showMessageDialog(null, "Error: botonIngresos");
			}
		}else{
			JOptionPane.showMessageDialog(null, "Elija las fechas");
		}	
		}
	}
}
