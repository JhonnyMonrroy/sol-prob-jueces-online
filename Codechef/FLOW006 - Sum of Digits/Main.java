// Correct Answer xD
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: FLOW006 - Sum of Digits
 * [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 23 mar. de 2018
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		int t; // numero de casos de prueba
		String n; // numero a procesar

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		t = Lee.nextInt();
		while (t-- > 0) {
			n = Lee.next();
			System.out.println(sumarDigitos(n));
		}
		Lee.close();
	}

	private static int sumarDigitos(String n) {
		int sum = 0;
		for (int i = 0; i < n.length(); i++)
			sum += (n.charAt(i) - '0');
		return sum;
	}
}
