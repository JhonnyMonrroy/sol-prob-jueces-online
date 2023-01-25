import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: INSTAGRAM - Instagram
 * [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 24 ene 2023
 */
// Correct Answer!!! xD
class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t, x, y;

		t = read.nextInt();
		while (t-- > 0) {
			x = read.nextInt();
			y = read.nextInt();
			System.out.println(x > 10 * y ? "YES" : "NO");
		}

		read.close();
	}
}
