package tiroParabolico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pnlInformacion extends JPanel {
	
	private final static etiqueta TIEMPO = new etiqueta("t = ");
	private final static etiqueta X = new etiqueta("x = ");
	private final static etiqueta Y = new etiqueta("y = ");
	private final static etiqueta VX = new etiqueta("vx = ");
	private final static etiqueta VY = new etiqueta("vy = ");
	private final static etiqueta VELOCIDAD = new etiqueta("v = ");
	private final static etiqueta YMAX = new etiqueta("y-max = ");
	private final static etiqueta SEGUNGOS = new etiqueta("s");
	private final static etiqueta METROS = new etiqueta("m");
	private final static etiqueta METROS_SEGUNDO = new etiqueta("m/s");
	
	private subpanelinfo tiempo, posicionX, posicionY, velocidadX, velocidadY, velocidad, YMax;
	private etiqueta valorTiempo, valorX, valorY, vx, vy, v, y_max;
	
	public pnlInformacion(double vel) {
		setLayout(new GridLayout(7, 1));
		setPreferredSize(new Dimension(200, 80));
		setBorder(BorderFactory.createLineBorder(Color.black));
		tiempo = new subpanelinfo();
		posicionX = new subpanelinfo();
		posicionY = new subpanelinfo();
		velocidadX = new subpanelinfo();
		velocidadY = new subpanelinfo();
		velocidad = new subpanelinfo();
		YMax = new subpanelinfo();
		jlbsetValorTiempo(vel); 
		jlbsetValorX(0); jlbsetValorY(0);
		jlbsetVX(0); jlbsetVY(0);
		jlbsetV(0); jlbsetYMax(0);
		
		getTiempo().add(new etiqueta("t = "));
		getTiempo().add(jlbgetValorTiempo());
		getTiempo().add(new etiqueta("s"));
		add(getTiempo());
		
		getPosicionX().add(new etiqueta("x = "));
		getPosicionX().add(jlbgetValorX());
		getPosicionX().add(new etiqueta("m"));
		add(getPosicionX());
		
		getPosicionY().add(new etiqueta("y"));
		getPosicionY().add(jlbgetValorY());
		getPosicionY().add(new etiqueta("m"));
		add(getPosicionY());
		
		getVelocidadX().add(new etiqueta("vx"));
		getVelocidadX().add(jlbgetVX());
		getVelocidadX().add(new etiqueta("m/s"));
		add(getVelocidadX());
		
		getVelocidadY().add(new etiqueta("vy"));
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
	}
	
	public etiqueta jlbgetValorTiempo() {
		return valorTiempo;
	}
	
	public void jlbsetValorTiempo(double tiempo) {
		valorTiempo = new etiqueta(String.valueOf(tiempo));
	}
	
	public etiqueta jlbgetValorX() {
		return valorX;
	}
	
	public void jlbsetValorX(int valor) {
		valorX = new etiqueta(String.valueOf(valor));
	}
	
	public etiqueta jlbgetValorY() {
		return valorY;
	}
	
	public void jlbsetValorY(int valor) {
		valorY = new etiqueta(String.valueOf(valor));
	}
	
	public etiqueta jlbgetVX() {
		return vx;
	}
	
	public void jlbsetVX(double valor) {
		vx = new etiqueta(String.valueOf(valor));
	}
	
	public etiqueta jlbgetVY() {
		return vy;
	}
	
	public void jlbsetVY(double valor) {
		vy = new etiqueta(String.valueOf(valor));
	}
	
	public etiqueta jlbgetV() {
		return v;
	}
	
	public void jlbsetV(double valor) {
		v = new etiqueta(String.valueOf(valor));
	}
	
	public etiqueta jlbgetYMax() {
		return y_max;
	}
	
	public void jlbsetYMax(double valor) {
		y_max = new etiqueta(String.valueOf(valor));
	}
	
	public subpanelinfo getTiempo() {
		return tiempo;
	}
	
	public subpanelinfo getPosicionX() {
		return posicionX;
	}
	
	public subpanelinfo getPosicionY() {
		return posicionY;
	}
	
	public subpanelinfo getVelocidadX() {
		return velocidadX;
	}
	
	public subpanelinfo getVelocidadY() {
		return velocidadY;
	}
	
	public subpanelinfo getVelocidad() {
		return velocidad;
	}
	
	public subpanelinfo getYMax() {
		return YMax;
	}
}
