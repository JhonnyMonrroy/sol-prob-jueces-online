import java.util.HashMap;
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: COINS - Bytelandian gold coins
 * [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 30 mar. de 2018
 */
// ACEPTADO!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para los datos de entrada
		int n;

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		while (Lee.hasNext()) {
			n = Lee.nextInt();
			System.out.println(solucion(n));
		}
		Lee.close();
	}

	/**
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 6 abr. de 2020
	 * @param n
	 *            Cantidad de monedas a cambiar
	 * @return Un entero que representa la cantidad de dolares que se pueden obtener
	 */
	private static long solucion(int n) {
		HashMap<Long, Long> cd = new HashMap<Long, Long>();
		return cantidadDolares(n, cd);
	}

	/**
	 * Funcion pseudorecursiva
	 *
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 30 mar. de 2018
	 * @param n
	 *            Cantidad de monedas a cambiar
	 * @param cd
	 *            Array con los resultados de calcular la cantidad de dolares
	 *            necesarios
	 * @return Un entero que representa la cantidad de dolares que se pueden obtener
	 */
	private static long cantidadDolares(long n, HashMap<Long, Long> cd) {
		if (n == 0)
			return n;
		if (!cd.containsKey(n)) {
			long cambio = cantidadDolares(n / 2, cd) + cantidadDolares(n / 3, cd) + cantidadDolares(n / 4, cd);
			cd.put((long) n, Math.max(cambio, n));
		}
		return cd.get(n);
	}
}
