import java.util.BitSet;

/**
 * 027 - Problem 27 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 1.1 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        short a, b; // para los coeficientes
        short mejorA, mejorB; // para los mejores coeficientes
        int limite = 1000000; // para marcar el limite de busqueda
        BitSet primos = new BitSet(limite + 1); // para generar los primos
        int i, j; // para los bucles
        int mejorSuma; // para el numero de primos
        int n; // para generar los n

        // AQUI INICIA EL PROGRAMA
        // generamos los numeros primos
        for (i = 2; i <= limite; i++) {
            if (!primos.get(i)) {
                for (j = 2; j * i <= limite; j++)
                    primos.set(i * j);
            }
        }
        // buscamos los mejores coeficientes
        mejorA = mejorB = -100;
        mejorSuma = 0;
        for (a = -999; a <= 999; a += 2) {
            for (b = -999; b <= 999; b++) {
                if (!primos.get(Math.abs(b))) {
                    for (n = 1; !primos.get(Math.abs(n * n + a * n + b)); n++) {
                        // System.out.println(Math.abs(n * n + a * n + b));
                    }
                    if (n > mejorSuma) {
                        mejorSuma = n;
                        mejorA = a;
                        mejorB = b;
                    }
                }
            }
        }
        // mostramo0s el resultado
        System.out.println("a vale: " + mejorA + " b vale: " + mejorB
                + " el producto a*b es " + mejorA * mejorB);
    }
}
