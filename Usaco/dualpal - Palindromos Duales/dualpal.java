import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 ID: breakd1
 LANG: JAVA
 TASK: dualpal
*/
/**
 * Soluci&oacute;n al Problema: dualpal - Palindromos Duales
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 30-sep-2020
 *
 */
// All tests OK.!!! xD
public class dualpal {
	public static void main(String[] args) throws IOException {
		BufferedReader file_in = new BufferedReader(new FileReader("dualpal.in"));
		PrintWriter file_out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
		Scanner in = new Scanner(file_in);
		/////////
		int n = in.nextInt();
		int s = in.nextInt() + 1;
		in.close();
		while (n > 0) {
			int count_pal = 0;
			for (int i = 2; i <= 10 && n > 0; i++) {
				String numBaseI = Integer.toString(s, i);
				if (numBaseI.equals(new StringBuffer(numBaseI).reverse().toString())) {
					count_pal++;
				}
			}
			if (count_pal > 1) {
				file_out.println(s);
				n--;
			}
			s++;
		}

		/////////
		file_out.close();
		System.exit(0);
	}
}
