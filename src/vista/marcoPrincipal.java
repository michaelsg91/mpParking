package vista;
import javax.swing.*;
import java.awt.*;

public class marcoPrincipal extends JFrame{
	private jpanelMenu jpMenu;
	private jpanelCampos jpCampos;
	private jpanelRecibo jpRecibo;
	private JPanel izq;
	public marcoPrincipal(){
		jpMenu=new jpanelMenu();
		jpCampos=new jpanelCampos();
		jpRecibo=new jpanelRecibo();
		
		izq=new JPanel();
		izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
		izq.add(jpMenu);
		izq.add(jpCampos);
		
		
		setTitle("MP Parking");
		setResizable(false);
		
		add(izq,BorderLayout.WEST);
		pack();
		add(jpRecibo,BorderLayout.EAST);
		pack();
		
		setLocationRelativeTo(null);
		
		jpRecibo.setVisible(false);
	}
}
