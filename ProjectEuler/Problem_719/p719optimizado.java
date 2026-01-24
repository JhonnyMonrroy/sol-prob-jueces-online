/**
 * Problem: Number Splitting
 * https://projecteuler.net/problem=719
 * */
public class p719optimizado {

	public static void main(String[] args) {
		System.out.println(funcionT(81));
		
		System.out.println(funcionT(10000));

		System.out.println(funcionT(1000000000000L));
	}

	private static long funcionT(long n) {
		long sum = 0;

		for (long i = 2; i * i <= n; i++) {
			long cuadrado = i * i;
			if (esNumeroS(cuadrado, i))
				sum += cuadrado;
		}

		return sum;
	}

	private static boolean esNumeroS(long cuadrado, long raizCuadrado) {
		char[] digitos = Long.toString(cuadrado).toCharArray();
		return busquedaCandidatoS(digitos, 0, 0, raizCuadrado);
	}

	private static boolean busquedaCandidatoS(char[] digitos, int indice, long sumaActual, long valorBuscado) {
		if (sumaActual > valorBuscado)
			return false;

		// si se finalizo en esta busqueda
		if (indice == digitos.length)
			return sumaActual == valorBuscado;

		// sumamos lo que tenemos
		long sumaParcial = 0;

		for (int i = indice; i < digitos.length; i++) {
			sumaParcial = sumaParcial * 10 + (digitos[i] - '0');

			// si la suma excede salimos
			if (sumaParcial + sumaActual > valorBuscado)
				return false;

			// buscamos recursivamente
			if (busquedaCandidatoS(digitos, i + 1, sumaActual + sumaParcial, valorBuscado))
				return true;
		}

		return false; // si no se encontro candidatos
	}

}
