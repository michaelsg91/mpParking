package vista;
import javax.swing.*;
import java.awt.*;
import controlador.*;
import modelo.*;

public class marcoPrincipal extends JFrame{
	public jpanelMenu jpMenu;
	public jpanelSesion jpSesion;
	public jpanelCampos jpCampos;
	public jpanelRecibo jpRecibo;
	public jpanelFactura jpFactura;
	public jpanelIngresos jpIngresos;
	public jpanelUsuario jpUsuario;
	public jpanelTarCamp jpTarCamp;
	private JPanel jp;
	
	private botonSesion bSesion;
	private botonesMenu bMenu;	
	
	public inicioSesion iSesion;
	public marcoPrincipal(){
		jpCampos=new jpanelCampos();
		jpRecibo=new jpanelRecibo();
		jpFactura=new jpanelFactura();
		jpIngresos=new jpanelIngresos();
		jpUsuario=new jpanelUsuario();
		jpTarCamp=new jpanelTarCamp();
		
		//--- Controlador ----------
		jpMenu=new jpanelMenu();
		jpSesion=new jpanelSesion();
		
		
		//--- Modelo ---------------
		iSesion=new inicioSesion();
		
		
		
		jp=new JPanel();
		jp.setPreferredSize(new Dimension(560,360));
		
		bMenu=new botonesMenu(this);
		bSesion=new botonSesion(this);
			
		setTitle("MP Parking");
		setResizable(false);
		
				
		
		add(jpMenu,BorderLayout.WEST);
		pack();
		pack();
		add(jpSesion,BorderLayout.WEST);
		pack();
		
		

		add(jpCampos,BorderLayout.SOUTH);
		pack();
		
		add(jpRecibo,BorderLayout.CENTER);
		pack();
		add(jpFactura,BorderLayout.CENTER);
		pack();		
		add(jpIngresos,BorderLayout.CENTER);
		pack();
		add(jpTarCamp,BorderLayout.CENTER);
		pack();
		add(jpUsuario,BorderLayout.CENTER);
		pack();
		add(jp,BorderLayout.CENTER);
		pack();
		pack();
		
		
		jpMenu.setVisible(false);
		jpSesion.setVisible(true);
		
		jpRecibo.setVisible(false);
		jpFactura.setVisible(false);
		jpIngresos.setVisible(false);
		jpUsuario.setVisible(false);
		jpTarCamp.setVisible(false);
		
		jpCampos.setVisible(true);

		
		setLocationRelativeTo(null);
		
		//--- Events ------------------------------
		jpMenu.recibo.addActionListener(bMenu);
		jpMenu.factura.addActionListener(bMenu);
		jpMenu.ingresos.addActionListener(bMenu);
		jpMenu.cambUsu.addActionListener(bMenu);
		jpMenu.confTarCamp.addActionListener(bMenu);
		jpMenu.confUsu.addActionListener(bMenu);
		
		jpSesion.ok.addActionListener(bSesion);
		
		

		
	}
}
