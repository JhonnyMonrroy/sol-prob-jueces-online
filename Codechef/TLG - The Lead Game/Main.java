// Correct Answer!!! xD
import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: TLG - The Lead Game [https://www.codechef.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0b 25 feb. 2017
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		short n; // numero de casos de prueba
		short[] si, ti; // puntajes

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		n = Lee.nextShort();
		si = new short[n];
		ti = new short[n];
		for (int i = 0; i < n; i++) {
			si[i] = Lee.nextShort();
			ti[i] = Lee.nextShort();
		}
		System.out.println(obtenerResultado(si, ti, n));
		Lee.close();
	}

	/**
	 * Funcion que obtiene la respuesta al problema
	 * 
	 * @param si
	 *            vector de puntajes del Player 1
	 * @param ti
	 *            vector de puntajes del Player 2
	 * @param n
	 *            Numero de jugadas
	 * @return Un string con la respuesta al problema
	 */
	public static String obtenerResultado(short[] si, short[] ti, short n) {
		int dif, maxDif = 0;
		int acuSi = 0, acuTi = 0;
		boolean player1 = true;

		for (int i = 0; i < n; i++) {
			acuSi += si[i];
			acuTi += ti[i];
			dif = acuSi - acuTi;
			if (Math.abs(dif) > maxDif) {
				maxDif = Math.abs(dif);
				player1 = dif > 0;
			}
		}
		return "" + (player1 ? "1 " : "2 ") + maxDif;
	}
}
