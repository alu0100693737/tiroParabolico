package tiroParabolico;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class txtMedidasIniciales {
	private ArrayList<JLabel> arrayMedidasIniciales;
	private final static JLabel VELOCIDAD = new JLabel("Velocidad Inicial ");
	private final static JLabel ANGULOINICIAL = new JLabel("Angulo Inicial ");
	private final static JLabel ALTURAINICIAL = new JLabel("Altura Inicial ");
	private final static JLabel MS = new JLabel("m/s");
	private final static JLabel GRADOS = new JLabel("grados");
	private final static JLabel METROS = new JLabel("m");
	
	public txtMedidasIniciales() {
		arrayMedidasIniciales = new ArrayList<JLabel>();
		getArrayMedidasIniciales().add(VELOCIDAD);
		getArrayMedidasIniciales().add(MS);
		getArrayMedidasIniciales().add(ANGULOINICIAL);
		getArrayMedidasIniciales().add(GRADOS);
		getArrayMedidasIniciales().add(ALTURAINICIAL);
		getArrayMedidasIniciales().add(METROS);
	}
	
	public ArrayList<JLabel> getArrayMedidasIniciales() {
		return arrayMedidasIniciales;
	}
}
