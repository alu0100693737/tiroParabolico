package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import componentes.botonContainer;
import componentes.txtInfo;

public class pnlOpciones extends JPanel {

	private final static int FILAS = 3;
	private botonContainer arrayBotones;
	private txtInfo arrayMedidasIniciales;

	private static subpnlOpciones subpnlOpciones1;
	private static subpnlOpciones subpnlOpciones2;
	private static subpnlOpciones subpnlOpciones3;

	public pnlOpciones(double velocidad, int angulo, int altura) {
		setPreferredSize(new Dimension(800, 150));
		setBorder(BorderFactory.createLineBorder(Color.black));
		setLayout(new GridLayout(3, 1, 5, 5));
		setArrayBotones(new botonContainer());
		setArrayMedidasIniciales(new txtInfo());
		setBackground(Color.WHITE);

		subpnlOpciones1 = new subpnlOpciones(0, 0, getArrayBotones(), getArrayMedidasIniciales(), velocidad);
		subpnlOpciones2 = new subpnlOpciones(2, 1, getArrayBotones(), getArrayMedidasIniciales(), angulo);
		subpnlOpciones3 = new subpnlOpciones(4, 2, getArrayBotones(), getArrayMedidasIniciales(), altura);
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
}
