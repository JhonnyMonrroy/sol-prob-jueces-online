import java.util.Arrays;
import java.util.Scanner;

/**
 * Soluci&oacute;n a 11727 - Cost Cutting [https://uva.onlinejudge.org/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 22 ene. de 2018
 */
// Accepted!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // Para leer los datos de entrada
		int t;
		int[] salarios = new int[3];
		int i, j;

		// ACA INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		t = Lee.nextInt();
		for (i = 1; i <= t; i++) {
			for (j = 0; j < 3; j++) {
				salarios[j] = Lee.nextInt();
			}
			// ordenamos el vector
			Arrays.sort(salarios);
			// mostramos el resultado
			System.out.println("Case " + i + ": " + salarios[1]);
		}
		Lee.close();
	}
}
