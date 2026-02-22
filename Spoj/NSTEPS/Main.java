import java.util.Scanner;

/**
 * NSTEPS [http://www.spoj.pl]
 * 
 * @author BreakDark
 * @version 2.0
 */
// ACEPTADO!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		int N; // el numero de casos de prueba
		short x, y; // pra las coordenadas
		// short[][] mat; // matriz para generar los numeros

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		// mat = generarMatriz();
		N = Lee.nextInt();
		while (N-- > 0) {
			x = Lee.nextShort();
			y = Lee.nextShort();
			if (x == y) {
				if ((x & 1) == 0)
					System.out.println(2 * x);
				else
					System.out.println(2 * x - 1);
			} else {
				if (y > x)
					System.out.println("No Number");
				else {
					if (y == x - 1)
						System.out.println("No Number");
					else {
						if (y == x - 2) {
							if ((x & 1) == 0)
								System.out.println(x + y);
							else
								System.out.println(x + y - 1);
						} else
							System.out.println("No Number");
					}
				}
			}
		}
	}
}
