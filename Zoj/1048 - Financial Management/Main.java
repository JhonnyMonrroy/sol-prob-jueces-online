import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: 1048 - Financial Management
 * [http://acm.zju.edu.cn/onlinejudge/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 14 feb. de 2018
 */
// Accepted!!! xD
public class Main {

	public static void main(String[] args) {
		Scanner Lee; // Para leer los datos de entrada
		double suma;

		// ACA INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		suma = 0.0;
		for (int i = 0; i < 12; i++) {
			suma += Double.parseDouble(Lee.next()) * 100;
		}
		System.out.println(String.format("$%.2f", (double) Math.round(suma / 12) / 100).replace(',', '.'));
		Lee.close();
	}

}
