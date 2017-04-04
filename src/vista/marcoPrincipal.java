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
	private accionVentana cRecibo;
	private botonTarifa bTarifa;
	private botonCampos bCampos;
	private botonesUsuarios bUsuarios;
	private botonRecibo bRecibo;
	private comboFactura comFactura;
	private botonIngresos bIngresos;
	private teclaEnter tEnter;
	private validacionCajas vCajas;

	//--- Modelo ---------------
	public inicioSesion iSesion;
	public cargaTipoVehiculo cTipoVeh;
	public cargaTipoTarifa cTipoTar;
	public cargaMarca cMarca;
	public cargaTarifa cTarifa;
	public cargaCampos cCampos;
	public cargaUsuarios cUsuarios;
	public ingresaRecibo iRecibo;
	public cargaFactura cFactura;
	public cargaIngresos cIngresos;
	
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
		cRecibo=new accionVentana(this);
		bTarifa=new botonTarifa(this);
		bCampos=new botonCampos(this);
		bUsuarios=new botonesUsuarios(this);
		bRecibo=new botonRecibo(this);
		comFactura=new comboFactura(this);
		bIngresos=new botonIngresos(this);
		tEnter=new teclaEnter(this);
		vCajas=new validacionCajas(this);
		
		//--- Modelo ---------------
		iSesion=new inicioSesion();
		cTipoVeh=new cargaTipoVehiculo();
		cTipoTar=new cargaTipoTarifa();
		cMarca=new cargaMarca();
		cTarifa=new cargaTarifa();
		cCampos=new cargaCampos();
		cUsuarios=new cargaUsuarios();
		iRecibo=new ingresaRecibo();
		cFactura=new cargaFactura();
		cIngresos=new cargaIngresos();
		
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
		addWindowListener(cRecibo);
		
		//--- Events ------------------------------
		jpMenu.recibo.addActionListener(bMenu);
		jpMenu.factura.addActionListener(bMenu);
		jpMenu.ingresos.addActionListener(bMenu);
		jpMenu.cambUsu.addActionListener(bMenu);
		jpMenu.confTarCamp.addActionListener(bMenu);
		jpMenu.confUsu.addActionListener(bMenu);
		
		jpSesion.ok.addActionListener(bSesion);
		jpRecibo.tipoveh.addActionListener(cRecibo);
		jpTarCamp.ok.addActionListener(bTarifa);
		jpTarCamp.tarifa.addActionListener(bTarifa);
		jpTarCamp.vehiculo.addActionListener(bTarifa);
		
		jpTarCamp.ok2.addActionListener(bCampos);
		
		jpUsuario.buscar.addActionListener(bUsuarios);
		jpUsuario.registrar.addActionListener(bUsuarios);
		jpUsuario.editar.addActionListener(bUsuarios);
		jpUsuario.ver.addActionListener(bUsuarios);
		
		jpRecibo.ok.addActionListener(bRecibo);
		
		jpFactura.recibo.addActionListener(comFactura);
		jpFactura.ok.addActionListener(comFactura);
		
		jpIngresos.ok.addActionListener(bIngresos);
		jpIngresos.vehiculo.addActionListener(bIngresos);
		
		jpSesion.usuario.addKeyListener(tEnter);
		jpSesion.contra.addKeyListener(tEnter);
		
		jpRecibo.placa.addKeyListener(tEnter);
		jpRecibo.cliente.addKeyListener(tEnter);
		
		jpTarCamp.valor.addKeyListener(tEnter);
		
		jpTarCamp.moto.addKeyListener(tEnter);
		jpTarCamp.auto.addKeyListener(tEnter);
		
		jpUsuario.usuario.addKeyListener(tEnter);
		jpUsuario.contra.addKeyListener(tEnter);
		
		jpUsuario.nbuscar.addKeyListener(tEnter);
		
		jpUsuario.eusuario.addKeyListener(tEnter);
		jpUsuario.econtra.addKeyListener(tEnter);
		jpUsuario.ehabilitado.addKeyListener(tEnter);
		
		jpSesion.usuario.addKeyListener(vCajas);
		jpSesion.contra.addKeyListener(vCajas);
		
		jpRecibo.placa.addKeyListener(vCajas);
		jpRecibo.cliente.addKeyListener(vCajas);
		
		jpTarCamp.valor.addKeyListener(vCajas);
		
		jpTarCamp.moto.addKeyListener(vCajas);
		jpTarCamp.auto.addKeyListener(vCajas);
		
		jpUsuario.usuario.addKeyListener(vCajas);
		jpUsuario.contra.addKeyListener(vCajas);
		
		jpUsuario.nbuscar.addKeyListener(vCajas);
		
		jpUsuario.eusuario.addKeyListener(vCajas);
		jpUsuario.econtra.addKeyListener(vCajas);
		jpUsuario.ehabilitado.addKeyListener(vCajas);
		
		
	}
}
