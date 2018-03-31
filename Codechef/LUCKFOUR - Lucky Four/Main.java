// Correct Answer!!! xD
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: LUCKFOUR - Lucky Four
 * [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 24 mar. de 2018
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee;
		int t;
		String numero;

		// ACA INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		t = Lee.nextInt();
		while (t-- > 0) {
			numero = Lee.next();
			System.out.println(cantidadCuatros(numero));
		}
		Lee.close();
	}

	/**
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 24 mar. de 2018
	 * @param numero
	 *            String que representa el numero de entrada
	 * @return un entero que representa el numero de digitos 4 que se encontraron
	 */
	private static int cantidadCuatros(String numero) {
		int cont = 0;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '4')
				cont++;
		}
		return cont;
	}
}
