package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class jfrAplicacion extends JFrame {
	private pnlAplicacion aplicacion;
	private pnlOpciones opciones;
	
	public jfrAplicacion() {
		setLayout(new BorderLayout(5, 5));
		setAplicacion(new pnlAplicacion());
		setOpciones(new pnlOpciones());
		add(getAplicacion(), BorderLayout.CENTER);
		add(getOpciones(), BorderLayout.SOUTH);
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
}
