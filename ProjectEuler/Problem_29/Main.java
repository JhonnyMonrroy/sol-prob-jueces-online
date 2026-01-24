import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * 029 - Problem 29 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        byte limite = 100; // para marcar el limite a generar
        int a, b; // para los bucle
        Set<BigInteger> conA = new HashSet<BigInteger>(); // para el conjunto de
                                                          // numerso generados
        BigInteger aux; // un auxiliar

        // AQUI INICIA EL PROGRAMA
        // generamos las potencias
        for (a = 2; a <= limite; a++) {
            aux = new BigInteger(String.valueOf(a));
            for (b = 2; b <= limite; b++)
                conA.add(aux.pow(b));
        }
        // mostramos el resultado
        System.out.println("Total de numeros diferentes: " + conA.size());
    }
}
