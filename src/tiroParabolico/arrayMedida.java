/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase final para el almacenamiento de 3 etiquetas
 */

package tiroParabolico;

import java.util.ArrayList;

public final class arrayMedida {

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
