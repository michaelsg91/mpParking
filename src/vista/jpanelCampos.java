package vista;

import java.awt.*;
import javax.swing.*;

public class jpanelCampos extends JPanel{
	public JLabel automo,motoci,cantmot,cantcarr;
	public jpanelCampos(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(230,120));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Campos Disponibles"));
		
		//--- Variables Initialization --------------
		automo=new JLabel("Automoviles:");
		motoci=new JLabel("Motocicletas:");
		cantmot=new JLabel("10");
		cantcarr=new JLabel("20");
		
		//--- Location elements -------------
		automo.setBounds(30,30,100,30);
		motoci.setBounds(30,70,100,30);
		cantcarr.setBounds(160,30,80,30);
		cantmot.setBounds(160,70,80,30);
		
		
		add(automo);add(motoci);add(cantcarr);add(cantmot);
	}
	
}
