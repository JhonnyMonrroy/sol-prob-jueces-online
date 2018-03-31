// Correct Answer!!! xD
import java.util.Arrays;
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: HORSES - Racing Horses
 * [https://www.codechef.com/]
 *
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 25 mar. de 2018
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para los datos de entrada
		int t, n;
		int[] s;
		int i; // para los bucles

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		t = Lee.nextInt();
		while (t-- > 0) {
			n = Lee.nextInt();
			s = new int[n];
			for (i = 0; i < n; i++)
				s[i] = Lee.nextInt();
			System.out.println(buscarMinimoSkill(s, n));
		}
		Lee.close();
	}

	/**
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 25 mar. de 2018
	 * @param s
	 *            Vector de skills
	 * @param n
	 *            Tamaño del vector
	 * @return El entero que representa la minima diferencia entre los skills
	 */
	private static int buscarMinimoSkill(int[] s, int n) {
		int min = Integer.MAX_VALUE;
		Arrays.sort(s);
		for (int i = 0; i < n - 1; i++)
			if (s[i + 1] - s[i] < min)
				min = s[i + 1] - s[i];
		return min;
	}
}
