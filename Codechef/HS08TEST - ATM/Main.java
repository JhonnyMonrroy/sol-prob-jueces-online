// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * ATM Problem code: HS08TEST [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		int montoRetirar; // monto a retirar
		int saldo; // saldo multiplicado por dos

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		while (Lee.hasNext()) {
			montoRetirar = Lee.nextInt() * 100;
			saldo = (int) (Double.parseDouble(Lee.next()) * 100);
			// preguntar si hay saldo suficiente
			if (montoRetirar <= saldo - 50) {
				// preguntar si el monto es multiplo de 5
				if (montoRetirar % 500 == 0) {
					saldo -= montoRetirar;
					saldo -= 50;
				}
			}
			// mostramos el saldo sobrante
			System.out.println(String.format("%.2f", ((double) (saldo) / 100))
					.replace(',', '.'));
		}
	}
}
