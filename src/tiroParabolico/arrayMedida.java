package tiroParabolico;

import java.util.ArrayList;

public class arrayMedida {
	
	private final static etiqueta METROS_SEGUNDO = new etiqueta("m/s");
	private final static etiqueta GRADOS = new etiqueta("grados");
	private final static etiqueta METROS = new etiqueta("m");
	private ArrayList<etiqueta> medidas;
	
	public arrayMedida() {
		setMedidas(new ArrayList<etiqueta>());
		getMedidas().add(METROS_SEGUNDO);
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
