import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: PRACTICEPERF - Practice makes us perfect
 * [https://www.codechef.com/]
 * 
 * @author jmonrroy (JhonnyMon)
 * @version 1.0 16 ene. de 2023
 */
// Correct Answer!!! xD
class Main {

	/**
	 * @author jmonrroy (JhonnyMon)
	 * @version 1.0 16 ene. de 2023
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		while (read.hasNext()) {
			int c = 0; // contador de semanas en donde se cumpio la consigna
			for (int i = 0; i < 4; i++)
				c = read.nextInt() >= 10 ? c + 1 : c;
			System.out.println(c);
		}

		read.close();
	}

}
