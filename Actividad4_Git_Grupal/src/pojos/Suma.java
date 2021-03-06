package pojos;

/**
 * 
 * @author Diego
 * @version 1.0
 *
 */

public class Suma {
	
	private double d;
	private double e;
	private double f;
	private double g;
	private double h;
	private double i;
	private double j;
	private double valorAcumulado;
	
	public Suma(double d, double e, double f, double g, double h, double i, double j, double valorAcumulado) {
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
		this.i = i;
		this.j = j;
		this.valorAcumulado = valorAcumulado;
	}
	
	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}

	public double getJ() {
		return j;
	}

	public void setJ(double j) {
		this.j = j;
	}

	public double getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}

	public Suma() {
	}

	/**
	 * El metodo <i>SumaDosReales</i> suma dos numeros reales. </br>
	 * <b>Ej:</b> 13.25 <b> +  </b> 65.50
	 * @param a Representa el primer numero
	 * @param b Representa el segundo numero
	 * @return Devuelve la suma de los valores introducidos (a <b>+</b> b).
	 */
	public double SumaDosReales(double d, double e) {
		double SumaDosReales = d + e;
		valorAcumulado += SumaDosReales;
		return SumaDosReales;
	}

	/**
	 * El metodo <i>SumaDosEnteros</i> suma dos numeros enteros. </br>
	 * <b>Ej:</b> 50 <b> +  </b> 60
	 * @param a Representa el primer numero
	 * @param b Representa el segundo numero
	 * @return Devuelve la suma de los valores introducidos (a <b>+</b> b).
	 */
	public double SumaDosEnteros(double f, double g) {
		double SumaDosEnteros = f + g;
		valorAcumulado += SumaDosEnteros;
		return SumaDosEnteros;
	}

	/**
	 * El metodo <i>SumaTresReales</i> suma tres numeros reales. </br>
	 * <b>Ej:</b> 100.50 <b> +  </b> 200.50 +  </b> 1000.01
	 * @param a Representa el primer numero
	 * @param b Representa el segundo numero
	 * @return Devuelve la suma de los valores introducidos (a <b>+</b> b + </b> c).
	 */
	public double SumaTresReales(double h, double i, double j) {
		double SumaTresReales = h + i + j;
		valorAcumulado += SumaTresReales;
		return SumaTresReales;
	}

	/**
	 * El metodo <i>ValorAcumulado</i> acumula el resto de operaciones. </br>
	 * @param a Representa el primer numero
	 * @param b Representa el segundo numero
	 * @return Devuelve la suma de los valores introducidos.
	 */
	public double ValorAcumulado() {
		return valorAcumulado;
	}
	
	
}