import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: FIT - Fitness [https://www.codechef.com/]
 * 
 * @author jmonrroy (JhonnyMon)
 * @version 1.0 18 ene. de 2023
 */
// Correct Answer!!! xD
class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t;

		t = read.nextInt();
		while (t-- > 0)
			System.out.println(read.nextInt() * 10);

		read.close();
	}
}
