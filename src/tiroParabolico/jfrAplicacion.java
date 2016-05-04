/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase ventana de la aplicacion tiro parabolico
 */
package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
 
public class jfrAplicacion extends JFrame {
	private static pnlAplicacion aplicacion;
	private static pnlOpciones opciones;
	private static Timer tempo;
	private static pnlInformacion informacion;

	public jfrAplicacion() {
		setAplicacion(new pnlAplicacion());
		tempo = new Timer(100, new timerHandler());

		setLayout(new BorderLayout());
		
		setInformacion(new pnlInformacion());
		add(getInformacion());
		
		setOpciones(new pnlOpciones());
		add(getAplicacion(), BorderLayout.CENTER);
		add(getInformacion(), BorderLayout.EAST);
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
	
	public static pnlInformacion getInformacion() {
		return informacion;
	}

	public void setInformacion(pnlInformacion valor) {
		informacion = valor;
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
				if(getOpciones().getsubpnlOpciones2().getCheckBox().getState()) {
					getAplicacion().setpintarRastro(true);
				} else {
					getAplicacion().setpintarRastro(false);
				}
				getAplicacion().setColorBola();
				getTempo().stop();
				getAplicacion().getArrayTirosParabolicos().add(new ModeloTiroParabolico(Integer.parseInt(getOpciones().getsubpnlOpciones1().getValorp2().getText()), 
						Integer.parseInt(getOpciones().getsubpnlOpciones2().getValorp2().getText()),
						Integer.parseInt(getOpciones().getsubpnlOpciones3().getValorp2().getText())));

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
			//calcula uno por uno
			if(getAplicacion().getContadorBolaMovil() < getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).getPuntos().size()) {
				getAplicacion().pintarPuntoLanzamiento();
				getAplicacion().setContadorBolaMovil(getAplicacion().getContadorBolaMovil() + 1);  
				
				getInformacion().jlbsetValorTiempo(Math.floor(getAplicacion().getContadorBolaMovil() * 0.1 * 100) / 100);
				getInformacion().jlbsetValorX(getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).getPuntos().get(getAplicacion().getContadorBolaMovil()).x);
				getInformacion().jlbsetValorY(getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).getPuntos().get(getAplicacion().getContadorBolaMovil()).y);
				getInformacion().jlbsetVX(Math.floor(getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).getVelocidadInicialX()));
				getInformacion().jlbsetVY(Math.floor(getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).getVelocidadInicialY()));
				getInformacion().jlbsetV(Math.floor(getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).getCalcularVelocidad(Math.floor(getAplicacion().getContadorBolaMovil() * 0.1))));
				getInformacion().jlbsetYMax(Math.floor(getAplicacion().getArrayTirosParabolicos().get(getAplicacion().getArrayTirosParabolicos().size() - 1).getYMax()));

				getInformacion().actualizarPanelesInfo();
				
				
				/*
				getInformacion().jlbgetValorTiempo().repaint();
			*/
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
			getOpciones().getArrayBotones().getPausa().setText("Pausar");
			getAplicacion().getArrayTirosParabolicos().clear();	
			//getAplicacion().repaint();
		}
	}
}
