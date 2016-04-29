package tiroParabolico;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JSlider;

public class subpnlOpciones1 extends JPanel {
	
	public subpnlOpciones1(int indice, int boton, botonContainer botones, txtMedidasIniciales texto) {
		setLayout(new GridLayout(1, 5, 5, 5));
		System.out.println(boton + " " + indice);
		add(botones.getArraybtn().get(boton));
		add(texto.getArrayMedidasIniciales().get(indice));
		add(new JSlider());
		add(new Checkbox());
		add(texto.getArrayMedidasIniciales().get(indice + 1));
		setBackground(Color.WHITE);
	}
}
