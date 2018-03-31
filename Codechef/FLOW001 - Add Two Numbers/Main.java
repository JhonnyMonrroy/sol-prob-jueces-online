// Correct Answer!!! xD
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: FLOW001 - Add Two Numbers [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 8 mar. de 2018
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee;
		int t, a, b; // para los datos de entrada

		// ACA INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		t = Lee.nextInt();
		while (t-- > 0) {
			a = Lee.nextInt();
			b = Lee.nextInt();
			System.out.println(a + b);
		}
		Lee.close();
	}
}
