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
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import componentes.jlbEspaciado;

public class jfrAplicacion extends JFrame {
	private static pnlAplicacion aplicacion;
	private static pnlOpciones opciones;
	private static Timer tempo;

	public jfrAplicacion() {
		setAplicacion(new pnlAplicacion());
		tempo = new Timer(100, new timerHandler());
		
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
	
	public static Timer getTempo() {
		return tempo;
	}

	public static class botonLanzarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) { 
			getAplicacion().getArrayTirosParabolicos().add(new ModeloTiroParabolico(Integer.parseInt(getOpciones().getsubpnlOpciones1().getValorp2().getText()), 
					Integer.parseInt(getOpciones().getsubpnlOpciones2().getValorp2().getText()),
					Integer.parseInt(getOpciones().getsubpnlOpciones3().getValorp2().getText())));

			getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).calcularPuntos();
			getAplicacion().pintarUltimoLanzamiento();
		}
	}
	
//Boton Lanzar, Pausar, Reanudar
	public static class buttonsHandler implements ActionListener  {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == getOpciones().getArrayBotones().getLanzar()) {
				System.out.println("LANZANDO");
				getTempo().stop();
				getAplicacion().getArrayTirosParabolicos().add(new ModeloTiroParabolico(getOpciones().getsubpnlOpciones1().getSlider().getValue(), 
						getOpciones().getsubpnlOpciones2().getSlider().getValue(),
						getOpciones().getsubpnlOpciones3().getSlider().getValue()));
				System.out.println("HEYS");
				System.out.println(getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() -1).getVelocidadInicial());
				System.out.println(getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() -1).getAnguloInicial());
				System.out.println(getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() -1).getAlturaInicial());

				
				getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).calcularPuntos();

				getOpciones().getArrayBotones().getLanzar().setText("Lanzar");
				getAplicacion().setContadorBolaMovil(0);
				getTempo().start();
				}
				else if (e.getSource() == getOpciones().getArrayBotones().getPausa()){
					if (getTempo().isRunning()) {
						getTempo().stop();
						getOpciones().getArrayBotones().getPausa().setText("Reanudar");
					}
					else {
						getTempo().start();
						getOpciones().getArrayBotones().getPausa().setText("Pausar");
					}
				} else {
					System.out.println("ERROR!");
			}
		}
	}
	
	public static class timerHandler implements ActionListener {
	//pinta elemento a elemento del camino
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("SEEE");
				//calcula uno por uno
				if(getAplicacion().getContadorBolaMovil() < getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).getPuntos().size()) {
					getAplicacion().pintarPuntoLanzamiento();
					getAplicacion().setContadorBolaMovil(getAplicacion().getContadorBolaMovil() + 1); 
				} else {
					getAplicacion().setContadorBolaMovil(0);
					getTempo().stop();
				}
			}
		}
	
	public static class botonBorrarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			getTempo().stop();
			getAplicacion().getArrayTirosParabolicos().clear();	
			getAplicacion().repaint();
		}
	}
}
