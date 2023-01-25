import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: HIGHSCORE - Score High
 * [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 22 ene 2023
 */
// Correct Answer!!! xD
class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t, na, max;

		t = read.nextInt();
		while (t-- > 0) {
			read.nextInt();
			max = Integer.MIN_VALUE;
			for (int i = 0; i < 4; i++) {
				na = read.nextInt();
				if (na > max)
					max = na;
			}
			System.out.println(max);
		}

		read.close();
	}
}
