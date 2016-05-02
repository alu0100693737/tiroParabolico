package tiroParabolico;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.GenericArrayType;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class subpnlOpciones extends JPanel {

	
	private JPanel panel2;
	private etiqueta panel2jlb1;
	private etiqueta panel2jlb2;
	private etiqueta valorp2;

	private JSlider slider;
	private Checkbox checkbox;
	private arrayMedida medidas = new arrayMedida();


	public subpnlOpciones(int indice, int boton, botonContainer botones, txtInfo txttextos, double dato) {
		setLayout(new GridLayout(1, 3, 5, 5));

		//boton
		add(botones.getArraybtn().get(boton));
		//botones.getArraybtn().get(boton).addActionListener(new pnlOpciones.botonListener());
		

		//panel2
		setValorp2(new etiqueta(String.valueOf(dato)));
		panel2jlb1 = txttextos.getArrayMedidasIniciales().get(indice);
		panel2jlb2 = getMedidas().getMedidas().get(boton);

		setPanel2(new JPanel());
		getPanel2().add(panel2jlb1);
		getPanel2().add(getValorp2());
		getPanel2().add(panel2jlb2);
		add(getPanel2());

		//slider
		setSlider(new JSlider(JSlider.HORIZONTAL, 0, 100, 0));
		add(getSlider());
		getSlider().addChangeListener(new SliderListener());

		//checkbox con jlb
		setCheckBox(new Checkbox());
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

	public JPanel getPanel2() {
		return panel2;
	}

	public void setPanel2(JPanel nuevo) {
		panel2 = nuevo;
	}

	public etiqueta getValorp2() { 
		return valorp2;
	}
	
	public etiqueta getPanel2jlb1() {
		return panel2jlb1;
	}

	public etiqueta getPanel2jlb2() {
		return panel2jlb2;
	}
	
	public void setValorp2(etiqueta valor) {
		valorp2 = valor;
	}

	public Checkbox getCheckBox() {
		return checkbox;
	}

	public void setCheckBox(Checkbox nuevo) {
		checkbox = nuevo;
	}
	
	private class SliderListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			System.out.println("syso" + e.getSource().getClass());
			JSlider source = (JSlider)e.getSource();
			//if (!source.getValueIsAdjusting()) {
				getPanel2().removeAll();
				getPanel2().add(panel2jlb1);
				getPanel2().add(new etiqueta(String.valueOf((int)source.getValue())));
				getPanel2().add(panel2jlb2);
				getPanel2().updateUI();
				getPanel2().repaint();     
				System.out.println("TUSO");
		}   
	}
}
