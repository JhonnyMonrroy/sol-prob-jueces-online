// ACEPTADO!!! xD
import java.math.BigInteger;
import java.util.Scanner;

/**
 * FCTRL2 - Small factorials [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
	public static void main(String[] args) {
		Scanner Lee; // para ler los datos de entrada
		byte t; // nro de casos de prueba
		BigInteger[] fac = new BigInteger[101]; // para los factoriales

		// AQUI INICIA EL PROGRAMA
		// generamos los factoriales
		fac[0] = BigInteger.ONE;
		for (t = 1; t <= 100; t++)
			fac[t] = fac[t - 1].multiply(new BigInteger(Byte.toString(t)));
		Lee = new Scanner(System.in);
		while (Lee.hasNext()) {
			t = Lee.nextByte();
			while (t-- > 0) {
				System.out.println(fac[Lee.nextByte()]);
			}
		}
	}
}
