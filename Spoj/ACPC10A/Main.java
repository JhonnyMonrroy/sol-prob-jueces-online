import java.util.Scanner;

/**
 * [https://www.spoj.com] Solución al problema ACPC10A - What’s Next
 * 
 * @author JhonnyMonrroy
 * @version 1.0 21 feb 2026
 */
//accepted xD
public class Main {
	public static void main(String[] args) {
		int a1, a2, a3;
		Scanner Lee = new Scanner(System.in);
		do {
			a1 = Lee.nextInt();
			a2 = Lee.nextInt();
			a3 = Lee.nextInt();

			if (a1 != 0 || a2 != 0 || a3 != 0)
				System.out.println(solucion(a1, a2, a3));
		} while (a1 != 0 || a2 != 0 || a3 != 0);
		Lee.close();
	}

	private static String solucion(int a1, int a2, int a3) {
		// verificamos si es una progresión aritmetica
		if(a2-a1==a3-a2)
			return String.format("AP %d", a3+a2-a1);
		else
			return String.format("GP %d", a3*a2/a1);
	}
}
