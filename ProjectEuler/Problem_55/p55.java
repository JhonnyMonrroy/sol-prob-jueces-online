import java.math.BigInteger;
import java.util.BitSet;

/**
 * Problem_55 Lychrel Numbers https://projecteuler.net/
 * 
 * @author JhonnyMonrroy
 * @version 1.0 23 ene 2026 Aceptado!!!
 */
public class p55 {
	public static void main(String[] args) {
		int limit = 10000;
		BitSet lNumbers = new BitSet(limit + 1); // diez mil

		// buscar lNumbers
		for (int i = 1; i <= limit; i++) {
			if (esLNumber(Integer.toString(i), 1))
				lNumbers.set(i);
		}

		// imprimimos cuantos LNumbers hay
		System.out.println(lNumbers.cardinality());
	}

	private static boolean esLNumber(String num, int count) {
		if (count >= 50)
			return true;
		String revNum = new StringBuffer(num).reverse().toString();

		String newNum = null;
		if (num.length() <= 5) { // 10000 5 digitos
			int numIzq = Integer.valueOf(num);
			int numDer = Integer.valueOf(revNum);
			newNum = Integer.toString(numIzq + numDer);
		} else // numeros grandes
			newNum = new BigInteger(num).add(new BigInteger(revNum)).toString();
		if (newNum.equals(new StringBuffer(newNum).reverse().toString()))
			return false;
		return esLNumber(newNum, count + 1);
	}
}
