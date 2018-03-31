// Correct Answer!!! xD
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: SUMTRIAN - Sums in a Triangle
 * [https://www.codechef.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0b 26 feb. 2017
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para los datos de entrada
		int n, numFil; // casos y numero de lineas
		int[][] tri; // el triangulo
		int i, j; // para los bucles

		// aqui inicia el programa
		Lee = new Scanner(System.in);
		n = Lee.nextInt();
		while (n-- > 0) {
			numFil = Lee.nextInt();
			tri = new int[numFil][numFil];
			for (i = 0; i < numFil; i++)
				for (j = 0; j <= i; j++)
					tri[i][j] = Lee.nextInt();
			System.out.println(obtenerResultado(tri, numFil));
		}
		Lee.close();
	}

	/**
	 * Función que obtienen el resultado del problema, <br/>
	 * se utiliza programación dinamica
	 * 
	 * @param tri
	 *            El triangulo
	 * @param numFil
	 *            numero de filas
	 * @return un entero con la solución al problema
	 */
	public static int obtenerResultado(int[][] tri, int numFil) {
		int[][] acum = new int[numFil][numFil]; // para las sumas
		int i, j; // para los bucles

		for (i = 0; i < numFil; i++)
			acum[numFil - 1][i] = tri[numFil - 1][i];

		for (i = numFil - 2; i >= 0; i--)
			for (j = 0; j <= i; j++)
				acum[i][j] = Math.max(tri[i][j] + acum[i + 1][j], tri[i][j] + acum[i + 1][j + 1]);
		return acum[0][0];
	}
}
