package tiroParabolico;

import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.Scrollbar;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class pnlOpciones extends JPanel {
	
	private final static int FILAS = 3;
	private botonContainer arrayBotones;
	private txtMedidasIniciales arrayMedidasIniciales;
	
	public pnlOpciones() {
		setLayout(new GridLayout(3, 4, 5, 5));
		setArrayBotones(new botonContainer());
		setArrayMedidasIniciales(new txtMedidasIniciales());
		int contador = 0;
		for (int i = 0; i < FILAS; i++) {
			add(getArrayBotones().getArraybtn().get(i));
			add(getArrayMedidasIniciales().getArrayMedidasIniciales().get(contador));
			contador++;
			add(getArrayMedidasIniciales().getArrayMedidasIniciales().get(contador));
			add(new JSlider());
			add(new Checkbox());
		}
		
		
	}
	
	public botonContainer getArrayBotones() {
		return arrayBotones;
	}
	
	public void setArrayBotones(botonContainer valor) {
		arrayBotones = valor;
	}
	
	public txtMedidasIniciales getArrayMedidasIniciales() {
		return arrayMedidasIniciales;
	}
	
	public void setArrayMedidasIniciales(txtMedidasIniciales valor) {
		arrayMedidasIniciales = valor;
	}
}
