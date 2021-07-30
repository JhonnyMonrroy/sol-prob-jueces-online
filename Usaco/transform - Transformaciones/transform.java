import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 ID: breakd1
 LANG: JAVA
 TASK: transform
*/
/**
 * Soluci&oacute;n al Problema: transform - Transformaciones
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 15-sep-2020
 */
// All tests OK. xD 
public class transform {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("transform.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
		StringTokenizer Lee; // para leer los elementos de la linea

		/////////
		int n, i, j;
		boolean[][] d_origin;
		boolean[][] d_final;

		String line;

		Lee = new StringTokenizer(file.readLine());
		n = Short.parseShort(Lee.nextToken());
		d_origin = new boolean[n][n];
		for (i = 0; i < n; i++) {
			line = file.readLine();
			for (j = 0; j < line.length(); j++)
				d_origin[i][j] = (line.charAt(j) == '@');
		}
		d_final = new boolean[n][n];
		for (i = 0; i < n; i++) {
			line = file.readLine();
			for (j = 0; j < line.length(); j++)
				d_final[i][j] = (line.charAt(j) == '@');
		}

		out.println(solution(d_origin, d_final));
		/////////
		out.close();
		System.exit(0);
	}

	private static int solution(boolean[][] d_origin, boolean[][] d_final) {
		boolean[][] d_aux;
		// #1 Rotacion 90 grados
		d_aux = rotateRight90(d_origin);
		if (areEqual(d_final, d_aux))
			return 1;
		// #2 Rotacion 180 grados
		d_aux = rotateRight90(d_aux);
		if (areEqual(d_final, d_aux))
			return 2;
		// #3 Rotacion 270 grados
		d_aux = rotateRight90(d_aux);
		if (areEqual(d_final, d_aux))
			return 3;
		// #4 Reflejo
		d_aux = new boolean[d_origin.length][d_origin.length];
		for (int i = 0; i < d_origin.length; i++)
			for (int j = 0; j < d_origin.length; j++)
				d_aux[i][j] = d_origin[i][d_origin.length - 1 - j];
		if (areEqual(d_final, d_aux))
			return 4;
		// #5 combinacion
		for (int i = 0; i < 3; i++) {
			d_aux = rotateRight90(d_aux);
			if (areEqual(d_final, d_aux))
				return 5;
		}
		// #6 ningun cambio
		if (areEqual(d_final, d_origin))
			return 6;
		// #7 transformacion invalida
		return 7;
	}

	private static boolean areEqual(boolean[][] d_origin, boolean[][] d_compare) {
		for (int i = 0; i < d_origin.length; i++)
			for (int j = 0; j < d_origin.length; j++)
				if (d_origin[i][j] != d_compare[i][j])
					return false;
		return true;
	}

	private static boolean[][] rotateRight90(boolean[][] d_origin) {
		boolean[][] result = new boolean[d_origin.length][d_origin.length];
		for (int i = 0; i < d_origin.length; i++)
			for (int j = 0; j < d_origin.length; j++)
				result[j][d_origin.length - 1 - i] = d_origin[i][j];
		return result;
	}
}
