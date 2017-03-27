package vista;
import java.awt.*;
import javax.swing.*;

public class jpanelTarCamp extends JPanel{
	public JPanel panel,panel2;
	private JLabel ntarifa,nvehiculo,nvalor,nauto,nmoto;
	public JComboBox tarifa,vehiculo;
	public JTextField valor,auto,moto;
	public JButton ok,ok2;
	
	public jpanelTarCamp(){
		setPreferredSize(new Dimension(560,360));
		setLayout(null);
		
		panel=new JPanel();
		panel.setBounds(0, 0, 340, 360);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Tarifa"));		
		panel2=new JPanel();
		panel2.setBounds(340, 0, 220, 360);
		panel2.setLayout(null);
		panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Campos"));		
		
		ntarifa=new JLabel("Tipo de Tarifa:");
		nvehiculo=new JLabel("Tipo de Vehículo:");
		nvalor=new JLabel("Valor Tarifa:");
		tarifa=new JComboBox();
		vehiculo=new JComboBox();
		valor=new JTextField();
		ok=new JButton("OK");
		
		nauto=new JLabel("Automovil");
		nmoto=new JLabel("Motocicleta");
		auto=new JTextField();
		moto=new JTextField();
		ok2=new JButton("OK");
		
		ntarifa.setBounds(20,30,150,30);
		tarifa.setBounds(170,30,150,30);
		nvehiculo.setBounds(20,80,150,30);
		vehiculo.setBounds(170, 80, 150, 30);
		nvalor.setBounds(20,130,150,30);
		valor.setBounds(170, 130, 150, 30);
		ok.setBounds(140,190,60,30);
		
		nauto.setBounds(20,30,90,30);
		nmoto.setBounds(20,80,90,30);
		auto.setBounds(120,30,80,30);
		moto.setBounds(120,80,80,30);
		ok2.setBounds(90,140,60,30);
		
				
		panel.add(ntarifa);panel.add(tarifa);panel.add(nvehiculo);panel.add(vehiculo);panel.add(nvalor);panel.add(valor);panel.add(ok);
		panel2.add(auto);panel2.add(moto);panel2.add(nauto);panel2.add(nmoto);panel2.add(ok2);
		
		add(panel);add(panel2);
	}
}
