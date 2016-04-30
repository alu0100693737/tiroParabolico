package tiroParabolico;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class subpnlOpciones1 extends JPanel {
	
	private JSlider slider;
	private Checkbox checkbox;
	public subpnlOpciones1(int indice, int boton, botonContainer botones, txtMedidasIniciales texto) {
		
		setLayout(new GridLayout(1, 4, 5, 5));
		System.out.println(boton + " " + indice);
		
		add(botones.getArraybtn().get(boton));
		add(texto.getArrayMedidasIniciales().get(indice));
		setSlider(new JSlider(JSlider.HORIZONTAL, 0, 100, 0));
		setCheckBox(new Checkbox());
		
		
		add(getSlider());
		JPanel aux = new JPanel();
		aux.add(getCheckBox());
		aux.add(texto.getArrayMedidasIniciales().get(indice + 1));
		add(aux);
		setBackground(Color.WHITE);
	}
	
	public JSlider getSlider() {
		return slider;
	}
	
	public void setSlider(JSlider valor) {
		slider = valor;
		getSlider().setMajorTickSpacing(10);
		getSlider().setMinorTickSpacing(1);
		getSlider().setPaintTicks(true);
		getSlider().setPaintLabels(true);
		getSlider().setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
	}
	
	public Checkbox getCheckBox() {
		return checkbox;
	}
	
	public void setCheckBox(Checkbox nuevo) {
		checkbox = nuevo;
	}
}
