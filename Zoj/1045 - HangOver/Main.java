import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: 1045 - HangOver
 * [http://acm.zju.edu.cn/onlinejudge/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 20 feb. de 2018
 */
// Accepted!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para ller los datos de entrada
		double c; // para la longitud buscada
		double suma;
		int i;

		// ACA INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		c = Double.parseDouble(Lee.next());
		while (c > 0.00) {
			suma = 0.0;
			i = 2;
			while (suma < c) {
				suma += 1 / (double) i;
				i++;
			}
			System.out.println((i - 2) + " card(s)");
			c = Double.parseDouble(Lee.next());
		}
		Lee.close();
	}
}
