package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Scrollbar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class pnlOpciones extends JPanel {
	
	private final static int FILAS = 3;
	private botonContainer arrayBotones;
	private txtMedidasIniciales arrayMedidasIniciales;
	
	public pnlOpciones() {
		setPreferredSize(new Dimension(800, 150));
		setBorder(BorderFactory.createLineBorder(Color.black));
		setLayout(new GridLayout(3, 1, 5, 5));
		setArrayBotones(new botonContainer());
		setArrayMedidasIniciales(new txtMedidasIniciales());
		setBackground(Color.WHITE);
		add(new subpnlOpciones1(0, 0, getArrayBotones(), getArrayMedidasIniciales()));
		add(new subpnlOpciones1(2, 1, getArrayBotones(), getArrayMedidasIniciales()));
		add(new subpnlOpciones1(4, 2, getArrayBotones(), getArrayMedidasIniciales()));
		
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
