package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.PaintEvent;
import java.lang.reflect.GenericArrayType;
import java.util.Random;

import javax.jws.WebParam.Mode;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import componentes.jlbEspaciado;

public class jfrAplicacion extends JFrame {
	private static pnlAplicacion aplicacion;
	private static pnlOpciones opciones;

	public jfrAplicacion() {
		setAplicacion(new pnlAplicacion());
		setLayout(new BorderLayout());
		setOpciones(new pnlOpciones());
		add(getAplicacion(), BorderLayout.CENTER);
		add(getOpciones(), BorderLayout.SOUTH);
	}

	public static  pnlAplicacion getAplicacion() {
		return aplicacion;
	}

	public static void setAplicacion(pnlAplicacion valor) {
		aplicacion = valor;
	}

	public static pnlOpciones getOpciones() {
		return opciones;
	}

	public void setOpciones(pnlOpciones valor) {
		opciones = valor;
	}

	public static class botonLanzarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) { 
			getAplicacion().getArrayTirosParabolicos().add(new ModeloTiroParabolico(getOpciones().getsubpnlOpciones1().getSlider().getValue(), 
					getOpciones().getsubpnlOpciones2().getSlider().getValue(),
					getOpciones().getsubpnlOpciones3().getSlider().getValue()));

			getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).calcularPuntos();
			getAplicacion().pintarUltimoLanzamiento();

		}
	}
	
	public static class botonBorrarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			getAplicacion().getArrayTirosParabolicos().clear();	
			getAplicacion().repaint();
			
		}
	}
}
