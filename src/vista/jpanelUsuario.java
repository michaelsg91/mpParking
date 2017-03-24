package vista;
import java.awt.Dimension;

import javax.swing.*;

public class jpanelUsuario extends JPanel{
	public JLabel nusuario,ncontra,neusuario,necontra,nehabilitado,id;
	public JTextField usuario,contra,nbuscar,eusuario,econtra,ehabilitado;
	public JButton registrar,buscar,editar,ver;
	public JTextArea area;
	private JScrollPane barras;
	private JPanel panel,panel2,panel3;
	public jpanelUsuario(){
		setPreferredSize(new Dimension(560,360));
		setLayout(null);
		
		panel=new JPanel();
		panel.setBounds(0, 0, 300, 160);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Registrar"));		
		panel2=new JPanel();
		panel2.setBounds(0, 160, 300, 200);
		panel2.setLayout(null);
		panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Editar"));
		panel3=new JPanel();
		panel3.setBounds(300, 0, 260, 360);
		panel3.setLayout(null);
		panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Ususarios"));
		
		nusuario=new JLabel("Usuario:");
		ncontra=new JLabel("Contraseña:");
		neusuario=new JLabel("Usuario");
		necontra=new JLabel("Contraseña");
		nehabilitado=new JLabel("Habilitado");
		id=new JLabel("");
	
		usuario=new JTextField();
		contra=new JTextField();
		nbuscar=new JTextField();
		eusuario=new JTextField();
		econtra=new JTextField();
		ehabilitado=new JTextField();
		
		registrar=new JButton("Registrar");
		buscar=new JButton("Buscar");
		editar=new JButton("Editar");
		ver=new JButton("Ver");
		
		area=new JTextArea(300,240);
		barras=new JScrollPane(area);
		area.setLineWrap(true);
		area.setEditable(false);
		
		
		barras.setBounds(10, 20, 240, 290);	
		
		nusuario.setBounds(20, 20, 90, 30);
		usuario.setBounds(130, 20, 150, 30);
		ncontra.setBounds(20,60,90,30);
		contra.setBounds(130,60,150,30);
		registrar.setBounds(100,110,100,30);
		
		nbuscar.setBounds(20, 20, 150, 30);
		buscar.setBounds(190, 20, 90, 30);
		neusuario.setBounds(20, 50, 100, 30);
		necontra.setBounds(160, 50, 100, 30);
		
		nehabilitado.setBounds(20, 120, 80, 30);
		ehabilitado.setBounds(120, 120, 40, 30);
		
		
		eusuario.setBounds(20, 80, 130, 30);
		econtra.setBounds(160, 80, 130, 30);
		
		editar.setBounds(20, 150, 80, 30);
		
		ver.setBounds(10, 320, 60, 30);
		
		
		panel.add(nusuario);panel.add(usuario);panel.add(ncontra);panel.add(contra);panel.add(registrar);	
		panel2.add(buscar);panel2.add(nbuscar);panel2.add(neusuario);panel2.add(necontra);panel2.add(nehabilitado);
		panel2.add(eusuario);panel2.add(econtra);panel2.add(ehabilitado);panel2.add(editar);
		panel3.add(barras);panel3.add(ver);
		
		add(panel);add(panel2);add(panel3);		
		
	}
}
