package tiroParabolico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class jfrAplicacion extends JFrame {
	private pnlAplicacion aplicacion;
	private unionPaneles panelesinformacion;
	
	public jfrAplicacion() {
		setLayout(new BorderLayout(5, 5));
		setAplicacion(new pnlAplicacion());
		setPanelesInformacion(new unionPaneles());
		getAplicacion().setBackground(Color.RED);
		add(getAplicacion(), BorderLayout.CENTER);
		add(getUnionPaneles(), BorderLayout.SOUTH);
	}
	
	public pnlAplicacion getAplicacion() {
		return aplicacion;
	}
	
	public void setAplicacion(pnlAplicacion valor) {
		aplicacion = valor;
	}
	
	public unionPaneles getUnionPaneles() {
		return panelesinformacion;
	}
	
	public void setPanelesInformacion(unionPaneles valor) {
		panelesinformacion = valor;
	}
}
