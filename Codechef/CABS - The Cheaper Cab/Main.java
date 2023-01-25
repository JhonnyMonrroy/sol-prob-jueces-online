import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: CABS - The Cheaper Cab
 * [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 15 ene 2023
 */
// Correct Answer xD
class Main {

	/**
	 * @author Jhonny Monrroy (Jhonny Monrroy)
	 * @version 1.0 15 ene 2023
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t, x, y;

		t = read.nextInt();
		while (t-- > 0) {
			x = read.nextInt();
			y = read.nextInt();
			System.out.println(x < y ? "FIRST" : y < x ? "SECOND" : "ANY");
		}

		read.close();
	}

}
