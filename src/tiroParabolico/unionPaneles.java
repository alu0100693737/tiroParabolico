package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class unionPaneles extends JPanel {
	
	private pnlOpciones opciones;
	private pnlInformacion informacion;
	
	public unionPaneles() {
		setPreferredSize(new Dimension(800, 200));
		setLayout(new GridLayout(2, 1, 5, 5));
		setOpciones(new pnlOpciones());
		setInformacion(new pnlInformacion());
		add(getOpciones());
		add(getInformacion());
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
