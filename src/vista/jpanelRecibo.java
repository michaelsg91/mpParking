package vista;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

public class jpanelRecibo extends JPanel implements Runnable{
	public JLabel nplaca,ntarifa,nfentrada,fentrada,nhentrada,hentrada,ntipoveh,nmarca,ncliente,opcional;
	public JTextField placa,cliente;
	public JComboBox tarifa,tipoveh,marca;
	public JButton ok;
	private Thread hilo;
	private Calendar cal;
	private Date fecha;
	private SimpleDateFormat sm,sm2;
	public jpanelRecibo(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(540,480));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Registro de ingresos"));
		
		//--- Variables Initialization --------------
		nplaca=new JLabel("Placa");
		opcional=new JLabel("Campos opcionales:");
		ntarifa=new JLabel("Tarifa");
		nfentrada=new JLabel("Fecha de entrada");
		fentrada=new JLabel("2017-03-18");
		nhentrada=new JLabel("Hora de entrada");
		hentrada=new JLabel("12:23");
		ntipoveh=new JLabel("Tipo de vehículo");
		nmarca=new JLabel("Marca");
		ncliente=new JLabel("Id cliente");
		tarifa=new JComboBox();
		tipoveh=new JComboBox();
		marca=new JComboBox();
		
		placa=new JTextField();
		cliente=new JTextField();
		
		ok=new JButton("OK");
		
		hilo=new Thread(this);
		
		//--- Location elements -------------
		nplaca.setBounds(30,30,120,30);
		ntipoveh.setBounds(30,80,120,30);
		ntarifa.setBounds(30,130,120,30);

		placa.setBounds(160,30,120,30);
		tipoveh.setBounds(160,80,120,30);
		tarifa.setBounds(160,130,120,30);
		
		opcional.setBounds(310,30,150,30);
		ncliente.setBounds(310,80,90,30);
		nmarca.setBounds(310,130,90,30);
		cliente.setBounds(390,80,120,30);
		marca.setBounds(390,130,120,30);
		
		
		nhentrada.setBounds(65,210,140,30);
		hentrada.setBounds(65,240,140,30);
		
		nfentrada.setBounds(335,210,140,30);
		fentrada.setBounds(335,240,140,30);
		
		ok.setBounds(240,320,60,30);
		
		
		nhentrada.setHorizontalAlignment(JLabel.CENTER);
		hentrada.setHorizontalAlignment(JLabel.CENTER);
		
		nfentrada.setHorizontalAlignment(JLabel.CENTER);
		fentrada.setHorizontalAlignment(JLabel.CENTER);
		
		hilo.start();
		
		add(nplaca);add(ntipoveh);add(ntarifa);add(placa);add(tipoveh);add(tarifa);add(ncliente);add(nmarca);add(cliente);add(marca);
		add(nhentrada);add(hentrada);add(nfentrada);add(fentrada);add(opcional);add(ok);
	}
	
	public void fechahora(){
		 cal = Calendar.getInstance();
		 fecha = cal.getTime();
		 sm = new SimpleDateFormat("yyyy-MM-dd");
		 sm2 = new SimpleDateFormat("HH:mm");
	 }
	
	public void run(){
		Thread ct=Thread.currentThread();
		 while(ct==hilo){
			 fechahora();
			 hentrada.setText(sm2.format(fecha)); 
			 fentrada.setText(sm.format(fecha));
			 try{
				 Thread.sleep(1000);
			 }catch(InterruptedException e){
				 e.printStackTrace();
			 }
		 }
	}
}
