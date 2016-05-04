package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PaintContext;
import java.awt.Rectangle;
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
		//add(getInformacion().getTiempo());

	/*	getPosicionX().add(new etiqueta("x = "));
		getPosicionX().add(jlbgetValorX());
		getPosicionX().add(new etiqueta("m"));
		add(getPosicionX());

		getPosicionY().add(new etiqueta("y = "));
		getPosicionY().add(jlbgetValorY());
		getPosicionY().add(new etiqueta("m"));
		add(getPosicionY());

		getVelocidadX().add(new etiqueta("vx = "));
		getVelocidadX().add(jlbgetVX());
		getVelocidadX().add(new etiqueta("m/s"));
		add(getVelocidadX());

		getVelocidadY().add(new etiqueta("vy = "));
		getVelocidadY().add(jlbgetVY());
		getVelocidadY().add(new etiqueta("m/s"));
		add(getVelocidadY());

		getVelocidad().add(new etiqueta("v = "));
		getVelocidad().add(jlbgetV());
		getVelocidad().add(new etiqueta("m/s"));
		add(getVelocidad());

		getYMax().add(new etiqueta("ymax = "));
		getYMax().add(jlbgetYMax());
		getYMax().add(new etiqueta("m"));
		add(getYMax());
		*/
		
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
