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
		setPreferredSize(new Dimension(540,480));
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
		subtotal=new JLabel();
		iva=new JLabel();
		total=new JLabel();
		hilo=new Thread(this);
		recibo=new JComboBox();
		ok=new JButton("OK");
		
		
		//--- Location elements -------------
		nrecibo.setBounds(30,30,150,30);
		nfsalida.setBounds(30,80,150,30);
		nhsalida.setBounds(30,130,150,30);
		nsubtotal.setBounds(30,180,150,30);
		niva.setBounds(30,230,230,30);
		ntotal.setBounds(30,280,150,30);

		recibo.setBounds(190,30,150,30);
		fsalida.setBounds(190, 80, 150, 30);
		hsalida.setBounds(190, 130, 150, 30);
		subtotal.setBounds(190, 180, 150, 30);
		iva.setBounds(190, 180, 230, 30);
		total.setBounds(190, 280, 150, 30);
		
		ok.setBounds(150,330,60,30);
		
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
