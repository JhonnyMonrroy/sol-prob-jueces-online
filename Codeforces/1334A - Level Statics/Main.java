import java.util.Scanner;

/**
 * @author BreakDark - JhonnyMon (Jhonny Monrroy)
 */
// Accepted!!! xD
public class Main {
	public static void main(String[] args) {
		int t, n, i;
		int p, c;
		int p_i, c_i;
		boolean imposible = false;
		Scanner Lee = new Scanner(System.in);

		t = Lee.nextInt();
		while (t-- > 0) {
			n = Lee.nextInt();
			p_i = -1;
			c_i = -1;
			imposible = false;
			for (i = 0; i < n; i++) {
				p = Lee.nextInt();
				c = Lee.nextInt();
				if (esImposible(p_i, c_i, p, c)) {
					imposible = true;
				}
				p_i = p;
				c_i = c;
			}
			if (imposible)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		Lee.close();
	}

	private static boolean esImposible(int p_i, int c_i, int p, int c) {
		return (p < p_i || c < c_i || c - c_i > p - p_i || (p == p_i && c > c_i));
	}
}
