import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: TODOLIST - Problems in your to-do list
 * [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 21 ene 2023
 */
// Correct Answer!!! xD
class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t, n, c;

		t = read.nextInt();
		while (t-- > 0) {
			c = 0;
			n = read.nextInt();
			while (n-- > 0)
				c += read.nextInt() >= 1000 ? 1 : 0;
			System.out.println(c);
		}

		read.close();
	}
}
