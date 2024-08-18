import java.util.Scanner;

/**
 * Soluci&oacute;n al problema 479A - Expression - [https://codeforces.com]
 * 
 * @author JhonnyMonrroy - JhonnyMon (Jhonny Monrroy)
 * @version 1.0 beta - 16 jul. de 2024
 */
// Accepted!!! xD
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println(solucion(read.nextInt(), read.nextInt(), read.nextInt()));

		read.close();
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return Retorna el maximo valor que se puede obtener
	 */
	public static int solucion(int a, int b, int c) {
		int resultA = 0, resultB = 0, array[] = { a, b, c };

		// de izquierda a derecha
		for (int i = 0; i < 3; i++) {
			if (resultA * array[i] > resultA + array[i])
				resultA *= array[i];
			else
				resultA += array[i];
		}

		// de derecha a izquierda
		for (int i = 2; i >=0; i--) {
			if (resultB * array[i] > resultB + array[i])
				resultB *= array[i];
			else
				resultB += array[i];
		}
		
		return Math.max(resultA, resultB);
	}
}
