package vista;
import javax.swing.*;
import java.awt.*;

public class marcoPrincipal extends JFrame{
	private jpanelMenu jpMenu;
	private jpanelCampos jpCampos;
	private jpanelRecibo jpRecibo;
	private jpanelFactura jpFactura;
	private jpanelIngresos jpIngresos;
	private jpanelUsuario jpUsuario;
	private jpanelTarCamp jpTarCamp;
	public marcoPrincipal(){
		jpMenu=new jpanelMenu();
		jpCampos=new jpanelCampos();
		jpRecibo=new jpanelRecibo();
		jpFactura=new jpanelFactura();
		jpIngresos=new jpanelIngresos();
		jpUsuario=new jpanelUsuario();
		jpTarCamp=new jpanelTarCamp();
			
		setTitle("MP Parking");
		setResizable(false);
		
		add(jpMenu,BorderLayout.WEST);
		pack();
		
		add(jpRecibo,BorderLayout.CENTER);
		pack();
		pack();
		add(jpFactura,BorderLayout.CENTER);
		pack();		
		add(jpIngresos,BorderLayout.CENTER);
		pack();
		add(jpUsuario,BorderLayout.CENTER);
		pack();
		add(jpTarCamp,BorderLayout.CENTER);
		pack();
		add(jpCampos,BorderLayout.SOUTH);
		pack();
		
		
		setLocationRelativeTo(null);
		
		jpRecibo.setVisible(false);
		jpFactura.setVisible(false);
		jpIngresos.setVisible(false);
		jpUsuario.setVisible(false);
		//jpTarCamp.setVisible(false);
	}
}
