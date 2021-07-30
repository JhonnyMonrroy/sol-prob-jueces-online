import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.BitSet;
import java.util.Scanner;

/*
 ID: breakd1
 LANG: JAVA
 TASK: barn1
*/
/**
 * Soluci&oacute;n al Problema: barn1 - Reparacion de Establo
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0.1 beta 24 jul 2021
 *
 */
// All tests OK.!!! xD
public class barn1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("barn1.in"));
//		BufferedReader in = new BufferedReader(new FileReader("test8.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
		Scanner Read = new Scanner(in);
//		Scanner Read = new Scanner(System.in);

		short m, s, c;
		BitSet mangers; // pesebreras ocupadas

		m = Read.nextShort();
		s = Read.nextShort();
		c = Read.nextShort();

		mangers = new BitSet(s + 1);
		for (int i = 0; i < c; i++)
			mangers.set(Read.nextInt());

		int empty = 1;
		while (m < countGroups(mangers)) {
			// llenar vacios
			// buscamos a los grupos que es posible llenar
			int best_manger_empty_ini = 0, best_manger_empty_end = 0;
			int min_number_manger_fill = Integer.MAX_VALUE;

			boolean any_located = false;
			for (int i = 1; i + empty <= s; i++)
				if (!mangers.get(i) && mangers.get(i - 1) && mangers.get(i + empty)) {
					// contamos cuantas pesebreras se cocuparan
					int num_manger_fill = 0;
					// contamos hacia atras
					for (int index_m = i - 1; index_m >= 0 && mangers.get(index_m); num_manger_fill++, index_m--)
						;
					// contamos hacia adelante
					for (int index_m = i + empty; index_m < s && mangers.get(index_m); num_manger_fill++, index_m++)
						;
					// verificamos si es el mejor candidato
					if (num_manger_fill < min_number_manger_fill) {
						best_manger_empty_ini = i;
						best_manger_empty_end = i + empty;
						min_number_manger_fill = num_manger_fill;
						// marcamos que encontramos un candidato
						any_located = true;
					}
				}

			// llenamos los vacios del mejor candidato
			if (any_located)
				mangers.set(best_manger_empty_ini, best_manger_empty_end);
			else
				empty++;
			// imprimimos un mapa de casillas llenadas para ver que sucede
//			for(int i=1;i<=s;i++)
//				System.out.print(mangers.get(i)?'#':' ');
//			System.out.println("\t"+mangers.cardinality());
		}
//		System.out.println(mangers.cardinality());
		out.println(mangers.cardinality());

		Read.close();
		out.close();
	}

	private static int countGroups(BitSet mangers) {
		int c = 0;
		boolean lastOccupied = false;
		for (int i = 0; i < mangers.length(); i++) {
			if (mangers.get(i)) {
				if (!lastOccupied)
					c++;
				lastOccupied = true;
			} else
				lastOccupied = false;
		}
		return c;
	}

}
