// Correct Answer!!! xD
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: CIELAB - Ciel and A-B Problem
 * [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 8 mar. de 2018
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer la entrada
		int a, b; // los datos de entrada
		String resta; // para la resta
		char digito;

		// ACA INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		a = Lee.nextInt();
		b = Lee.nextInt();
		resta = Integer.toString(a - b);
		// cambiamos el primer digito
		digito = resta.charAt(0);
		if (digito != '1') {
			System.out.println('1' + resta.substring(1, resta.length()));
		} else {
			System.out.println('2' + resta.substring(1, resta.length()));
		}
		Lee.close();
	}
}
