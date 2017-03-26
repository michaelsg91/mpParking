package vista;
import java.awt.Dimension;

import javax.swing.*;

public class jpanelSesion extends JPanel{
	private JLabel nusuario,ncontra,sesion;
	public JLabel mensaje;
	public JTextField usuario;
	public JPasswordField contra;
	public JButton ok;
	public jpanelSesion(){
		//--- Panel properties --------------------
		setPreferredSize(new Dimension(195,360));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Iniciar Sesión"));
		
		nusuario=new JLabel("Usuario");
		ncontra=new JLabel("Contraseña");
		sesion=new JLabel("Iniciar como:");
		mensaje=new JLabel("");
		
		usuario=new JTextField();
		contra=new JPasswordField();
		ok=new JButton("OK");
		
		sesion.setBounds(20,30,155,30);
		nusuario.setBounds(20,70,155,30);
		usuario.setBounds(20,110,155,30);
		ncontra.setBounds(20,150,155,30);
		contra.setBounds(20,190,155,30);
		ok.setBounds(67,240,60,30);
		mensaje.setBounds(20,290,165,50);
		
		mensaje.setVisible(false);
		mensaje.setHorizontalAlignment(JLabel.CENTER);
		
		add(sesion);add(nusuario);add(usuario);add(ncontra);add(contra);add(ok);add(mensaje);

	}
}
