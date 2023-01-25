import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: FLOW004 - First and Last Digit
 * [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 4 abr. de 2020
 */
// ACEPTADO XD!!!
public class Main {
	/**
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 4 abr. de 2020
	 * @param args
	 */
	public static void main(String[] args) {
		int t, i;
		String n;
		Scanner Lee = new Scanner(System.in);

		// ACA INICIA EL PROGRAMA
		t = Lee.nextInt();
		for (i = 0; i < t; i++) {
			n = Lee.next();
			System.out.println((n.charAt(0) - '0') + (n.charAt(n.length() - 1) - '0'));
		}

		Lee.close();
	}
}
