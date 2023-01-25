import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: SQUATS - Squats [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 25 ene 2023
 */
// Correct Answer!!! xD
class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t;

		t = read.nextInt();
		while (t-- > 0)
			System.out.println(read.nextInt() * 15);

		read.close();
	}
}
