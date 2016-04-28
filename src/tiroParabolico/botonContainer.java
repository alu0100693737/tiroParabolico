package tiroParabolico;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;

public class botonContainer {
	ArrayList<JButton> botones;
	private boton lanzar;
	private boton pausa;
	private boton borrar;
	
	public botonContainer() {
		botones = new ArrayList<JButton>();
		lanzar = new boton("Lanzar");
		pausa = new boton("Pausa");
		borrar = new boton("Borrar");
		
		getLanzar().setName("Lanzar");
		getPausa().setName("Pausa");
		getBorrar().setName("Borrar");
		
		getLanzar().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		getPausa().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		getBorrar().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		
		getArraybtn().add(getLanzar());
		getArraybtn().add(getPausa());
		getArraybtn().add(getBorrar());
	}

	public boton getLanzar() {
		return lanzar;
	}
	
	public boton getPausa() {
		return pausa;
	}
	
	public JButton getBorrar() {
		return borrar;
	}
	
	public ArrayList<JButton> getArraybtn() {
		return botones;
	}
}
