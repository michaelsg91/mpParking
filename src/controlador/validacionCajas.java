package controlador;
import java.awt.event.*;
import vista.*;

public class validacionCajas extends KeyAdapter{
	marcoPrincipal mp;
	private char c;
	public validacionCajas(marcoPrincipal mp){
		this.mp=mp;
	}
	public void keyTyped(KeyEvent e){
		c=e.getKeyChar();
		if(mp.jpRecibo.placa.isFocusOwner()){
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9') && c!='-')e.consume();
			if(mp.jpRecibo.placa.getText().length()==7)e.consume();
		}
		
		if(mp.jpRecibo.cliente.isFocusOwner()){
			if(c<'0' || c>'9')e.consume();
			if(mp.jpRecibo.cliente.getText().length()==10)e.consume();
		}
		
		if(mp.jpSesion.usuario.isFocusOwner()){
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))e.consume();
			if(mp.jpSesion.usuario.getText().length()==18)e.consume();
		}

		if(mp.jpSesion.contra.isFocusOwner()){
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))e.consume();
			if(	mp.jpSesion.contra.getText().length()==18)e.consume();
		}
		if(mp.jpUsuario.usuario.isFocusOwner()){
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))e.consume();
			if(mp.jpUsuario.usuario.getText().length()==18)e.consume();
		}
		if(mp.jpUsuario.contra.isFocusOwner()){
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))e.consume();
			if(mp.jpUsuario.contra.getText().length()==18)e.consume();
		}
		if(mp.jpUsuario.nbuscar.isFocusOwner()){
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))e.consume();
			if(mp.jpUsuario.nbuscar.getText().length()==18)e.consume();
		}	
		if(mp.jpUsuario.eusuario.isFocusOwner()){
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))e.consume();
			if(mp.jpUsuario.eusuario.getText().length()==18)e.consume();
		}
		if(mp.jpUsuario.econtra.isFocusOwner()){
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9'))e.consume();
			if(mp.jpUsuario.econtra.getText().length()==18)e.consume();
		}
		
		if(mp.jpTarCamp.valor.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
			if(mp.jpTarCamp.valor.getText().length()==15)e.consume();
		}
		if(mp.jpFactura.total.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
			if(mp.jpFactura.total.getText().length()==15)e.consume();
		}
		if(mp.jpTarCamp.moto.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
			if(mp.jpTarCamp.moto.getText().length()==6)e.consume();
		}
		if(mp.jpTarCamp.auto.isFocusOwner()){
			if((c<'0' || c>'9') && c!='.')e.consume();
			if(mp.jpTarCamp.auto.getText().length()==6)e.consume();
		}
		
		if(mp.jpUsuario.ehabilitado.isFocusOwner()){
			if(mp.jpUsuario.ehabilitado.getText().length()==1)e.consume();
			if(c!='1' && c!='0')e.consume();
				
		}
	}
}
