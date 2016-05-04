/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase subpanel del pnlOpciones, se usan 3
 */
package tiroParabolico;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class subpnlOpciones extends JPanel {

	private final static Color COLORP2= new Color(156, 255, 57);
	private final static Color COLORSLIDER = new Color(129, 158, 239);
	private final static Color COLORCHECKBOX = new Color(57, 255, 57);
	private final static Color COLORNOMBRE = new Color(229, 255, 154);
	private static pnlEntradaDatos entradaDatos;

	private JPanel panel1;
	private JTextField introducir;
	private JPanel panel2;
	private etiqueta panel2jlb1;
	private etiqueta panel2jlb2;
	private etiqueta valorp2;

	private JSlider slider;
	private Checkbox checkbox;
	private arrayMedida medidas = new arrayMedida();

	public subpnlOpciones(int indice, int boton, botonContainer botones, txtInfo txttextos, double dato,int tipoSubpanel) {
		setLayout(new GridLayout(1, 3, 5, 5));
		add(botones.getArraybtn().get(boton));

		//panel2
		setValorp2(new etiqueta(String.valueOf(dato)));
		panel2jlb1 = txttextos.getArrayMedidasIniciales().get(indice);
		panel2jlb2 = getMedidas().getMedidas().get(boton);

		setPanel2(new JPanel());
		getPanel2().add(getPanel2jlb1());
		getPanel2().add(getValorp2());
		getPanel2().add(getPanel2jlb2());
		getPanel2().setBackground(COLORP2);
		add(getPanel2());

		//slider
		setSlider(new JSlider(JSlider.HORIZONTAL, 0, 100, 0));
		getSlider().setBackground(COLORSLIDER);
		add(getSlider());
		getSlider().addChangeListener(new SliderListener());


		if(tipoSubpanel == 1) { 										//panel con el ultimo elemento panel con checkbox
			//checkbox con jlb
			setCheckBox(new Checkbox());
			JPanel aux = new JPanel();
			aux.setBackground(COLORCHECKBOX);
			aux.add(getCheckBox());
			aux.add(txttextos.getArrayMedidasIniciales().get(indice + 1));
			add(aux);
			setBackground(Color.WHITE);
		} else if (tipoSubpanel == 0){
			setEntradaDatos(new pnlEntradaDatos());
			add(getEntradaDatos());
		} else if(tipoSubpanel == 2) {
			JPanel aux = new JPanel();
			aux.setBackground(COLORNOMBRE);
			aux.add(new etiqueta("Iván García Campos"));
			add(aux);
		}
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

	public pnlEntradaDatos getEntradaDatos() {
		return entradaDatos;
	}

	public void setEntradaDatos(pnlEntradaDatos valor) {
		entradaDatos = valor;
	}

	public Checkbox getCheckBox() {
		return checkbox;
	}

	public void setCheckBox(Checkbox nuevo) {
		checkbox = nuevo;
	}

	private class SliderListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			JSlider source = (JSlider)e.getSource();
			//if (!source.getValueIsAdjusting()) {
			getPanel2().removeAll();
			getPanel2().add(getPanel2jlb1());
			setValorp2(new etiqueta(String.valueOf((int)source.getValue())));
			getPanel2().add(getValorp2());
			getPanel2().add(getPanel2jlb2());
			getPanel2().updateUI();
			getPanel2().repaint();     
		}
	}
}
