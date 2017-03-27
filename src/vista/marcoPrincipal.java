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
	

	//--- Controlador ----------
	private botonSesion bSesion;
	private botonesMenu bMenu;
	private combosRecibo cRecibo;

	//--- Modelo ---------------
	public inicioSesion iSesion;
	public cargaTipoVehiculo cTipoVeh;
	public cargaTipoTarifa cTipoTar;
	public cargaMarca cMarca;
	
	public marcoPrincipal(){
		jpCampos=new jpanelCampos();
		jpRecibo=new jpanelRecibo();
		jpFactura=new jpanelFactura();
		jpIngresos=new jpanelIngresos();
		jpUsuario=new jpanelUsuario();
		jpTarCamp=new jpanelTarCamp();
		jpMenu=new jpanelMenu();
		jpSesion=new jpanelSesion();
		
		//--- Controlador ----------
		bMenu=new botonesMenu(this);
		bSesion=new botonSesion(this);
		cRecibo=new combosRecibo(this);
		
		//--- Modelo ---------------
		iSesion=new inicioSesion();
		cTipoVeh=new cargaTipoVehiculo();
		cTipoTar=new cargaTipoTarifa();
		cMarca=new cargaMarca();
		
		
		jp=new JPanel();
		jp.setPreferredSize(new Dimension(560,360));
		
		
			
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
		addWindowFocusListener(cRecibo);
		
		//--- Events ------------------------------
		jpMenu.recibo.addActionListener(bMenu);
		jpMenu.factura.addActionListener(bMenu);
		jpMenu.ingresos.addActionListener(bMenu);
		jpMenu.cambUsu.addActionListener(bMenu);
		jpMenu.confTarCamp.addActionListener(bMenu);
		jpMenu.confUsu.addActionListener(bMenu);
		
		jpSesion.ok.addActionListener(bSesion);
		jpRecibo.tipoveh.addActionListener(cRecibo);
		

		
	}
}
