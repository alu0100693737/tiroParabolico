package tiroParabolico;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) {
		jfrAplicacion prueba = new jfrAplicacion();
		prueba.setTitle("Tiro Parabolico");
		prueba.pack();

		prueba.setLocationRelativeTo(null); // Center the frame
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.setMinimumSize(new Dimension(1000, 550));
		prueba.setVisible(true);
		
	}
}
