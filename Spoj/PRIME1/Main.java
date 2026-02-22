import java.util.BitSet;
import java.util.Scanner;

/**
 * PRIME1 - Prime Generator [http://www.spoj.pl]
 * 
 * @author BreakDark
 * @version 1.0 beta Agradecimientos a Jamie Wong por publicar su codigo
 */
// ACEPTADO!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		int[] primos; // vector de primos
		int numPrimos; // para el numero de primos
		int i, j; // para los bucles
		boolean esPrimo; // para marcar si un numero es primo
		double capacidad; // para marcar hasta que numero contar
		byte T; // para el numero de casos de prueba
		int N, M; // los limites
		BitSet sonPrimos = new BitSet(100001); // para marcar cuales son primos
		int auxPrimo; // un primo auxiliar
		int inicio; // para saber desde donde hay que contar

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		// generamos los primos
		primos = new int[4000];
		numPrimos = 0;
		primos[numPrimos++] = 2;
		for (i = 3; i <= 32000; i += 2) {
			esPrimo = true;
			capacidad = Math.sqrt(i) + 1.0;
			for (j = 0; j < numPrimos; j++) {
				if (j >= capacidad)
					break;
				if (i % primos[j] == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo)
				primos[numPrimos++] = i;
		}
		T = Lee.nextByte();
		while (T-- > 0) {
			M = Lee.nextInt();
			N = Lee.nextInt();
			j = 0;
			i = M;
			if (M < 2)
				M = 2;
			sonPrimos.clear();
			// nos basamos en generar una criba pero desde el valos de M
			for (i = 0; i < numPrimos; i++) {
				auxPrimo = primos[i];
				if (auxPrimo >= M)
					inicio = auxPrimo * 2;
				else
					inicio = M + ((auxPrimo - (M % auxPrimo)) % auxPrimo);	// cod clave
				for (j = inicio; j <= N; j += auxPrimo)
					sonPrimos.set(j - M);
			}
			// mostramos los que son primos
			for (i = M; i <= N; i++)
				if (!sonPrimos.get(i - M))
					System.out.println(i);
			// una line en blanco entre dos salidas
			if (T > 0)
				System.out.println();
		}
	}
}
