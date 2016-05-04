/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase para la representacion de un JSlider propio
 */
package tiroParabolico;

import javax.swing.BorderFactory;
import javax.swing.JSlider;

public class slider extends JSlider {
	public slider() {
		super();
		setMajorTickSpacing(10);
		setMinorTickSpacing(1);
		setPaintTicks(true);
		setPaintLabels(true);
		setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
	}
}
