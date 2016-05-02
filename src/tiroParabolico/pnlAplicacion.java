package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JPanel;

public class pnlAplicacion extends JPanel {

	private final static int MARGEN = 50;
	private final static int PALITO = 5;
	private final static int RADIO = 5;

	private final static int RANGORGB = 255;
	private final static int FILTRORGB = 50;

	private ModeloTiroParabolico modelo;

	public pnlAplicacion(double velocidad, int angulo, int altura) {
		setPreferredSize(new Dimension(800, 500));
		//inicializamos el modelo
		setModelo(new ModeloTiroParabolico(velocidad, angulo, altura));
		getModelo().calcularPuntos();
	}

	public ModeloTiroParabolico getModelo() {
		return modelo;
	}

	public void setModelo(ModeloTiroParabolico valor) {
		modelo = valor;
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
	}
	public void paint(Graphics g){ 
		Graphics2D g2 = (Graphics2D) g.create();
		g2.drawLine(MARGEN, getHeight() - MARGEN, MARGEN, MARGEN); 
		g2.drawLine(MARGEN, getHeight() - MARGEN, getWidth() - MARGEN, getHeight() - MARGEN ); 
		for (int i = MARGEN; i < (getWidth() - MARGEN ); i+=10) {
			g2.drawLine(i, getHeight() - MARGEN, i, getHeight() - MARGEN + PALITO);

			if(i % 50 == 0) {
				g2.drawString( Integer.toString((i/10)) + "0", MARGEN - 10 + i, getHeight() - MARGEN + 3 * PALITO);
			}
		}

		for (int i = (getHeight() - MARGEN); i > MARGEN; i-=10) {
			g2.drawLine(MARGEN, i, MARGEN - PALITO, i);
			if((getHeight()- i) % 50 == 0) {
				g2.drawString(Integer.toString((i/10)) + "0", MARGEN - 30, getHeight() - i - MARGEN + PALITO);
			}
		}
		for (int i = 0; i < getModelo().getPuntos().size(); i++) {
			g2.fillOval(MARGEN + getModelo().getPuntos().get(i).x, getHeight() - MARGEN - getModelo().getPuntos().get(i).y, RADIO, RADIO);
		}
	}

	public void pintarLanzamiento() {
		Graphics g2 = getGraphics();
		Random aux = new Random();
		Color colorNuevo = new Color(Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB);
		g2.setColor(colorNuevo);
		for (int i = 0; i < getModelo().getPuntos().size(); i++) {
			g2.fillOval(MARGEN + getModelo().getPuntos().get(i).x, getHeight() - MARGEN - getModelo().getPuntos().get(i).y, RADIO, RADIO);
		}
		g2.setColor(Color.BLACK);
	}
}
