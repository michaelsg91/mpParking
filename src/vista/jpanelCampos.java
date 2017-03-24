package vista;

import java.awt.*;
import javax.swing.*;

public class jpanelCampos extends JPanel{
	public JLabel automo,motoci,cantmot,cantcarr;
	public jpanelCampos(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(635,60));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Campos Disponibles"));
		
		//--- Variables Initialization --------------
		automo=new JLabel("Automoviles:");
		motoci=new JLabel("Motocicletas:");
		cantmot=new JLabel("10");
		cantcarr=new JLabel("20");
		
		//--- Location elements -------------
		automo.setBounds(30,20,100,20);
		cantcarr.setBounds(160,20,100,20);
		
		motoci.setBounds(290,20,100,20);
		cantmot.setBounds(420,20,100,20);
		
		
		add(automo);add(motoci);add(cantcarr);add(cantmot);
	}
	
}
