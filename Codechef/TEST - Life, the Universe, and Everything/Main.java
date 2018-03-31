// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * Life, the Universe, and Everything Problem code: TEST
 * [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		byte num; // para leer el numero y mostrarlo

		// Aqui inicia el programa
		Lee = new Scanner(System.in);
		num = Lee.nextByte();
		while (num != 42) {
			System.out.println(num);
			num = Lee.nextByte();
		}
	}
}
