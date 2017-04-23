package controlador;
import java.awt.Toolkit;
import java.awt.event.*;
import vista.*;

public class teclaEnter extends KeyAdapter{
	marcoPrincipal mp;
	
	public teclaEnter(marcoPrincipal mp){
		this.mp=mp;
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			if(mp.jpRecibo.placa.isFocusOwner() || mp.jpRecibo.cliente.isFocusOwner()){
				mp.jpRecibo.ok.doClick();	
			}
			if(mp.jpSesion.usuario.isFocusOwner() || mp.jpSesion.contra.isFocusOwner()){
				mp.jpSesion.ok.doClick();
			}
			if(mp.jpTarCamp.valor.isFocusOwner()){
				mp.jpTarCamp.ok.doClick();
			}
			if(mp.jpTarCamp.moto.isFocusOwner() || mp.jpTarCamp.auto.isFocusOwner()){
				mp.jpTarCamp.ok2.doClick();
			}
			if(mp.jpUsuario.usuario.isFocusOwner() || mp.jpUsuario.contra.isFocusOwner()){
				mp.jpUsuario.registrar.doClick();
			}
			if(mp.jpUsuario.nbuscar.isFocusOwner()){
				mp.jpUsuario.buscar.doClick();
			}
			if(mp.jpUsuario.eusuario.isFocusOwner() || mp.jpUsuario.econtra.isFocusOwner() || mp.jpUsuario.ehabilitado.isFocusOwner()){
				mp.jpUsuario.editar.doClick();
			}
			if(mp.jpFactura.total.isFocusOwner()){
				mp.jpFactura.ok.doClick();
			}

		}
		
	}
}
