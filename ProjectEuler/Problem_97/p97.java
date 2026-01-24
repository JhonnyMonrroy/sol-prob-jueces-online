import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=97
 * Aceptado!!!
 */
public class p97 {
	public static void main(String[] args) {
		BigInteger result = BigInteger.TWO;
		result = result.pow(7830457);
		result = result.multiply(new BigInteger("28433"));
		result = result.add(BigInteger.ONE);

		String cadena = result.toString();

		System.out.println(cadena.substring(cadena.length() - 10, cadena.length()));
	}
}
