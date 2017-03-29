package controlador;
import modelo.*;
import vista.*;
import javax.swing.*;
import java.awt.event.*;

public class botonesUsuarios implements ActionListener{
	marcoPrincipal mp;
	private String usu,contra,nombre,hab;
	public botonesUsuarios(marcoPrincipal mp){
		this.mp=mp;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(mp.jpUsuario.registrar)){
			if(!mp.jpUsuario.usuario.getText().isEmpty() && !mp.jpUsuario.contra.getText().isEmpty()){
				usu=mp.jpUsuario.usuario.getText();
				contra=mp.jpUsuario.contra.getText();
				
				mp.cUsuarios.registra(usu, contra);
				
				mp.jpUsuario.usuario.setText("");;
				mp.jpUsuario.contra.setText("");
			}else{
				JOptionPane.showMessageDialog(null, "Ingrese los valores solicitados");
			}
		}
		
		if(e.getSource().equals(mp.jpUsuario.buscar)){
			if(!mp.jpUsuario.nbuscar.getText().isEmpty()){
				nombre=mp.jpUsuario.nbuscar.getText();
				
				mp.cUsuarios.buscar(nombre);
				
				if(mp.cUsuarios.idUsu.equals("")){
					JOptionPane.showMessageDialog(null, "Usuario no encontrado");
					mp.jpUsuario.editar.setEnabled(false);
				}else{
					mp.jpUsuario.editar.setEnabled(true);
				}
				
				if(mp.cUsuarios.idUsu.equals("1")){
					mp.jpUsuario.ehabilitado.setEditable(false);
				}else{
					mp.jpUsuario.ehabilitado.setEditable(true);
				}
				
				mp.jpUsuario.eusuario.setText(mp.cUsuarios.usuario);
				mp.jpUsuario.econtra.setText(mp.cUsuarios.contra);
				mp.jpUsuario.ehabilitado.setText(mp.cUsuarios.habilitado);
				
			}else{
				JOptionPane.showMessageDialog(null, "Ingrese los valores solicitados");
			}
		}
		
		if(e.getSource().equals(mp.jpUsuario.editar)){
			if(!mp.jpUsuario.eusuario.getText().isEmpty() && !mp.jpUsuario.econtra.getText().isEmpty() && !mp.jpUsuario.ehabilitado.getText().isEmpty()){
				usu=mp.jpUsuario.eusuario.getText();
				contra=mp.jpUsuario.econtra.getText();
				hab=mp.jpUsuario.ehabilitado.getText();
				
				mp.cUsuarios.actualiza(usu, contra, hab);
				
			}else{
				JOptionPane.showMessageDialog(null, "Ingrese los valores solicitados");
			}
		}
		
		if(e.getSource().equals(mp.jpUsuario.ver)){
			mp.jpUsuario.area.setText("");
			
			mp.cUsuarios.ver();
			try{
				while(mp.cUsuarios.rs.next()){
					mp.jpUsuario.area.append(mp.cUsuarios.rs.getString(1)+" - "+mp.cUsuarios.rs.getString(2)+" - "+mp.cUsuarios.rs.getString(3)+"\n");
				}
			}catch(Exception el){
				JOptionPane.showMessageDialog(null, "Error botonesUsuarios");
			}
		}
	}
		
}
