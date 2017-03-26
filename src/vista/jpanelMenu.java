package vista;
import java.awt.*;
import javax.swing.*;

public class jpanelMenu extends JPanel{
	public JButton recibo,factura,ingresos,cambUsu,confTarCamp,confUsu,confCamp;
	public JLabel configurar;
	public jpanelMenu(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(195,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Menú Principal"));
		
		//--- Variables Initialization --------------
		recibo=new JButton("Recibo");
		factura=new JButton("Factura");
		ingresos=new JButton("Ingresos");
		cambUsu=new JButton("Cambiar Usuario");
		confTarCamp=new JButton("Tarifa / Campos");
		confUsu=new JButton("Usuarios");
		confCamp=new JButton("Campos");
		
		configurar=new JLabel("Configurar");
		
		//--- Location elements -------------
		recibo.setBounds(20,30,155,30);
		factura.setBounds(20,70,155,30);
		ingresos.setBounds(20,110,155,30);
		cambUsu.setBounds(20,150,155,30);
		configurar.setBounds(20,190,155,30);
		confTarCamp.setBounds(20,230,155,30);
		confUsu.setBounds(20,270,155,30);
		confCamp.setBounds(20,310,155,30);
		
		configurar.setHorizontalAlignment(JLabel.CENTER);
		
		
		add(recibo);add(factura);add(ingresos);add(cambUsu);add(configurar);add(confTarCamp);add(confUsu);//add(confCamp);
	}
}
