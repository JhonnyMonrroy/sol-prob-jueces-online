// Correct Answer (30 points) :) !!! 
import java.util.Scanner;

/**
 * Solucion al Problema: XORSUB - XOR with Subset [http://www.codechef.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 06/12/2014
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee;
        int t, n, k;
        int[] A;

        // aqui inicia el programa
        Lee = new Scanner(System.in);
        t = Lee.nextInt();
        while (t-- > 0) {
            n = Lee.nextInt();
            k = Lee.nextInt();
            A = new int[n];
            for (int i = 0; i < n; i++)
                A[i] = Lee.nextInt();
            procesar(A, n, k);
        }
    }

    /**
     * Metodo: procesar, resuelve el problema
     * 
     * @author BreakDark (Jhonny Monrroy)
     * @version 1.0 beta 06/12/2014
     * @param A
     *            Vector
     * @param n
     *            Dimension
     * @param k
     *            Valor a comparar
     */
    private static void procesar(int[] A, int n, int k) {
        int may = 0; // buscamos el mayor xor de todos los subconjuntos
        int xor = 0;

        int nbits = A.length;
        int max = 1 << A.length;
        for (int i = 0; i < max; i++) {
            xor = 0;
            for (int j = 0; j < nbits; j++) {
                if ((i & (1 << j)) > 0)
                    xor ^= A[j];
            }
            xor ^= k;
            if (xor > may)
                may = xor;
        }
        // mostramos el xor mayor
        System.out.println(may);
    }
}
