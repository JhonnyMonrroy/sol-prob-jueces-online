import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: MARCHA1 - Paying up [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 4 abr. de 2020
 */
// ACEPTADO XD!!!
public class Main {
	/**
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 4 abr. de 2020
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Lee = new Scanner(System.in);
		int t, n, m;
		int[] billetes;

		// ACA INICIA EL PROGRAMA
		t = Lee.nextInt();
		while (t-- > 0) {
			n = Lee.nextInt();
			m = Lee.nextInt();
			billetes = new int[n];
			for (int i = 0; i < n; i++) {
				billetes[i] = Lee.nextInt();
			}
			System.out.println(solucion(n, m, billetes));
		}

		Lee.close();
	}

	/**
	 * Se usa el metodo de generar todos los subconjuntos posibles y buscar su suma
	 *
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 4 abr. de 2020
	 * @param n
	 *            Numero de billetes
	 * @param m
	 *            Monto solicitado por el Gangster
	 * @param billetes
	 *            Un array con el monto de cada billete
	 * @return Un String <code>Yes</code> si hay un subconjunto que sume m, caso
	 *         contrario <code>No</code>
	 */
	private static String solucion(int n, int m, int[] billetes) {
		for (int i = 1; i < (1 << n); i++) {
			int suma = 0;
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0)
					suma += billetes[j];
			}
			if (suma == m)
				return "Yes";
		}
		return "No";
	}
}
