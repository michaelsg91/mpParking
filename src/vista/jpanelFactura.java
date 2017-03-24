package vista;
import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class jpanelFactura extends JPanel implements Runnable{
	public JLabel nrecibo,nfsalida,nhsalida,fsalida,hsalida,nsubtotal,niva,ntotal,subtotal,iva,total;
	public JComboBox recibo;
	public JButton ok;
	private Thread hilo;
	private Calendar cal;
	private Date fecha;
	private SimpleDateFormat sm,sm2;
	public jpanelFactura(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(560,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Registro de facturas"));
		
		//--- Variables Initialization --------------
		nrecibo=new JLabel("Número de Recibo:");
		nfsalida=new JLabel("Fecha de Salida:");
		nhsalida=new JLabel("Hora de Salida:");
		fsalida=new JLabel();
		hsalida=new JLabel();
		nsubtotal=new JLabel("Subtotal:");
		niva=new JLabel("IVA (19%):");
		ntotal=new JLabel("Total:");
		subtotal=new JLabel("2342344");
		iva=new JLabel("23444");
		total=new JLabel("23423424");
		hilo=new Thread(this);
		recibo=new JComboBox();
		ok=new JButton("OK");
		
		
		//--- Location elements -------------
		nrecibo.setBounds(30,30,150,30);
		recibo.setBounds(190,30,150,30);
		
		nhsalida.setBounds(70,80,140,30);
		hsalida.setBounds(70, 110, 140, 30);
		
		nfsalida.setBounds(340,80,140,30);
		fsalida.setBounds(340, 110, 140, 30);
		
		
		nsubtotal.setBounds(30,180,70,30);
		subtotal.setBounds(110, 180, 150, 30);
		
		niva.setBounds(260,180,70,30);
		iva.setBounds(340,180,150,30);

		ntotal.setBounds(30,240,70,30);		
		total.setBounds(110, 240, 150, 30);
		
		ok.setBounds(250,300,60,30);
		
		nhsalida.setHorizontalAlignment(JLabel.CENTER);
		hsalida.setHorizontalAlignment(JLabel.CENTER);
		
		nfsalida.setHorizontalAlignment(JLabel.CENTER);
		fsalida.setHorizontalAlignment(JLabel.CENTER);
		
		add(nrecibo);add(recibo);add(nfsalida);add(nhsalida);add(fsalida);add(hsalida);add(ok);
		add(nsubtotal);add(niva);add(ntotal);add(subtotal);add(iva);add(total);
		
		hilo.start();
		
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
			 hsalida.setText(sm2.format(fecha)); 
			 fsalida.setText(sm.format(fecha));
			 try{
				 Thread.sleep(1000);
			 }catch(InterruptedException e){
				 e.printStackTrace();
			 }
		 }
		 
	 }
}
