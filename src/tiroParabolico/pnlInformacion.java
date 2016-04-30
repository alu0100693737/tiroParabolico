package tiroParabolico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pnlInformacion extends JPanel {
	
	private final static JLabel TIEMPO = new JLabel("t = ");
	private final static JLabel X = new JLabel("x = ");
	private final static JLabel Y = new JLabel("y = ");
	private final static JLabel VX = new JLabel("vx = ");
	private final static JLabel VY = new JLabel("vy = ");
	private final static JLabel VELOCIDAD = new JLabel("v = ");
	private final static JLabel YMAX = new JLabel("y-max = ");
	private final static JLabel SEGUNGOS = new JLabel("s");
	private final static JLabel METROS = new JLabel("m");
	private final static JLabel METROS_SEGUNDO = new JLabel("m/s");
	
	private JPanel tiempo, posicionX, posicionY, velocidadX, velocidadY, velocidad, YMax;
	private JLabel valorTiempo, valorX, valorY, vx, vy, v, y_max;
	
	public pnlInformacion(double vel) {
		setLayout(new GridLayout(7, 1));
		setBorder(BorderFactory.createLineBorder(Color.black));
		tiempo = new JPanel();
		posicionX = new JPanel();
		posicionY = new JPanel();
		velocidadX = new JPanel();
		velocidadY = new JPanel();
		velocidad = new JPanel();
		YMax = new JPanel();
		jlbsetValorTiempo(vel); 
		jlbsetValorX(0); jlbsetValorY(0);
		jlbsetVX(0); jlbsetVY(0);
		jlbsetV(0); jlbsetYMax(0);
		
		getTiempo().add(TIEMPO);
		getTiempo().add(jlbgetValorTiempo());
		getTiempo().add(SEGUNGOS);
		add(getTiempo());
		
		getPosicionX().add(X);
		getPosicionX().add(jlbgetValorX());
		getPosicionX().add(METROS);
		add(getPosicionX());
		
		getPosicionY().add(Y);
		getPosicionY().add(jlbgetValorY());
		getPosicionY().add(METROS);
		add(getPosicionY());
		
		getVelocidadX().add(VX);
		getVelocidadX().add(jlbgetVX());
		getVelocidadX().add(METROS_SEGUNDO);
		add(getVelocidadX());
		
		getVelocidadY().add(VY);
		getVelocidadY().add(jlbgetVY());
		getVelocidadY().add(METROS_SEGUNDO);
		add(getVelocidadY());
		
		setPreferredSize(new Dimension(300, 200));
	}
	
	public JLabel jlbgetValorTiempo() {
		return valorTiempo;
	}
	
	public void jlbsetValorTiempo(double tiempo) {
		valorTiempo = new JLabel(String.valueOf(tiempo));
	}
	
	public JLabel jlbgetValorX() {
		return valorX;
	}
	
	public void jlbsetValorX(int valor) {
		valorX = new JLabel(String.valueOf(valor));
	}
	
	public JLabel jlbgetValorY() {
		return valorY;
	}
	
	public void jlbsetValorY(int valor) {
		valorY = new JLabel(String.valueOf(valor));
	}
	
	public JLabel jlbgetVX() {
		return vx;
	}
	
	public void jlbsetVX(double valor) {
		vx = new JLabel(String.valueOf(valor));
	}
	
	public JLabel jlbgetVY() {
		return vy;
	}
	
	public void jlbsetVY(double valor) {
		vy = new JLabel(String.valueOf(valor));
	}
	
	public JLabel jlbgetV() {
		return v;
	}
	
	public void jlbsetV(double valor) {
		v = new JLabel(String.valueOf(valor));
	}
	
	public JLabel jlbgetYMax() {
		return y_max;
	}
	
	public void jlbsetYMax(double valor) {
		y_max = new JLabel(String.valueOf(valor));
	}
	
	public JPanel getTiempo() {
		return tiempo;
	}
	
	public JPanel getPosicionX() {
		return posicionX;
	}
	
	public JPanel getPosicionY() {
		return posicionY;
	}
	
	public JPanel getVelocidadX() {
		return velocidadX;
	}
	
	public JPanel getVelocidadY() {
		return velocidadY;
	}
	
	public JPanel getVelocidad() {
		return velocidad;
	}
	
	public JPanel getYMax() {
		return YMax;
	}
}
