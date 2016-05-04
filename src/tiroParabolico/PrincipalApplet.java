/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 05/05/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase para la prueba del tiro parabolico. Applet
 */
package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class PrincipalApplet {
	public static void main(String[] args) {
		// Create a frame
		JFrame frame = new JFrame("Tiro Parabolico");
		frame.setTitle("Tiro Parabolico");
		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(1000, 550));
		
		jfrAplicacion applet = new jfrAplicacion();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Add the applet instance to the frame
		frame.add(applet, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
}

