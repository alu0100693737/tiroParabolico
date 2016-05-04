/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase para la creacion propia de un JLabel
 */

package tiroParabolico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class etiqueta extends JLabel {
	public etiqueta(String text) {
		setText(text);
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setFont(new Font("Comic Sans MS", Font.BOLD, 16));
	}
}
