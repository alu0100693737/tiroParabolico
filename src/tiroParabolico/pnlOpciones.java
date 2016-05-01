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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class pnlOpciones extends JPanel {
	
	private final static int FILAS = 3;
	private botonContainer arrayBotones;
	private txtInfo arrayMedidasIniciales;
	
	public pnlOpciones(double velocidad, int angulo, int altura) {
		setPreferredSize(new Dimension(800, 150));
		setBorder(BorderFactory.createLineBorder(Color.black));
		setLayout(new GridLayout(3, 1, 5, 5));
		setArrayBotones(new botonContainer());
		setArrayMedidasIniciales(new txtInfo());
		setBackground(Color.WHITE);
		add(new subpnlOpciones1(0, 0, getArrayBotones(), getArrayMedidasIniciales(), velocidad));
		add(new subpnlOpciones1(2, 1, getArrayBotones(), getArrayMedidasIniciales(), angulo));
		add(new subpnlOpciones1(4, 2, getArrayBotones(), getArrayMedidasIniciales(), altura));
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
	
}
