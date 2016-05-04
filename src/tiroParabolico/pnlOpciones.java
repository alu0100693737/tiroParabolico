/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase panel de opciones, 3 botones, 3 panel, 3 sliders, 3 checkbox + etiqueta
 */
package tiroParabolico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class pnlOpciones extends JPanel {

	private final static int FILAS = 3;
	private botonContainer arrayBotones;
	private txtInfo arrayMedidasIniciales;

	private static subpnlOpciones subpnlOpciones1;
	private static subpnlOpciones subpnlOpciones2;
	private static subpnlOpciones subpnlOpciones3;

	public pnlOpciones() {
		setPreferredSize(new Dimension(800, 150));
		setBackground(Color.BLACK);
		setBorder(BorderFactory.createLineBorder(Color.black));
		setLayout(new GridLayout(3, 1, 5, 5));
		setArrayBotones(new botonContainer());
		setArrayMedidasIniciales(new txtInfo());
		setBackground(Color.WHITE);

		subpnlOpciones1 = new subpnlOpciones(0, 0, getArrayBotones(), getArrayMedidasIniciales(), 0, true);
		subpnlOpciones2 = new subpnlOpciones(2, 1, getArrayBotones(), getArrayMedidasIniciales(), 0, false);
		subpnlOpciones3 = new subpnlOpciones(4, 2, getArrayBotones(), getArrayMedidasIniciales(), 0, false);
		getsubpnlOpciones1().getEntradaDatos().getEntradaVelocidad().addKeyListener(new pnlOpciones.escribirDatos());
		getsubpnlOpciones2().getEntradaDatos().getEntradaAngulo().addKeyListener(new pnlOpciones.escribirDatos());
		getsubpnlOpciones3().getEntradaDatos().getEntradaAltura().addKeyListener(new pnlOpciones.escribirDatos());
		
		add(getsubpnlOpciones1());
		add(getsubpnlOpciones2());
		add(getsubpnlOpciones3());
	}
	
	public subpnlOpciones getsubpnlOpciones1() {
		return subpnlOpciones1;
	}

	public subpnlOpciones getsubpnlOpciones2() {
		return subpnlOpciones2;
	}

	public subpnlOpciones getsubpnlOpciones3() {
		return subpnlOpciones3;
	}

	public botonContainer getArrayBotones() {
		return arrayBotones;
	}

	public void setArrayBotones(botonContainer valor) {
		arrayBotones = valor;
	}

	public txtInfo getArrayMedidasIniciales() {
		return arrayMedidasIniciales;
	}

	public void setArrayMedidasIniciales(txtInfo valor) {
		arrayMedidasIniciales = valor;
	}
	
	public class escribirDatos implements KeyListener {
		@Override
		public void keyPressed(KeyEvent ke) {
			// TODO Auto-generated method stub
			if(ke.getSource() == getsubpnlOpciones1().getEntradaDatos().getEntradaVelocidad()) {
				if(ke.getKeyCode() == KeyEvent.VK_ENTER) {
					getsubpnlOpciones1().getPanel2().removeAll();
					getsubpnlOpciones1().getPanel2().add(getsubpnlOpciones1().getPanel2jlb1());
					getsubpnlOpciones1().setValorp2(new etiqueta(getsubpnlOpciones1().getEntradaDatos().getEntradaVelocidad().getText()));
					getsubpnlOpciones1().getPanel2().add(getsubpnlOpciones1().getValorp2());
					getsubpnlOpciones1().getPanel2().add(getsubpnlOpciones1().getPanel2jlb2());
					getsubpnlOpciones1().getPanel2().updateUI();
					getsubpnlOpciones1().getPanel2().repaint();     

				}
			} else if(ke.getSource() == getsubpnlOpciones2().getEntradaDatos().getEntradaAngulo()) {
				getsubpnlOpciones2().getPanel2().removeAll();
				getsubpnlOpciones2().getPanel2().add(getsubpnlOpciones2().getPanel2jlb1());
				getsubpnlOpciones2().setValorp2(new etiqueta(getsubpnlOpciones2().getEntradaDatos().getEntradaAngulo().getText()));
				getsubpnlOpciones2().getPanel2().add(getsubpnlOpciones2().getValorp2());
				getsubpnlOpciones2().getPanel2().add(getsubpnlOpciones2().getPanel2jlb2());
				getsubpnlOpciones2().getPanel2().updateUI();
				getsubpnlOpciones2().getPanel2().repaint();  
				
			} else if (ke.getSource() == getsubpnlOpciones3().getEntradaDatos().getEntradaAltura()) {
				getsubpnlOpciones3().getPanel2().removeAll();
				getsubpnlOpciones3().getPanel2().add(getsubpnlOpciones3().getPanel2jlb1());
				getsubpnlOpciones3().setValorp2(new etiqueta(getsubpnlOpciones3().getEntradaDatos().getEntradaAltura().getText()));
				getsubpnlOpciones3().getPanel2().add(getsubpnlOpciones3().getValorp2());
				getsubpnlOpciones3().getPanel2().add(getsubpnlOpciones3().getPanel2jlb2());
				getsubpnlOpciones3().getPanel2().updateUI();
				getsubpnlOpciones3().getPanel2().repaint(); 
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}
	}
}
