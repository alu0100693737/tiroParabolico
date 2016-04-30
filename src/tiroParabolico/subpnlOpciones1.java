package tiroParabolico;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class subpnlOpciones1 extends JPanel {
	
	private JSlider slider;
	private Checkbox checkbox;
	private arrayMedida medidas = new arrayMedida();
	
	public subpnlOpciones1(int indice, int boton, botonContainer botones, txtInfo txttextos, double dato) {
		setLayout(new GridLayout(1, 3, 5, 5));
		
		add(botones.getArraybtn().get(boton));
		JPanel aux1 = new JPanel();
		aux1.add(txttextos.getArrayMedidasIniciales().get(indice));
		aux1.add(new etiqueta(String.valueOf(dato)));
		aux1.add(getMedidas().getMedidas().get(boton));
		add(aux1);
		setSlider(new JSlider(JSlider.HORIZONTAL, 0, 100, 0));
		setCheckBox(new Checkbox());
		
		add(getSlider());
		JPanel aux = new JPanel();
		aux.add(getCheckBox());
		aux.add(txttextos.getArrayMedidasIniciales().get(indice + 1));
		add(aux);
		setBackground(Color.WHITE);
	}
	
	public arrayMedida getMedidas() {
		return medidas;
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
