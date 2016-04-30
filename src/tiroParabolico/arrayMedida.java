package tiroParabolico;

import java.util.ArrayList;

public class arrayMedida {
	
	private final static etiqueta SEGUNDOS = new etiqueta("s");
	private final static etiqueta GRADOS = new etiqueta("grados");
	private final static etiqueta METROS = new etiqueta("m");
	private ArrayList<etiqueta> medidas;
	
	public arrayMedida() {
		setMedidas(new ArrayList<etiqueta>());
		getMedidas().add(SEGUNDOS);
		getMedidas().add(GRADOS);
		getMedidas().add(METROS);
	}
	
	public ArrayList<etiqueta> getMedidas() {
		return medidas;
	}
	
	public void setMedidas(ArrayList<etiqueta> valor) {
		medidas = valor;
	}

}
