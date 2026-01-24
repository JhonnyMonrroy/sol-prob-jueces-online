import java.math.BigInteger;

/**
 * Problem_55 Lychrel Numbers https://projecteuler.net/
 * 
 * @author JhonnyMonrroy
 * @version 1.0 23 ene 2026 Aceptado!!!
 */
public class p55optimizado {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 1; i <= 10000; i++)
			if (esLNumber(i))
				count++;

		// imprimimos cuantos LNumbers hay
		System.out.println(count);
	}

	private static boolean esLNumber(int num) {
		BigInteger numX = BigInteger.valueOf(num);
		for (int i = 0; i < 50; i++) {
			numX = numX.add(new BigInteger(new StringBuilder(numX.toString()).reverse().toString()));
			if (esPalindromo(numX))
				return false;
		}
		return true;
	}

	private static boolean esPalindromo(BigInteger num) {
		String numS = num.toString();
		return numS.equals(new StringBuilder(numS).reverse().toString());
	}

}
