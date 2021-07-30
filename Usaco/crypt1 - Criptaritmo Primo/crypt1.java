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
 TASK: crypt1
*/
/**
 * Soluci&oacute;n al Problema: crypt1 - Criptaritmo Primo
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0.2 beta 27 jul 2021
 *
 */
// All tests OK. xD
public class crypt1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("crypt1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
		Scanner Read = new Scanner(in);
//		Scanner Read = new Scanner(System.in);

		int n;
		short[] digits;

		// leemos los datos
		n = Read.nextInt();
		digits = new short[n];
		for (int i = 0; i < n; i++) {
			digits[i] = Read.nextShort();
		}
		Read.close();

		System.out.println(solution(digits));
		out.println(solution(digits));
		out.close();
	}

	/**
	 * Souci&oacute;n al problema
	 * 
	 * @param digits Los digitos permitidos
	 * @return Un entero que reresenta el numero de soluciones posibles
	 */
	public static int solution(short[] digits) {
		int result = 0;
		BitSet digits_allowed = new BitSet(digits.length + 1);
		for (int i = 0; i < digits.length; i++)
			digits_allowed.set(digits[i]);
		// calculamos las dos valores a multiplicar
//	      * * *			-> A
//	   x    * *			-> B
//	    -------
//	      * * *			-> prod1
//	    * * *			-> prod2
//	    -------
//	    * * * *			-> prod3
		for (int i = 0; i < digits.length; i++)
			for (int j = 0; j < digits.length; j++)
				for (int k = 0; k < digits.length; k++) {
					int a = digits[i] * 100 + digits[j] * 10 + digits[k];
					// armamos b
					for (int l = 0; l < digits.length; l++) {
						int prod1 = a * (digits[l]);
						// revisamos si tiene digitos permitidos
						if (prod1 < 1000 && permitNum(prod1, digits_allowed)) {
							for (int m = 0; m < digits.length; m++) {
								int prod2 = a * (digits[m]);
								if (prod2 < 1000 && permitNum(prod2, digits_allowed)) {
									// sumamos los dos valores
									int prod3 = prod1 * 10 + prod2;
									// si pasa todas las pruebas contamos
									if (prod3 < 10000 && permitNum(prod3, digits_allowed)) {
										result++;
										// imprimimos las soluciones posibles
//										System.out.println(" " + a);
//										System.out.println("x  " + digits[l] + digits[m]);
//										System.out.println("--------------");
//										System.out.println(" " + prod1);
//										System.out.println("" + prod2);
//										System.out.println("--------------");
//										System.out.println("" + prod3);
//										System.out.println("_____________________________");
									}
								}
							}
						}

					}
				}
		return result;
	}

	/**
	 * Verifica si el numero es permitido
	 * 
	 * @param num            Entero para verificar sus digitos
	 * @param digits_allowed Cojunto de digitos permitidos
	 * @return <code>true</code> si es un numero permitido, <code>false</code> en
	 *         otro caso.
	 */
	private static boolean permitNum(int num, BitSet digits_allowed) {
		String num_s = Integer.toString(num);
		for (int i = 0; i < num_s.length(); i++) {
			if (!digits_allowed.get(num_s.charAt(i) - '0'))
				return false;
		}
		return true;
	}
}
