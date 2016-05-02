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

	private final static int MARGEN = 50;
	private final static int PALITO = 5;
	private final static int RADIO = 5;
	private final static int RANGORGB = 255;
	private final static int FILTRORGB = 50;
	private ModeloTiroParabolico modelo;
	private ArrayList<ModeloTiroParabolico> arrayTirosParabolicos;

	public pnlAplicacion() {
		setPreferredSize(new Dimension(800, 500));
		arrayTirosParabolicos = new ArrayList<ModeloTiroParabolico>();
	}
	
	public pnlAplicacion(double velocidad, int angulo, int altura) {
		setPreferredSize(new Dimension(800, 500));
		arrayTirosParabolicos = new ArrayList<ModeloTiroParabolico>();
		//creamos un primer tiro
		getArrayTirosParabolicos().add(new ModeloTiroParabolico(velocidad, angulo, altura));
		getArrayTirosParabolicos().get(getArrayTirosParabolicos().size() - 1).calcularPuntos();
		getArrayTirosParabolicos().add(new ModeloTiroParabolico(40, 20, 54));
		getArrayTirosParabolicos().get(getArrayTirosParabolicos().size() - 1).calcularPuntos();
	}

	public ArrayList<ModeloTiroParabolico> getArrayTirosParabolicos() {
		return arrayTirosParabolicos;
	}

	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		pintarEjes(g);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		pintarEjes(g);
	}
	

	public void pintarEjes(Graphics g) {
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
		Random aux = new Random();
		Color colorNuevo = new Color(Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB);
		g2.setColor(colorNuevo);
		System.out.println("Tamano " + getArrayTirosParabolicos().size());
		for (int i = 0; i < getArrayTirosParabolicos().get(getArrayTirosParabolicos().size() - 1).getPuntos().size(); i++) {
			g2.fillOval(MARGEN + getArrayTirosParabolicos().get(getArrayTirosParabolicos().size() - 1).getPuntos().get(i).x, getHeight() - MARGEN - getArrayTirosParabolicos().get(getArrayTirosParabolicos().size() - 1).getPuntos().get(i).y, RADIO, RADIO);
		}
		g2.setColor(Color.BLACK);
	}
}
