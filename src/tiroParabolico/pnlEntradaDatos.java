/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase para introducir por teclado los datos velocidad, angulo y altura
 */
package tiroParabolico;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pnlEntradaDatos extends JPanel {
	
	private JTextField entradaVelocidad;
	private JTextField entradaAngulo;
	private JTextField entradaAltura;
	
	private final static Color PNLCOLOR = new Color(255, 172, 88); //Orange
	
	public pnlEntradaDatos() {
		
		setLayout(new GridLayout(2, 3, 2, 2));
		setBackground(PNLCOLOR);
		
		add(new etiqueta("Velocidad"));
		add(new etiqueta("Angulo"));
		add(new etiqueta("Altura"));
		
		setEntradaVelocidad(new JTextField());
		setEntradaAngulo(new JTextField());
		setEntradaAltura(new JTextField());
		
		//getEntradaAngulo().addKeyListener(new subpnlOpciones.escribirDatos());
		//getEntradaAltura().addKeyListener(new subpnlOpciones.escribirDatos());
		
		add(getEntradaVelocidad());
		add(getEntradaAngulo());
		add(getEntradaAltura());
	}
	
	public JTextField getEntradaVelocidad() {
		return entradaVelocidad;
	}
	
	public void setEntradaVelocidad(JTextField valor) {
		entradaVelocidad = valor;
	}
	
	public JTextField getEntradaAngulo() {
		return entradaAngulo;
	}
	
	public void setEntradaAngulo(JTextField valor) {
		entradaAngulo = valor;
	}

	public JTextField getEntradaAltura() {
		return entradaAltura;
	}
	
	public void setEntradaAltura(JTextField valor) {
		entradaAltura = valor;
	}
}
