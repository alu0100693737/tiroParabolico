package tiroParabolico;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;

import tiroParabolico.jfrAplicacion;
import tiroParabolico.jfrAplicacion.botonLanzarListener;

public class botonContainer {
	ArrayList<boton> botones;
	private  static boton lanzar;
	private static boton pausa;
	private static boton borrar;

	public botonContainer() {
		botones = new ArrayList<boton>();
		lanzar = new boton("Lanzar");
		pausa = new boton("Pausa");
		borrar = new boton("Borrar");

		getLanzar().setName("Lanzar");
		getPausa().setName("Pausa");
		getBorrar().setName("Borrar");

		getLanzar().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		getPausa().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		getBorrar().setFont(new Font("Comic Sans MS", Font.BOLD, 18));

		getLanzar().addActionListener(new jfrAplicacion.buttonsHandler());
		getPausa().addActionListener(new jfrAplicacion.buttonsHandler());;
		getBorrar().addActionListener(new jfrAplicacion.botonBorrarListener());

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

	public boton getBorrar() {
		return borrar;
	}

	public ArrayList<boton> getArraybtn() {
		return botones;
	}
}
