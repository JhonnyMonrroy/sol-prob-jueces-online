// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * PERMUT2 - Ambiguous Permutations [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        int n; // para el n de la permutacion
        int[] vec1 = new int[100001]; // para leer la permutacion
        int[] vec2 = new int[100001];
        int i; // para los bucles

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        n = Lee.nextInt();
        while (n > 0) {
            for (i = 0; i < n; i++) {
                vec1[i] = Lee.nextInt();
                vec2[vec1[i] - 1] = i + 1;
            }
            if (esAmbigua(vec1, vec2, n))
                System.out.println("ambiguous");
            else
                System.out.println("not ambiguous");
            n = Lee.nextInt();
        }
    }

    /**
     * Funcion que averigua si una permutacion es ambigua
     * 
     * @param vec1
     * @param vec2
     * @param n
     * @return
     */
    private static boolean esAmbigua(int[] vec1, int[] vec2, int n) {
        for (int i = 0; i < n; i++) {
            if (vec1[i] != vec2[i])
                return false;
        }
        return true;
    }
}
