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
 TASK: namenum
*/
/**
 * Soluci&oacute;n al Problema: namenum - Nombre este numero
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 21-sep-2020
 */
//All tests OK.!!! xD
public class namenum {
	public static void main(String[] args) throws IOException {
		BufferedReader f_namenum = new BufferedReader(new FileReader("namenum.in"));
		BufferedReader f_dict = new BufferedReader(new FileReader("dict.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
//		StringTokenizer Lee; // para leer los elementos de la linea
		Scanner Lee = new Scanner(f_namenum);

		/////////
		long n = Lee.nextLong();
		boolean exist_ans = false;
		String name;
		Lee.close();
		Lee = new Scanner(f_dict);
		while (Lee.hasNext()) {
			name = Lee.next();
			// consultamos si corresponde al numero
			if (n == transform(name)) {
				out.println(name);
				exist_ans = true;
			}
		}
		Lee.close();
		if (!exist_ans)
			out.println("NONE");
		/////////
		out.close();
		System.exit(0);
	}

	/**
	 * Fuenci&oacute;n que transforma un nombre a numero
	 * 
	 * @param name String a transformar
	 * @return Un entero largo transformado
	 */
	private static long transform(String name) {
		long result = 0;
		for (int i = 0; i < name.length(); i++) {
			switch (name.charAt(i)) {
			case 'A':
			case 'B':
			case 'C':
				result = result * 10 + 2;
				break;
			case 'D':
			case 'E':
			case 'F':
				result = result * 10 + 3;
				break;
			case 'G':
			case 'H':
			case 'I':
				result = result * 10 + 4;
				break;
			case 'J':
			case 'K':
			case 'L':
				result = result * 10 + 5;
				break;
			case 'M':
			case 'N':
			case 'O':
				result = result * 10 + 6;
				break;
			case 'P':
			case 'R':
			case 'S':
				result = result * 10 + 7;
				break;
			case 'T':
			case 'U':
			case 'V':
				result = result * 10 + 8;
				break;
			case 'W':
			case 'X':
			case 'Y':
				result = result * 10 + 9;
				break;
			}
		}
		return result;
	}
}
