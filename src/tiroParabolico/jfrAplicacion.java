package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.jws.WebParam.Mode;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class jfrAplicacion extends JFrame {
	private pnlAplicacion aplicacion;
	private pnlOpciones opciones;
	private pnlInformacion informacion;
	
	public jfrAplicacion(double velocidad, int angulo, int altura) {
		setAplicacion(new pnlAplicacion(velocidad, angulo, altura));
		setInformacion(new pnlInformacion(velocidad));
		setLayout(new BorderLayout());
		setOpciones(new pnlOpciones(velocidad, angulo, altura));
		add(getAplicacion(), BorderLayout.CENTER);
		add(getOpciones(), BorderLayout.SOUTH);
		add(getInformacion(), BorderLayout.EAST);
	}
	
public static class lanzar implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			/*getpnlAplicacion().
			getVentana().getpnlOpciones().gettxtIntroducir().setBackground(colorNuevo);
			getVentana().getpnlOpciones().getArrayButones().getColor().setBackground(colorNuevo);
		*/}	
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
