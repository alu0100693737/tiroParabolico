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
	
	public pnlAplicacion() {
		setPreferredSize(new Dimension(800, 500));
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
	}
}
