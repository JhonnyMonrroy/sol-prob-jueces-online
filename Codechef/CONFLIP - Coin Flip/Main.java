// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * Problema: CONFLIP - Coin Flip [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta 02/11/2012
 */
public class Main {

    /**
     * Metodo: main
     * 
     * @author BreakDark
     * @version 1.0 beta 02/11/2012
     * @param args
     */
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte T; // numero de casos de prueba
        short G; // numero de juegos del elefante
        byte I; // estado inicial de las monedas
        int N; // numero de monedas por cada ronda
        byte Q; // estado final de las monedas

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        // leemos los datos
        T = Lee.nextByte();
        while (T-- > 0) { // por cada caso de prueba
            G = Lee.nextShort();
            while (G-- > 0) {// por cada juego
                I = Lee.nextByte();
                N = Lee.nextInt();
                Q = Lee.nextByte();
                // aqui se da solucion al problema
                if ((N & 1) == 0) // si es par
                    System.out.println((N >> 1));
                else {
                    if (I == Q)
                        System.out.println((N >> 1));
                    else
                        System.out.println((N >> 1) + 1);
                }
            }
        }
    }
}
