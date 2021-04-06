package pojos;
/**
 * Esta clase realiza varios tipos de multiplicaci�n. 
 * @author Andr�s P�rez
 * @version 1.0
 *
 */
public class Producto {

	/**
	 * El m�todo <i>productoNumerosReales</i> multiplica dos n�meros reales.</br> 
	 * <b>Ej:</b> 6.9 <b> x </b> 4.1
	 * @param a Representa el primer n�mero.
	 * @param b Representa el segundo n�mero.
	 * @return Retorna el producto de los par�metros introducidos (a <b>x</b> b).
	 */
	public double productoNumerosReales(double a, double b) {
		double totalProd1 = a * b;
		return totalProd1;
	}

	/**
	 * El m�todo <i>productoNumerosEnteros</i> multiplica dos n�meros enteros.</br> 
	 * <b>Ej:</b> 5 <b> x </b> 4
	 * @param c Representa el primer n�mero entero.
	 * @param d Representa el segundo n�mero entero.
	 * @return Retorna el producto de los dos par�metros introducidos (c <b>x</b> d).
	 */
	public int productoNumerosEnteros(int c, int d) {
		int totalProdEnteros = c * d;
		return totalProdEnteros;
	}

	/**
	 * El m�todo <i>productoNumerosReales2</i> multiplica tres n�meros reales.</br> 
	 * <b>Ej:</b> 12.5 <b> x </b> 4.2 <b> x </b> 1.2
	 * @param e Representa el primer n�mero real.
	 * @param f Representa el segundo n�mero real.
	 * @param g Representa el tercer n�mero real.
	 * @return Retorna el producto de los tres par�metros anteriores (e <b>x</b> f <b>x</b> g).
	 */
	public double productoNumerosReales2(double e, double f, double g) {
		double totalProdReales2 = e * f * g;
		return totalProdReales2;
	}

	/**
	 * El m�todo <i>potencia</i> realiza la potencia de los par�metros introducidos.</br> 
	 * <b>Ej:</b> 6 <b> x </b> 4
	 * @param pot1 Representa el primer n�mero.
	 * @param pot2 Representa el segundo n�mero.
	 * @return Retorna el c�lculo de una potencia (pot1 <b>x</b> pot2).
	 */
	public double potencia(double pot1, double pot2) {
		double totalPotencia = Math.pow(pot1, pot2);
		return totalPotencia;
	}

}
