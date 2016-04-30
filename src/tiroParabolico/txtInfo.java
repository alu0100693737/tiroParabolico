package tiroParabolico;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class txtInfo {
	private ArrayList<etiqueta> arrayMedidasIniciales;
	private final static etiqueta VELOCIDAD = new etiqueta("Velocidad Inicial ");
	private final static etiqueta ANGULOINICIAL = new etiqueta("Angulo Inicial ");
	private final static etiqueta ALTURAINICIAL = new etiqueta("Altura Inicial ");
	private final static etiqueta MOSTRARVELOCIDADES = new etiqueta("Mostrar velocidades");
	private final static etiqueta MOSTRARRASTRO = new etiqueta("Mostrar rastro");
	private final static etiqueta MOSTRARVECTORPOSICION = new etiqueta("Mostrar vector de posicion");

	public txtInfo() {
		arrayMedidasIniciales = new ArrayList<etiqueta>();
		getArrayMedidasIniciales().add(VELOCIDAD);
		getArrayMedidasIniciales().add(MOSTRARVELOCIDADES);
		getArrayMedidasIniciales().add(ANGULOINICIAL);
		getArrayMedidasIniciales().add(MOSTRARRASTRO);
		getArrayMedidasIniciales().add(ALTURAINICIAL);
		getArrayMedidasIniciales().add(MOSTRARVECTORPOSICION);
		
	}
	
	public ArrayList<etiqueta> getArrayMedidasIniciales() {
		return arrayMedidasIniciales;
	}
}
