import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: DECINC - Decrement OR Increment
 * [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 21 dic. de 2019
 */
// ACEPTADO!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee = new Scanner(System.in);
		int n;
		// ACA INICIA EL PROGRAMA
		n = Lee.nextInt();
		if (n % 4 == 0)
			System.out.println(n + 1);
		else
			System.out.println(n - 1);
		Lee.close();
	}
}
