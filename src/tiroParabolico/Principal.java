package tiroParabolico;

import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) {
		jfrAplicacion prueba = new jfrAplicacion();
		prueba.setTitle("Tiro Parabolico");
		prueba.pack();

		prueba.setLocationRelativeTo(null); // Center the frame
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.setVisible(true);
		ModeloTiroParabolico a = new ModeloTiroParabolico(20, 60, 0);
		a.calcularPuntos();
		//System.out.println("Ventana" + prueba.getWidth() + " " + prueba.getHeight());
	}

}
