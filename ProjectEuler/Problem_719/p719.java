import java.math.BigInteger;
/*
 * Problem: Number Splitting
 * https://projecteuler.net/problem=719
 * 
 * Acptado pero lento
 * */
public class p719 {
	public static void main(String[] args) {
		System.out.println(funcionT(new BigInteger("10000")));

		System.out.println(funcionT(new BigInteger("1000000000000")));
	}

	public static BigInteger funcionT(BigInteger n) {
		BigInteger sum = BigInteger.ZERO;

		for (BigInteger i = BigInteger.valueOf(2); i.multiply(i).compareTo(n) <= 0; i = i.add(BigInteger.ONE))
			if (isRadixSNumber(i))
				sum = sum.add(i.multiply(i));

		return sum;
	}

	public static boolean isRadixSNumber(BigInteger n) {
		String numberS = n.multiply(n).toString();

		return backtrackSum(numberS, 0, BigInteger.ZERO, n);
	}

	private static boolean backtrackSum(String cadenaNumeros, int indice, BigInteger sumaActual,
			BigInteger posibleRaizNumeroS) {

		// ya no se busca si la suma se paso del posibleNumeroS
		if (sumaActual.compareTo(posibleRaizNumeroS) > 0)
			return false;

		// cuando ya se obtiene una particion
		if (indice == cadenaNumeros.length())
			return sumaActual.compareTo(posibleRaizNumeroS) == 0;

		BigInteger sumaParcial = BigInteger.ZERO;

		// realizamos la suma por partes, transformando la subcadena a numero antes de
		// enviar al backtracking
		for (int i = indice; i < cadenaNumeros.length(); i++) {
			sumaParcial = sumaParcial.multiply(BigInteger.TEN).add(BigInteger.valueOf(cadenaNumeros.charAt(i) - '0'));
			if (backtrackSum(cadenaNumeros, i + 1, sumaActual.add(sumaParcial), posibleRaizNumeroS))
				return true; // si es que ya se encontro la suma que indica que es un númeroS
		}

		return false;
	}
}
