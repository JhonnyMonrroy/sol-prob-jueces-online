import java.util.Scanner;

/**
 * Solucion al Problema: 546A - Soldier and Bananas [http://codeforces.com]
 *
 * @author BreakDark
 */
// Accepted!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee = new Scanner(System.in);

		System.out.println(soldierAndBananas(Lee.nextInt(), Lee.nextInt(), Lee.nextInt()));

		Lee.close();
	}

	/**
	 * @param k
	 *            the cost of the first banana
	 * @param n
	 *            initial number of dollars the soldier has
	 * @param w
	 *            number of bananas he wants
	 * @return the amount of dollars that the soldier must borrow from his friend.
	 *         If he doesn't have to borrow money, output 0
	 */
	public static long soldierAndBananas(int k, int n, int w) {
		long requerido = 0;
		long diferencia;
		for (int i = 1; i <= w; i++) {
			if (n - i * k >= 0)
				n -= i * k;
			else {
				diferencia = i * k - n;
				n = 0;
				requerido += diferencia;
			}
		}
		return requerido;
	}
}
