package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.GenericArrayType;
import java.util.Random;

import javax.jws.WebParam.Mode;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class jfrAplicacion extends JFrame {
	private static pnlAplicacion aplicacion;
	private static pnlOpciones opciones;
	private static pnlInformacion informacion;
	
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
	public static  pnlAplicacion getAplicacion() {
		return aplicacion;
	}
	
	public void setAplicacion(pnlAplicacion valor) {
		aplicacion = valor;
	}
	
	public static pnlOpciones getOpciones() {
		return opciones;
	}
	
	public void setOpciones(pnlOpciones valor) {
		opciones = valor;
	}
	
	public static pnlInformacion getInformacion() {
		return informacion;
	}
	
	public void setInformacion(pnlInformacion valor) {
		informacion = valor;
	}
	
	public static class botonLanzarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) { //velocidad, angulo y altura
			getAplicacion().setModelo(new ModeloTiroParabolico(getOpciones().getsubpnlOpciones1().getSlider().getValue(), 
					getOpciones().getsubpnlOpciones2().getSlider().getValue(),
					getOpciones().getsubpnlOpciones3().getSlider().getValue()));
			System.out.println();
			System.out.println("EYSSSS " + getOpciones().getsubpnlOpciones1().getSlider().getValue() + " " +
					getOpciones().getsubpnlOpciones2().getSlider().getValue() + " " +
					getOpciones().getsubpnlOpciones3().getSlider().getValue());
			getAplicacion().getModelo().calcularPuntos();
			//getAplicacion().repaint();
		}
	}
}
