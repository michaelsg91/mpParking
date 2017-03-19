package vista;
import javax.swing.*;
import java.awt.*;

public class marcoPrincipal extends JFrame{
	private jpanelMenu jpMenu;
	private JPanel izq;
	public marcoPrincipal(){
		jpMenu=new jpanelMenu();
		
		izq=new JPanel();
		izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
		izq.add(jpMenu);
		
		
		setTitle("MP Parking");
		setResizable(false);
		
		add(izq,BorderLayout.WEST);
		pack();
		
		setLocationRelativeTo(null);
	}
}
