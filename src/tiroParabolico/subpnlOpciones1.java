package tiroParabolico;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.lang.reflect.GenericArrayType;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class subpnlOpciones1 extends JPanel {
	
	private static JPanel panel2;
	private static etiqueta panel2jlb1;
	private static etiqueta panel2jlb2;
	private static etiqueta valorp2;
	
	private static JSlider slider;
	private Checkbox checkbox;
	private arrayMedida medidas = new arrayMedida();
	
	
	public subpnlOpciones1(int indice, int boton, botonContainer botones, txtInfo txttextos, double dato) {
		setLayout(new GridLayout(1, 3, 5, 5));

		//boton
		add(botones.getArraybtn().get(boton));
		
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
	
	public static JSlider getSlider() {
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
	
	public static JPanel getPanel2() {
		return panel2;
	}
	
	public static void setPanel2(JPanel nuevo) {
		panel2 = nuevo;
		/*getPanel2().add(panel2jlb1);
		getPanel2().add(getValorp2());
		getPanel2().add(panel2jlb2);*/
	}
	
	public static etiqueta getValorp2() { 
		return valorp2;
	}
	
	public static void setValorp2(etiqueta valor) {
		valorp2 = valor;
	}
	
	public Checkbox getCheckBox() {
		return checkbox;
	}
	
	public void setCheckBox(Checkbox nuevo) {
		checkbox = nuevo;
	}
	
	public static class SliderListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {
            int fps = (int)source.getValue();
                 setValorp2(new etiqueta(String.valueOf((int)getSlider().getValue())));
                 JPanel aux = new JPanel();
                 aux.add(panel2jlb1);
             		aux.add(getValorp2());
             		aux.add(panel2jlb2);
                 setPanel2(aux);
                 getPanel2().repaint();
                 
        }
    }   
    }
}
