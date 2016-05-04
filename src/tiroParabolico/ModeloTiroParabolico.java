package tiroParabolico;

import java.awt.Point;
import java.util.ArrayList;

public class ModeloTiroParabolico {

	/* Como el tiro parabólico es la composición de dos movimientos:
	movimiento rectilíneo y uniforme a lo largo del eje X
	uniformemente acelerado a lo largo del eje Y
	 */
	private final static double GRAVEDAD = 9.81;
	private final static double PRECISION = 0.1;
	private static double velocidadInicial;
	private static double anguloInicial;
	private static double alturaInicial; //altura del objeto
	//velocidad X constante
	private static double velocidadInicialX;
	private static double velocidadInicialY;

	private ArrayList<Point> puntos;
	private ArrayList<Double> velocidades;

	public ModeloTiroParabolico(double velocidad, int angInicial, int alturaInicial) {
		setVelocidadInicial(velocidad);
		setAnguloInicial(angInicial);
		setAlturaInicial(alturaInicial);

		calcularVelocidadInicialX();
		calcularVelocidadInicialY();

		System.out.println("Velocidad inicial: " + getVelocidadInicial());
		System.out.println("Angulo inicial:" + getAnguloInicial());
		System.out.println("Altura inicial:" + getAlturaInicial());

		System.out.println("VelocidadInicial X " + getVelocidadInicialX());
		System.out.println("Velocidad Inicial Y" + getVelocidadInicialY());
		setArrayPuntos(new ArrayList<Point>());
		setArrayVelocidades(new ArrayList<Double>());
	}

	public void calcularVelocidadInicialX() {
		double x = getVelocidadInicial() * Math.cos(Math.toRadians(getAnguloInicial()));
		setVelocidadInicialX(x);
	}

	public void calcularVelocidadInicialY() {
		double y = getVelocidadInicial() * Math.sin(Math.toRadians(getAnguloInicial()));
		setVelocidadInicialY(y);
	}

	//en X es constante
	public double getcalcularVelocidadY(double tiempo) {
		return (getVelocidadInicialY() + (-GRAVEDAD)* tiempo);
	}

	//entero y no double para almacenar en ArrayList<Point>
	public int getCalcularX(double tiempo) {
		return (int)(getVelocidadInicialX() * tiempo);
	}

	public int getCalcularY(double tiempo) {
		return (int)(getAlturaInicial() + getVelocidadInicialY() * tiempo 
				+ (0.5 * (-GRAVEDAD) * tiempo * tiempo));
	}	

	public double getCalcularVelocidad(double tiempo) {
		//teorema de pitagoras
		//v = sqrt vx2 + vy2
		double aux1 = getVelocidadInicialX() * getVelocidadInicialX();
		double aux2 = getcalcularVelocidadY(tiempo) * getcalcularVelocidadY(tiempo);
		return Math.sqrt(aux1 + aux2);
	}
	
	public double getYMax() {
		return ((getVelocidadInicial() * getVelocidadInicial()) / (2 * GRAVEDAD));
	}

	public void calcularPuntos() {
		double i= 0;
		while(getCalcularY(i) >= 0) {
			getPuntos().add(new Point(getCalcularX(i), getCalcularY(i)));
			getArrayVelocidades().add(getCalcularVelocidad(i));
			//System.out.println(getCalcularX(i) + " " + getCalcularY(i) + " Velocidad " + getCalcularVelocidad(i));
			i+= PRECISION;
		}
	}

	public ArrayList<Point> getPuntos() {
		return puntos;
	}

	public ArrayList<Double> getArrayVelocidades() {
		return velocidades;
	}

	public void setArrayVelocidades(ArrayList<Double> valor) {
		velocidades = valor;
	}

	public void setArrayPuntos(ArrayList<Point> nuevo) {
		puntos = nuevo;
	}

	public double getVelocidadInicial() {
		return velocidadInicial;
	}

	public void setVelocidadInicial(double valor) {
		velocidadInicial = valor;
	}
	public double getVelocidadInicialX() {
		return velocidadInicialX;
	}

	public void setVelocidadInicialX(double valor) {
		velocidadInicialX = valor;
	}
	public double getVelocidadInicialY() {
		return velocidadInicialY;
	}

	public void setVelocidadInicialY(double valor) {
		velocidadInicialY = valor;
	}

	// Altura del objeto
	public double getAlturaInicial() {
		return alturaInicial;
	}

	public void setAlturaInicial(double valor) {
		alturaInicial = valor;
	}

	public double getAnguloInicial() {
		return anguloInicial;
	}

	public void setAnguloInicial(double valor) {
		anguloInicial = valor;
	}
}
