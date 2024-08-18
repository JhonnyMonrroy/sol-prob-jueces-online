import java.util.Scanner;

/**
 * Soluci&oacute;n al problema 791A - Bear and Big Brother -
 * [https://codeforces.com/]
 *
 * @author BreakDark - JhonnyMon (Jhonny Monrroy)
 * @version 1.0beta - 11 abr. de 2020
 */
// Accepted!!! xD
public class Main {
	public static void main(String[] args) {
		int a, b;
		Scanner Lee = new Scanner(System.in);

		a = Lee.nextInt();
		b = Lee.nextInt();
		for (int i = 1; i < 10000; i++) {
			a *= 3;
			b <<= 1;
			if (a > b) {
				System.out.println(i);
				break;
			}
		}

		Lee.close();
	}
}
