package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class pnlAplicacion extends JPanel {
	
	private final static int MARGEN = 50;
	private final static int PALITO = 5;
	private final static int RADIO = 5;
	
	private ModeloTiroParabolico modelo;
	
	public pnlAplicacion(double velocidad, int angulo, int altura) {
		setPreferredSize(new Dimension(800, 500));
	//inicializamos el modelo
			setModelo(new ModeloTiroParabolico(velocidad, angulo, altura));
	}
	
	public ModeloTiroParabolico getModelo() {
		return modelo;
	}
	
	public void setModelo(ModeloTiroParabolico valor) {
		modelo = valor;
	}
	
	public void paint(Graphics g){ 
		    Graphics2D g2 = (Graphics2D) g.create();
		     System.out.println(getWidth()  + " " + getHeight());
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
		    
		    pintarLanzamiento(g2);
	}
	
	public void pintarLanzamiento(Graphics2D g2) {
		getModelo().calcularPuntos();
		for (int i = 0; i < getModelo().getPuntos().size(); i++) {
			g2.drawOval(MARGEN + getModelo().getPuntos().get(i).x, getHeight() - MARGEN - (int)getModelo().getAlturaInicial() - getModelo().getPuntos().get(i).y, RADIO, RADIO);
			
		}
	}
}
