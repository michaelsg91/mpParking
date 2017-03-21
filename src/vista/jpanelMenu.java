package vista;
import java.awt.*;
import javax.swing.*;

public class jpanelMenu extends JPanel{
	public JButton recibo,factura,ingresos,cambUsu,confTar,confUsu,confCamp;
	public JLabel configurar;
	public jpanelMenu(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(230,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Menú Principal"));
		
		//--- Variables Initialization --------------
		recibo=new JButton("Recibo");
		factura=new JButton("Factura");
		ingresos=new JButton("Ingresos");
		cambUsu=new JButton("Cambiar Usuario");
		confTar=new JButton("Tarifa");
		confUsu=new JButton("Usuarios");
		confCamp=new JButton("Campos");
		
		configurar=new JLabel("Configurar");
		
		//--- Location elements -------------
		recibo.setBounds(30,30,170,30);
		factura.setBounds(30,70,170,30);
		ingresos.setBounds(30,110,170,30);
		cambUsu.setBounds(30,150,170,30);
		configurar.setBounds(30,190,170,30);
		confTar.setBounds(30,230,170,30);
		confUsu.setBounds(30,270,170,30);
		confCamp.setBounds(30,310,170,30);
		
		configurar.setHorizontalAlignment(JLabel.CENTER);
		
		
		add(recibo);add(factura);add(ingresos);add(cambUsu);add(configurar);add(confTar);add(confUsu);add(confCamp);
	}
}
