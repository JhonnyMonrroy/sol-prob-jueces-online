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
 TASK: palsquare

 * Soluci&oacute;n al Problema: palsquare - Cuadrados Palindromos
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 30-sep-2020
  */
// All tests OK.!!! xD
public class palsquare {
	public static void main(String[] args) throws IOException {
		BufferedReader file_in = new BufferedReader(new FileReader("palsquare.in"));
		PrintWriter file_out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
		Scanner in = new Scanner(file_in);
		/////////
		int b = in.nextInt();
		in.close();
		for (int i = 1; i <= 300; i++) {
			int square = i * i;
			String square_baseB = Integer.toString(i, b);
			String n_baseB = Integer.toString(square, b);
			if (n_baseB.equals(new StringBuffer(n_baseB).reverse().toString())) {
				file_out.println(square_baseB.toUpperCase() + " " + n_baseB.toUpperCase());
			}
		}
		/////////
		file_out.close();
		System.exit(0);
	}
}
