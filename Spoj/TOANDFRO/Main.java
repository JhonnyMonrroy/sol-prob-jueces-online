import java.util.Scanner;

/**
 * TOANDFRO [http://www.spoj.pl]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		byte n; // para el entero de 1...20
		char[][] mat; // para guardar el mensaje encriptado
		char[] vecTemp; // un vector de caracteres temporal
		int i, j, k; // para los bucles
		boolean aDerecha; // un switch para ir a la derecha o izquierda

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		n = Lee.nextByte();
		while (n > 0) {
			vecTemp = Lee.next().toCharArray();
			mat = new char[n][vecTemp.length / n];
			// llenamos la matriz
			j = 0; // columna
			k = 0; // fila
			aDerecha = true;
			for (i = 0; i < vecTemp.length; i++) {
				if (aDerecha) {
					mat[k++][j] = vecTemp[i];
					if (k == n) {
						aDerecha = !aDerecha;
						j++;
					}
				} else {
					mat[--k][j] = vecTemp[i];
					if (k == 0) {
						aDerecha = !aDerecha;
						j++;
					}
				}
			}
			// mostramos el resultado
			for (i = 0; i < n; i++)
				System.out.print(mat[i]);
			System.out.println();
			n = Lee.nextByte();
		}
	}
}
