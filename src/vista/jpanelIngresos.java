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
		setPreferredSize(new Dimension(540,480));
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
		fechainicial.setBounds(50,30,150,30);
		calendario1.setBounds(50, 80, 150, 30);
		fechafinal.setBounds(220, 30, 150, 30);
		calendario2.setBounds(220, 80, 150, 30);
		
		nvehiculo.setBounds(50, 130, 150, 30);
		vehiculo.setBounds(50, 180, 150, 30);
		nplaca.setBounds(220, 130, 150, 30);
		placa.setBounds(220, 180, 150, 30);
		
		nsubtotal.setBounds(50, 230, 150, 30);
		subtotal.setBounds(50, 280, 150, 30);
		niva.setBounds(220, 230, 150, 30);
		iva.setBounds(220, 280, 150, 30);
		
		ntotal.setBounds(100, 330, 150, 30);
		total.setBounds(100, 380, 150, 30);
		
		ok.setBounds(100, 430, 60, 30);
		
		add(calendario1);add(calendario2);add(fechafinal);add(fechainicial);add(ntotal);add(total);add(nvehiculo);add(vehiculo);
		add(ok);add(nsubtotal);add(subtotal);add(niva);add(iva);add(nplaca);add(placa);
	}
}
