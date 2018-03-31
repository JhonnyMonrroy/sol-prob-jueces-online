// Correct Answer!!! xD
import java.util.Scanner;

/**
 * Problema: A1 - Paying up [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0.1 beta 28/02/2017
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee;// para leer los datos de entrada
		int t; // numero de casos de prueba
		int n; // total bancknotes
		int[] banknote; // bancknotes
		int m; // monto consultado
		int i; // para los bucles

		// aqui inicia el programa
		Lee = new Scanner(System.in);
		t = Lee.nextInt();
		while (t-- > 0) {
			n = Lee.nextInt();
			banknote = new int[n];
			m = Lee.nextInt();
			for (i = 0; i < n; i++)
				banknote[i] = Lee.nextInt();
			procesar(banknote, n, m);
		}
		Lee.close();
	}

	/**
	 * Metodo: procesar, resuelve el problema
	 * 
	 * @param banknote
	 *            vector de banknotes
	 * @param n
	 *            total banknotes
	 * @param m
	 *            monto a consultar
	 */
	private static void procesar(int[] banknote, int n, int m) {
		// utilizamos el algoritmo de obtener todos los subconjuntos
		int nbits = n;
		int max = 1 << n;
		int i, j, s;
		for (i = 1; i < max; i++) {
			s = 0;
			for (j = 0; j < nbits; j++) {
				if ((i & 1 << j) > 0)
					s += banknote[j];
			}
			if (s == m) {
				System.out.println("Yes");
				return;
			}
		}
		// si no se encontro algun subconjunto compatible
		System.out.println("No");
		return;
	}
}
