/**
 * Problem 19 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 3.0 beta
 */
// ACEPTADO!!! xD
public class Main {
	public static void main(String[] args) {
		short ini = 1901;
		short fin = 2001;
		int i, j, k; // para los bucles
		int dia;// para los dias 0 a 6, lunes a domingo
		byte[] diasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		short numDomingos = 0;

		// AQUI INICIA EL PROGRAMA
		dia = 0;
		for (i = 1900; i < fin; i++) {
			// contamos por mes
			for (j = 0; j < 12; j++) {
				if (i % 100 == 0)
					if (i % 400 == 0)
						diasMes[1] = 29;
					else
						diasMes[1] = 28;
				else if (i % 4 == 0)
					diasMes[1] = 29;
				else
					diasMes[1] = 28;
				// contamos los domingos que cayeron en primero de mes
				for (k = 1; k <= diasMes[j]; k++) {
					if (i >= ini && k == 1 && dia == 6)
						numDomingos++;
					dia++;
					if (dia > 6)
						dia = 0;
				}
			}
		}
		System.out.println(numDomingos);
	}
}
