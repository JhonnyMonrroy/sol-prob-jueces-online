// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * Factorial - Problem code: FCTRL [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		int T; // para leer cuantos TEST se debe realizar

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		// leemos T
		T = Lee.nextInt();
		while (T > 0) {
			System.out.println(funcionZ(Lee.nextInt()));
			T--;
		}
	}

	/** Función Z de N */
	private static int funcionZ(int n) {
		int r = 0;
		while (n >= 5) {
			n /= 5;
			r += n;
		}
		return r;
	}
}
