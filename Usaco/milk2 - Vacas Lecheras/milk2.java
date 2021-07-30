import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.BitSet;
import java.util.StringTokenizer;

/*
 ID: breakd1
 LANG: JAVA
 TASK: milk2
 */
/**
 * Solucion al Problema: Vacas Lecheras
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 23/09/2014
 */
// ACEPTADO!!! xD
public class milk2 {
	public static void main(String[] args) throws IOException {
		// abrimos los archivos
		RandomAccessFile archivo = new RandomAccessFile("milk2.in", "r");
		// RandomAccessFile archivo = new
		// RandomAccessFile("e:\\_temp\\milk2.in",
		// "r");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"milk2.out")));
		StringTokenizer Lee; // para leer lineas
		String linea; // para procesar una linea
		short n;
		int[] ini, fin; // inicio y final de los intervalos
		int i; // para los bucles
		BitSet intervalos;
		int cotaInferior, cotaSuperior;

		// aqui inicia el programa
		linea = archivo.readLine();
		Lee = new StringTokenizer(linea);
		n = Short.parseShort(linea);
		ini = new int[n];
		fin = new int[n];
		for (i = 0; i < n; i++) {
			linea = archivo.readLine();
			Lee = new StringTokenizer(linea);
			ini[i] = Integer.parseInt(Lee.nextToken());
			fin[i] = Integer.parseInt(Lee.nextToken());
		}
		intervalos = generarIntervalos(ini, fin, n);
		cotaInferior = menor(ini, n);
		cotaSuperior = mayor(fin, n);
		out.println(mayorIntervaloOrdeniando(intervalos, cotaInferior,
				cotaSuperior)
				+ " "
				+ mayorIntervaloNoOrdiniando(intervalos, cotaInferior,
						cotaSuperior));
		// System.out.println(mayorIntervaloOrdeniando(intervalos, cotaInferior,
		// cotaSuperior)
		// + " "
		// + mayorIntervaloNoOrdiniando(intervalos, cotaInferior,
		// cotaSuperior));
		out.close();
		System.exit(0);
	}

	/**
	 * obtiene el mayor de el vector
	 * 
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 beta 23/09/2014
	 * @param V
	 *            Vector de enteros
	 * @param n
	 *            tamanio del vector
	 * @return El mayor de todo el vector
	 */
	private static int mayor(int[] V, short n) {
		int may = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++)
			if (V[i] > may)
				may = V[i];
		return may;
	}

	/**
	 * Obtiene el menor del vector
	 * 
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 beta 23/09/2014
	 * @param V
	 *            vector
	 * @param n
	 *            tamanio del vector
	 * @return el menor del vector
	 */
	private static int menor(int[] V, short n) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++)
			if (V[i] < min)
				min = V[i];
		return min;
	}

	/**
	 * Obtiene el mayor intervalo no ordeniado
	 * 
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 beta 23/09/2014
	 * @param intervalos
	 *            Conjunto de intervalos marcados
	 * @param cotaSuperior
	 * @param cotaInferior
	 * @return Un entero que representa el intervalo mas largo no ordeniado
	 */
	private static int mayorIntervaloNoOrdiniando(BitSet intervalos,
			int cotaInferior, int cotaSuperior) {
		int max = 0, s;
		int i;

		s = 0;
		for (i = cotaInferior + 1; i <= cotaSuperior; i++) {
			if (!intervalos.get(i))
				s++;
			else {
				if (s > max)
					max = s;
				s = 0;
			}
		}
		return max;
	}

	/**
	 * Obtiene el mayor intervalo ordeniando
	 * 
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 beta 23/09/2014
	 * @param intervalos
	 *            Conjunto con los intervalos marcados
	 * @param cotaSuperior
	 * @param cotaInferior
	 * @return Un entero que repesenta el intervalo mas largo ordeniando
	 */
	private static int mayorIntervaloOrdeniando(BitSet intervalos,
			int cotaInferior, int cotaSuperior) {
		int max = 0, s;
		int i;

		s = 0;
		for (i = cotaInferior; i <= cotaSuperior + 1; i++) {
			if (intervalos.get(i))
				s++;
			else {
				if (s > max)
					max = s;
				s = 0;
			}
		}
		return max;
	}

	/**
	 * Genera los intervalos
	 * 
	 * @author BreakDark (Jhonny Monrroy)
	 * @version 1.0 beta 23/09/2014
	 * @param ini
	 *            vector para marcar los inicios
	 * @param fin
	 *            vector con los finales de cada intervalo
	 * @param n
	 *            numero de intervalos
	 * @return Un bit set con todos los intervalos marcados
	 */
	private static BitSet generarIntervalos(int[] ini, int[] fin, short n) {
		BitSet enteros = new BitSet(1000002);
		int i;

		for (i = 0; i < n; i++)
			enteros.set(ini[i] + 1, fin[i] + 1);
		return enteros;
	}
}
