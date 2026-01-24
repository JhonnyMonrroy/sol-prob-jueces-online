import java.util.BitSet;

/**
 * 023 - Problem 23 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        short limite = 28123; // para definir hasta donde buscar los numeros
        BitSet abundantes = new BitSet(limite + 1); // enteros que son validos
        BitSet sumAbundantes = new BitSet(limite + 1); // aquellos que pueden
                                                       // ser la suma de dos
                                                       // abundantes
        int i, j, sum; // para los indices y la suma

        // AQUI INICIA EL PROGRAMA
        // buscamos cuales son abundantes
        for (i = 1; i <= limite; i++) {
            if (sumaDivisores(i) > i)
                abundantes.set(i);
        }
        // marcamos todas las sumas de los abundantes
        for (i = 1; i <= limite; i++) {
            if (abundantes.get(i))
                for (j = i; i + j <= limite; j++)
                    if (abundantes.get(j))
                        sumAbundantes.set(i + j);
        }
        // sumamos aquellos que no pueden ser sumas de abundantes
        sum = 0;
        for (i = 1; i <= limite; i++)
            if (!sumAbundantes.get(i))
                sum += i;
        // mostramos el resultado
        System.out
                .println("La suma de todos los enteros positivos\nque no pueden ser la suma de dos numeros abundantes es: "
                        + sum);
    }

    /** suma los divisores de n */
    private static int sumaDivisores(int n) {
        int suma = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                suma += i;
        }
        return suma;
    }
}
