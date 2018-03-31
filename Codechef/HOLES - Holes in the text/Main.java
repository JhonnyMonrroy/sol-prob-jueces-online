// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * HOLES - Holes in the text - [http://www.codechef.com - 23012011]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		byte t; // casos de prueba
		String cadena; // para leer una cadena
		byte i; // para los bucles
		int c; // para contar los agujeros
		// EL PROGRAMA INICIA AQUI
		Lee = new Scanner(System.in);
		t = Lee.nextByte();
		while (t > 0) {
			cadena = Lee.next();
			c = 0;
			for (i = 0; i < cadena.length(); i++) {
				switch (cadena.charAt(i)) {
				case 'A':
					c++;
					break;
				case 'B':
					c += 2;
					break;
				case 'D':
					c++;
					break;
				case 'O':
					c++;
					break;
				case 'P':
					c++;
					break;
				case 'Q':
					c++;
					break;
				case 'R':
					c++;
					break;
				default:
					break;
				}
			}
			System.out.println(c);
			t--;
		}
	}
}