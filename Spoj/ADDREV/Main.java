import java.util.Scanner;

/**
 * ADDREV - Adding Reversed Numbers [http://www.spoj.pl]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para leer los datos de entrada
		short N; // numero de casos

		// AQUI INICIA EL PROGRAMA
		Lee = new Scanner(System.in);
		N = Lee.nextShort();
		while (N-- > 0)
			System.out.println(invertir(invertir(Lee.nextInt())
					+ invertir(Lee.nextInt())));
	}

	/**
	 * Funcion que invierte los digitos de un entero
	 * 
	 * @param num
	 *            entero a invertir
	 * @return entero con el orden de los digitos invertidos
	 */
	private static int invertir(int num) {
		String cadNum = Integer.toString(num);
		String nuevoNum = "";
		for (int i = cadNum.length() - 1; i >= 0; i--)
			nuevoNum += cadNum.charAt(i);
		return Integer.parseInt(nuevoNum);
	}
}
