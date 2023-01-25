import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: WORDLE - Wordle [https://www.codechef.com/]
 * 
 * @author jmonrroy (JhonnyMon)
 * @version 1.0 17 ene. de 2023
 */
// Correct Answer!!! xD
class Main {

	/**
	 * @author jmonrroy (Jhonny Monrroy)
	 * @version 1.0 17 ene. de 2023
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int numTests;
		String s, t, result;

		numTests = Integer.valueOf(read.nextLine());
		while (numTests-- > 0) {
			s = read.nextLine();
			t = read.nextLine();
			result = "";
			for (int i = 0; i < 5; i++)
				result += s.charAt(i) == t.charAt(i) ? 'G' : 'B';
			System.out.println(result);
		}

		read.close();
	}
}
