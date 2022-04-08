import java.util.BitSet;
import java.util.Scanner;

/**
 * 11408 - Count DePrimes [http://uva.onlinejudge.org]
 * 
 * @author BreakDark
 * @version 2.1 beta Agradecimientos al Lic. Jorge Teran Por su Libro
 *          Fundamentos de programacion 2da edicion
 */
// ACEPTADO!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		int a, b;
		int[] dePrimos = new int[5000001]; // para generar los dePrimos
		BitSet criba = new BitSet(5000001); // para la criba de primos
		int i, j; // para los bucles
		int cont; // para contar los DePrimos

		// EL PROGRAMA INICIA AQUI
		// generamos la criba especial
		for (i = 2; i <= 5000000; i++) {
			if (!criba.get(i)) {
				for (j = i + i; j <= 5000000; j += i) {
					dePrimos[j] += i;
					criba.set(j);
				}
			}
		}
		// contamos los dePrimos
		cont = 0;
		for (i = 2; i <= 5000000; i++) {
			if (!criba.get(dePrimos[i]))
				dePrimos[i] = ++cont;
			else
				dePrimos[i] = cont;
		}
		// leemos los datos
		Lee = new Scanner(System.in);
		a = Lee.nextInt();
		while (a > 0) {
			b = Lee.nextInt();
			System.out.println(dePrimos[b] - dePrimos[a - 1]);
			a = Lee.nextInt();
		}
	}
}
