import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 026 - Problem 26 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        int limite; // para el limite de busqueda
        short i; // para los bucles
        Queue<Integer> cola1 = new ArrayDeque<Integer>(); // para el residuo
        Queue<Integer> cola2 = new ArrayDeque<Integer>(); // para el cociente
        int re, co; // para el residuo y el cociente respectivamente
        String mejor = "0"; // para guardar el mejor
        String aux = "0"; // un auxiliar
        int mejorD = 0; // para guardar el mejor

        // AQUI INICIA EL PROGRAMA
        limite = 1000;
        // dividimos hasta que ya no se pueda
        re = 10;
        for (i = 2; i < limite; i++) {
            re = 10;
            cola1.clear();
            cola2.clear();
            while (re > 0) {
                co = re / i;
                re = re % i;
                // preguntamos si ya existe el residuo
                if (cola1.contains(re)) {
                    // buscamos y generamos el que se repitio
                    aux = "0";
                    while (!cola1.isEmpty()) {
                        // preguntamos si existe ese elemento
                        if (cola1.peek() == re) {
                            while (!cola2.isEmpty()) {
                                aux += cola2.remove();
                            }
                            cola1.clear();
                            re = 0;
                            break;
                        }
                        cola1.remove();
                        cola2.remove();
                    }
                    //
                    //System.out.println(" Indice " + i + " Periodo "
                    //        + (new BigInteger(aux)));
                    //
                    // preguntamos si es el mejor
                    if ((new BigInteger(aux)).toString().length() > (new BigInteger(
                            mejor)).toString().length()) {
                        mejor = aux;
                        mejorD = i;
                    }
                } else {
                    cola1.add(Integer.valueOf(re));
                    cola2.add(Integer.valueOf(co));
                    re *= 10;
                }
            }
        }
        // mostramos el resultado
        System.out.println("El mejor numero periodico se genero de: " + mejorD
                + " Periodo " + (new BigInteger(mejor)));
    }
}
