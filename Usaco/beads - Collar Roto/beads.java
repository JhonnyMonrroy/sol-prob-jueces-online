/*
 ID: breakd1
 LANG: JAVA
 TASK: beads
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.BitSet;
import java.util.StringTokenizer;

/**
 * Solucion al Problema: Problema 99 - Collar Roto
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 23/09/2014
 */
// ACEPTADO!!! xD
public class beads {
	public static void main(String[] args) throws IOException {
		// abrimos los archivos
		RandomAccessFile archivo = new RandomAccessFile("beads.in", "r");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"beads.out")));
		StringTokenizer Lee; // para leer lineas
		String linea; // para procesar una linea
		int n; // numero de cuentas
		char[] collar; // vector de caracteres
		// aqui inicia el programa
		Lee = new StringTokenizer(archivo.readLine());
		linea = Lee.nextToken();
		n = Integer.parseInt(linea);
		Lee = new StringTokenizer(archivo.readLine());
		linea = Lee.nextToken();
		collar = linea.toCharArray();

		out.println(numeroMayorDeCuentas(collar, n));
		out.close();
		System.exit(0);
	}

	/**
	 * Resuelve el problema
	 * 
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 beta 23/09/2014
	 * @param collar
	 *            Vector que representa el collar
	 * @param n
	 *            tamanio del collar (numero de cuentas)
	 * @return Un entero que representa el numero maximo de cuentas que se
	 *         pueden obtener.
	 */
	private static int numeroMayorDeCuentas(char[] collar, int n) {
		int max = 0;
		int i, j, s;
		BitSet cuentas = new BitSet(n);

		for (i = 0; i < n; i++) {
			s = 0;
			cuentas.clear();
			// buscamos hacia atras
			j = i - 1;
			if (j < 0)
				j = n - 1;
			while (collar[j] == 'w' && !cuentas.get(j) && s <= n) {
				cuentas.set(j);
				j--;
				if (j < 0)
					j = n - 1;
				s++;
			}
			if (collar[j] == 'r') {
				// buscamos rojos
				while ((collar[j] == 'r' || collar[j] == 'w')
						&& !cuentas.get(j) && s <= n) {
					cuentas.set(j);
					j--;
					if (j < 0)
						j = n - 1;
					s++;
				}
			} else {
				// buscamos azules
				while ((collar[j] == 'b' || collar[j] == 'w')
						&& !cuentas.get(j) && s <= n) {
					cuentas.set(j);
					j--;
					if (j < 0)
						j = n - 1;
					s++;
				}
			}
			// buscamos hacia adelante
			j = i;
			while (collar[j] == 'w' && !cuentas.get(j)) {
				cuentas.set(j);
				j++;
				if (j == n)
					j = 0;
			}
			if (collar[j] == 'r') {
				// buscamos rojos
				j = i;
				while ((collar[j] == 'r' || collar[j] == 'w')
						&& !cuentas.get(j) && s <= n) {
					cuentas.set(j);
					j++;
					if (j == n)
						j = 0;
					s++;
				}
			} else {
				// buscamos azules
				j = i;
				while ((collar[j] == 'b' || collar[j] == 'w')
						&& !cuentas.get(j) && s <= n) {
					cuentas.set(j);
					j++;
					if (j == n)
						j = 0;
					s++;
				}
			}
			if (s > max)
				max = s;
		}
		return max;
	}
}
