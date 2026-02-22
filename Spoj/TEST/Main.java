import java.util.Scanner;

/**
 * TEST - Life, the Universe, and Everything [http://www.spoj.pl]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		byte num; // para el numero que se lee

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		num = Lee.nextByte();
		while (num != 42) {
			System.out.println(num);
			num = Lee.nextByte();
		}
	}
}
