/**
 * https://projecteuler.net/problem=97 
 * Aceptado!!!
 */
public class p97optimizado {
	public static void main(String[] args) {
		long result = 1;

		for (int i = 1; i <= 7830457; i++) {
			result <<= 1;
			result %= 10000000000L;
		}

		result *= 28433;
		result ++;
		result %= 10000000000L;

		System.out.println(result);
	}
}