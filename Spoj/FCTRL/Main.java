import java.util.Scanner;

/**
 * [https://www.spoj.com] Solución al problema FCTRL
 * 
 * @author JhonnyMonrroy
 * @version 1.0 27 ene 2026
 */
// ACEPTADO!!!
public class Main {
	public static void main(String[] args) {
		Scanner Lee = new Scanner(System.in);
		int t = Lee.nextInt();
		while (t-- > 0)
			System.out.println(funcionZ(Lee.nextInt()));
		Lee.close();
	}

	private static int funcionZ(int n) {
		int numCeros = 0, cociente;
		int potenciasDeCinco = 5;
		do {
			cociente = n / potenciasDeCinco;
			numCeros += cociente;
			potenciasDeCinco *= 5;
		} while (cociente > 0);
		return numCeros;
	}
}
