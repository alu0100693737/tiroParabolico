package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.jws.WebParam.Mode;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class jfrAplicacion extends JFrame {
	private pnlAplicacion aplicacion;
	private pnlOpciones opciones;
	private pnlInformacion informacion;
	private ModeloTiroParabolico modelo;
	
	public jfrAplicacion(double velocidad, int angulo, int altura) {
		//inicializamos el modelo
		setModelo(new ModeloTiroParabolico(velocidad, angulo, altura));
		setLayout(new BorderLayout());
		setAplicacion(new pnlAplicacion());
		informacion = new pnlInformacion(velocidad);
		add(informacion, BorderLayout.EAST);
		setOpciones(new pnlOpciones());
		add(getAplicacion(), BorderLayout.CENTER);
		add(getOpciones(), BorderLayout.SOUTH);
	}
	
	public pnlAplicacion getAplicacion() {
		return aplicacion;
	}
	
	public void setAplicacion(pnlAplicacion valor) {
		aplicacion = valor;
	}
	
	public pnlOpciones getOpciones() {
		return opciones;
	}
	
	public void setOpciones(pnlOpciones valor) {
		opciones = valor;
	}
	
	public ModeloTiroParabolico getModelo() {
		return modelo;
	}
	
	public void setModelo(ModeloTiroParabolico valor) {
		modelo = valor;
	}
}
