/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase panel para la representacion de la solucion, uso de 
 * grafica, panel de informacion y bola
 */

package tiroParabolico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

public class pnlAplicacion extends JPanel {

	final static int MARGEN = 50;
	private final static int PALITO = 5;
	private final static int RADIO = 7;
	private final static int RANGORGB = 255;
	private final static int FILTRORGB = 50;
	private Color colorBola;
	private int contadorBolaMovil;
	private boolean esPintarRastro;
	
	private ModeloTiroParabolico modelo;
	private ArrayList<ModeloTiroParabolico> arrayTirosParabolicos;

	public pnlAplicacion() {
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(700, 400));
		setSize(new Dimension(700, 400));
		arrayTirosParabolicos = new ArrayList<ModeloTiroParabolico>();
	}

	public ArrayList<ModeloTiroParabolico> getArrayTirosParabolicos() {
		return arrayTirosParabolicos;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		pintarEjes(g);
	}

	public void pintarEjes(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(MARGEN, getHeight() - MARGEN, MARGEN, MARGEN); 
		g.drawLine(MARGEN, getHeight() - MARGEN, getWidth() - MARGEN, getHeight() - MARGEN ); 
		for (int i = MARGEN; i < (getWidth() - MARGEN ); i+=10) {
			g.drawLine(i, getHeight() - MARGEN, i, getHeight() - MARGEN + PALITO);
			if(i % 50 == 0) {
				g.drawString( Integer.toString((i/10)) + "0", MARGEN - 10 + i, getHeight() - MARGEN + 3 * PALITO);
			}
		}

		for (int i = (getHeight() - MARGEN); i > MARGEN; i-=10) {
			g.drawLine(MARGEN, i, MARGEN - PALITO, i);
			if((getHeight()- i) % 50 == 0) {
				g.drawString(Integer.toString((i/10)) + "0", MARGEN - 30, getHeight() - i - MARGEN + PALITO);
			}
		}
	}
	
	public void pintarUltimoLanzamiento() {
		Graphics g2 = getGraphics();
		setColorBola();
		g2.setColor(getColorBola());
		while(getContadorBolaMovil() < getArrayTirosParabolicos().get(getArrayTirosParabolicos().size() - 1).getPuntos().size()) {
			pintarPuntoLanzamiento();
			setContadorBolaMovil(getContadorBolaMovil() + 1); 
		}
		setContadorBolaMovil(0);
	}
	
	public void pintarPuntoLanzamiento() {
		Graphics g2 = getGraphics();
		
		if(!getpintarRastro())
			paint(g2);
		g2.setColor(getColorBola());
		g2.fillOval(MARGEN + getArrayTirosParabolicos().get(getArrayTirosParabolicos().size() - 1).getPuntos().get(getContadorBolaMovil()).x, getHeight() - MARGEN - getArrayTirosParabolicos().get(getArrayTirosParabolicos().size() - 1).getPuntos().get(getContadorBolaMovil()).y, RADIO, RADIO);
	}
	
	public int getContadorBolaMovil() {
		return contadorBolaMovil;
	}
	
	public void setContadorBolaMovil(int valor) {
		contadorBolaMovil = valor;
	}
	
	public Color getColorBola() {
		return colorBola;
	}
	
	public void setColorBola() {
		Random aux = new Random();
		colorBola = new Color(Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB);
	}
	
	public boolean getpintarRastro() {
		return esPintarRastro;
	}
	
	public void setpintarRastro(boolean valor) {
		esPintarRastro = valor;
	}
}
