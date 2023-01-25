import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: LOCKDRAW - Chef and Lockout Draws
 * [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 20 ene 2023
 */
// Correct Answer!!! xD
class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t;
		int a, b, c;

		t = read.nextInt();
		while (t-- > 0) {
			a = read.nextInt();
			b = read.nextInt();
			c = read.nextInt();
			System.out.println((a == b + c || b == a + c || c == a + b) ? "YES" : "NO");
		}

		read.close();
	}

}
