import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: AGELIMIT - Age Limit [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 25 ene 2023
 */
// Correct Answer!!! xD
class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t, x, y, a;

		t = read.nextInt();
		while (t-- > 0) {
			x = read.nextInt();
			y = read.nextInt();
			a = read.nextInt();
			System.out.println((x <= a && a < y) ? "YES" : "NO");
		}

		read.close();
	}
}
