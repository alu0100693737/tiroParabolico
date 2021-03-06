/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase panel de informacion, usdo en pnlAplicacion
 */
package tiroParabolico;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class pnlInformacion extends JPanel {

	private subpanelinfo tiempo, posicionX, posicionY, velocidadX, velocidadY, velocidad, YMax;
	private etiqueta valorTiempo, valorX, valorY, vx, vy, v, y_max;

	public pnlInformacion() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(7, 1));
		
		tiempo = new subpanelinfo();
		posicionX = new subpanelinfo();
		posicionY = new subpanelinfo();
		velocidadX = new subpanelinfo();
		velocidadY = new subpanelinfo();
		velocidad = new subpanelinfo();
		YMax = new subpanelinfo();
		
		iniciarPanel();
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
	
	public void setTiempo(subpanelinfo valor) {
		tiempo = valor;
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
	
	public void iniciarPanel() {

		jlbsetValorTiempo(0); 
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
	}
	
	public void actualizarPanelesInfo() {		
		getTiempo().removeAll();
		getTiempo().add(new etiqueta("t = "));
		getTiempo().add(jlbgetValorTiempo());
		getTiempo().add(new etiqueta("s"));
		add(getTiempo());

		getPosicionX().removeAll();
		getPosicionX().add(new etiqueta("x = "));
		getPosicionX().add(jlbgetValorX());
		getPosicionX().add(new etiqueta("m"));
		add(getPosicionX());
		
		getPosicionY().removeAll();
		getPosicionY().add(new etiqueta("y = "));
		getPosicionY().add(jlbgetValorY());
		getPosicionY().add(new etiqueta("m"));
		add(getPosicionY());

		getVelocidadX().removeAll();
		getVelocidadX().add(new etiqueta("vx Inicial = "));
		getVelocidadX().add(jlbgetVX());
		getVelocidadX().add(new etiqueta("m/s"));
		add(getVelocidadX());

		getVelocidadY().removeAll();
		getVelocidadY().add(new etiqueta("vy Inicial = "));
		getVelocidadY().add(jlbgetVY());
		getVelocidadY().add(new etiqueta("m/s"));
		add(getVelocidadY());

		getVelocidad().removeAll();
		getVelocidad().add(new etiqueta("v = "));
		getVelocidad().add(jlbgetV());
		getVelocidad().add(new etiqueta("m/s"));
		add(getVelocidad());

		getYMax().removeAll();
		getYMax().add(new etiqueta("ymax = "));
		getYMax().add(jlbgetYMax());
		getYMax().add(new etiqueta("m"));
		add(getYMax());
		
		getTiempo().updateUI();
		getTiempo().repaint();
	}
}
