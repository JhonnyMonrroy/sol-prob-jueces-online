import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: TRICOIN - Coins And Triangle
 * [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 21 ene 2023
 */
// Correct Answer!!! xD
class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t;
		double n;

		t = read.nextInt();
		while (t-- > 0) {
			n = read.nextInt();
			System.out.println((int) (Math.sqrt(0.25 + 2 * n) - 0.5));
		}

		read.close();
	}

}
