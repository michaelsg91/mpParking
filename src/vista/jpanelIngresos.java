package vista;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

public class jpanelIngresos extends JPanel{
	public JDateChooser calendario1,calendario2;
	public JLabel fechafinal,fechainicial,ntotal,total,nvehiculo,nplaca,nsubtotal,subtotal,niva,iva;
	public JComboBox vehiculo,placa;
	public JButton ok;
	public jpanelIngresos(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(560,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Ingresos"));
		
		//--- Variables Initialization --------------
		calendario1=new JDateChooser();
		calendario2=new JDateChooser();
		fechainicial=new JLabel("Fecha Inicial");
		fechafinal=new JLabel("Fecha Final");
		ntotal=new JLabel("Total");
		nplaca=new JLabel("Placa");
		nsubtotal=new JLabel("Subtotal");
		niva=new JLabel("IVA");
		nvehiculo=new JLabel("Tipo de Vehiculo");
		subtotal=new JLabel("15999");		
		iva=new JLabel("12455");
		total=new JLabel("399993910");
		
		vehiculo=new JComboBox();
		placa=new JComboBox();
		
		ok=new JButton("OK");
		
		//--- Location elements -------------
		fechainicial.setBounds(90,30,150,30);
		calendario1.setBounds(90, 70, 150, 30);
		fechafinal.setBounds(290, 30, 150, 30);
		calendario2.setBounds(290, 70, 150, 30);
		
		nvehiculo.setBounds(90, 120, 150, 30);
		vehiculo.setBounds(90, 160, 150, 30);
		nplaca.setBounds(290, 120, 150, 30);
		placa.setBounds(290, 160, 150, 30);
		
		nsubtotal.setBounds(50, 220, 150, 30);
		subtotal.setBounds(50, 250, 150, 30);
		niva.setBounds(220, 220, 150, 30);
		iva.setBounds(220, 250, 150, 30);
		
		ntotal.setBounds(390, 220, 150, 30);
		total.setBounds(390, 250, 150, 30);
		
		ok.setBounds(250,300,60,30);
		
		add(calendario1);add(calendario2);add(fechafinal);add(fechainicial);add(ntotal);add(total);add(nvehiculo);add(vehiculo);
		add(ok);add(nsubtotal);add(subtotal);add(niva);add(iva);add(nplaca);add(placa);
	}
}
