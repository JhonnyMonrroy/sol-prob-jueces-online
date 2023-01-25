import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: BINTREE - Shortest Path in Binary Trees
 * [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 23 ene 2023
 */
// Correct Answer!!! xD
class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n, i, j, count;

		n = read.nextInt();
		while (n-- > 0) {
			i = read.nextInt();
			j = read.nextInt();
			count = 0;
			// buscamos a su padre comun y contamos a sus antepasados
			while (i != j) {
				if (i > j)
					i >>= 1;
				else
					j >>= 1;
				count++;
			}
			System.out.println(count);
		}

		read.close();
	}
}
