package vista;
import javax.swing.*;
import java.awt.*;

public class marcoPrincipal extends JFrame{
	private jpanelMenu jpMenu;
	private jpanelCampos jpCampos;
	private JPanel izq;
	public marcoPrincipal(){
		jpMenu=new jpanelMenu();
		jpCampos=new jpanelCampos();
		
		izq=new JPanel();
		izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
		izq.add(jpMenu);
		izq.add(jpCampos);
		
		
		setTitle("MP Parking");
		setResizable(false);
		
		add(izq,BorderLayout.WEST);
		pack();
		
		setLocationRelativeTo(null);
	}
}
