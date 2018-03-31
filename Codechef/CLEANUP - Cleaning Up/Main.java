// Correct Answer!!! xD
import java.util.BitSet;
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: CLEANUP - Cleaning Up
 * [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 25 mar. de 2018
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para los datos de entrada
		int t, n, m, ind[];
		int i; // para los indices

		// ACA INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		t = Lee.nextInt();
		while (t-- > 0) {
			n = Lee.nextInt();
			m = Lee.nextInt();
			ind = new int[m];
			for (i = 0; i < m; i++)
				ind[i] = Lee.nextInt();
			solucion(n, m, ind);
		}
		Lee.close();
	}

	/**
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 25 mar. de 2018
	 * @param n
	 *            Numero de tareas
	 * @param m
	 *            Numero de tareas completadas
	 * @param ind
	 *            Vector de tareas completadas
	 */
	private static void solucion(int n, int m, int[] ind) {
		BitSet tareas = new BitSet(n);
		String chef = "", asistente = "";
		boolean b_chef = true;
		int i;

		for (i = 0; i < m; i++)
			tareas.set(ind[i] - 1);

		// buscamos las tareas para cada uno
		for (i = 0; i < n; i++)
			if (!tareas.get(i)) {
				if (b_chef)
					chef += (i + 1) + " ";
				else
					asistente += (i + 1) + " ";
				b_chef = !b_chef;
			}

		// imprimimos el resultado
		System.out.println(chef.length() > 0 ? chef.substring(0, chef.length() - 1) : "");
		System.out.println(asistente.length() > 0 ? asistente.substring(0, asistente.length() - 1) : "");
	}
}
