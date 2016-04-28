package tiroParabolico;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class jfrAplicacion extends JFrame {
	private pnlAplicacion aplicacion;
	private pnlOpciones opciones;
	private pnlInformacion informacion;
	
	public jfrAplicacion() {
		setLayout(new GridLayout(3, 1, 5, 5));
		setAplicacion(new pnlAplicacion());
		setOpciones(new pnlOpciones());
		setInformacion(new pnlInformacion());
		getAplicacion().setBackground(Color.RED);
		add(getAplicacion());
		add(getOpciones());
		add(getInformacion());
	}
	
	public pnlAplicacion getAplicacion() {
		return aplicacion;
	}
	
	public void setAplicacion(pnlAplicacion valor) {
		aplicacion = valor;
	}
	
	public pnlOpciones getOpciones() {
		return opciones;
	}
	
	public void setOpciones(pnlOpciones valor) {
		opciones = valor;
	}
	
	public pnlInformacion getInformacion() {
		return informacion;
	}
	
	public void setInformacion(pnlInformacion valor) {
		informacion = valor;
	}

}
