package tiroParabolico;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class txtMedidasIniciales {
	private ArrayList<JLabel> arrayMedidasIniciales;
	private final static JLabel VELOCIDAD = new JLabel("Velocidad Inicial ms");
	private final static JLabel ANGULOINICIAL = new JLabel("Angulo Inicial grados");
	private final static JLabel ALTURAINICIAL = new JLabel("Altura Inicial m");
	private final static JLabel MOSTRARVELOCIDADES = new JLabel("Mostrar velocidades");
	private final static JLabel MOSTRARRASTRO = new JLabel("Mostrar rastro");
	private final static JLabel MOSTRARVECTORPOSICION = new JLabel("Mostrar vector de posicion");

	public txtMedidasIniciales() {
		arrayMedidasIniciales = new ArrayList<JLabel>();
		getArrayMedidasIniciales().add(VELOCIDAD);
		getArrayMedidasIniciales().add(MOSTRARVELOCIDADES);
		getArrayMedidasIniciales().add(ANGULOINICIAL);
		getArrayMedidasIniciales().add(MOSTRARRASTRO);
		getArrayMedidasIniciales().add(ALTURAINICIAL);
		getArrayMedidasIniciales().add(MOSTRARVECTORPOSICION);
		
	}
	
	public ArrayList<JLabel> getArrayMedidasIniciales() {
		return arrayMedidasIniciales;
	}
}
