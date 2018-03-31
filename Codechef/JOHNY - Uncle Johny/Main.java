// Correct Answer!!! xD
import java.util.Arrays;
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: JOHNY - Uncle Johny [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 29 mar. de 2018
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para los datos de entrada
		int t, n, a[], k;
		int i; // para los indices

		// ACA INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		t = Lee.nextInt();
		while (t-- > 0) {
			n = Lee.nextInt();
			a = new int[n];
			for (i = 0; i < n; i++)
				a[i] = Lee.nextInt();
			k = Lee.nextInt();
			System.out.println(posicionDeK(n, a, k));
		}
		Lee.close();
	}

	/**
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 29 mar. de 2018
	 * @param n
	 *            Dimension del vector
	 * @param a
	 *            vector de sonidos
	 * @param k
	 *            Indice de la cancion del Tio Johny
	 * @return Un entero que representa la posición de la cacion una vez ordenado el
	 *         vector
	 */
	private static int posicionDeK(int n, int[] a, int k) {
		int cancion = a[k - 1];
		Arrays.sort(a);
		return (Arrays.binarySearch(a, cancion) + 1);
	}
}
