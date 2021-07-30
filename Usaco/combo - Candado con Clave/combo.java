import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 ID: breakd1
 LANG: JAVA
 TASK: combo
*/
/**
 * Soluci&oacute;n al Problema: combo - Candado con Clave
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0.2 beta 29 jul 2021
 *
 */
// All tests OK. xD
public class combo {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("combo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
		Scanner read = new Scanner(in);

		int n;
		int[] combJuan = new int[3];
		int[] combMaster = new int[3];

		// leemos los datos
		n = read.nextInt();
		for (int i = 0; i < 3; i++)
			combJuan[i] = read.nextInt();
		for (int i = 0; i < 3; i++)
			combMaster[i] = read.nextInt();

		read.close();

		out.println(solution(n, combJuan, combMaster));
		out.close();
	}

	/**
	 * @param n          el numero de elementos que tiene cada dial
	 * @param combJuan   combinaci&oacute;n de Juan
	 * @param combMaster combinaci&oacute;n Master
	 * @return El numero de combinaciones de los diales que abriran el candado
	 */
	static int solution(int n, int[] combJuan, int[] combMaster) {
		Set<String> comb = new HashSet<String>();
		int a, b, c;
		int[][] combinations = { combJuan, combMaster };
		for (int q = 0; q < 2; q++) {
			// generamos las combinaciones
			for (int i = combinations[q][0] - 2; i <= combinations[q][0] + 2; i++) {
				if (i <= 0 && n + i > 0) {
					a = n + i;
				} else if (i > n && i - n <= n) {
					a = i - n;
				} else {
					a = i > 0 && i <= n ? i : n;
				}
				for (int j = combinations[q][1] - 2; j <= combinations[q][1] + 2; j++) {
					if (j <= 0 && n + j > 0) {
						b = n + j;
					} else if (j > n && j - n <= n) {
						b = j - n;
					} else {
						b = j > 0 && j <= n ? j : n;
					}
					for (int k = combinations[q][2] - 2; k <= combinations[q][2] + 2; k++) {
						if (k <= 0 && n + k > 0) {
							c = n + k;
						} else if (k > n && k - n <= n) {
							c = k - n;
						} else {
							c = k > 0 && k <= n ? k : n;
						}
						comb.add(a + "_" + b + "_" + c);
//						System.out.println("->" + a + "_" + b + "_" + c);
					}
				}
			}
		}
		return comb.size();
	}

}
