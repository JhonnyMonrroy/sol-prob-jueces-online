// ACCEPTED!!! xD
import java.util.Arrays;
import java.util.Scanner;

/**
 * Problema: CAPPLE - Chef and Apple Trees [http://www.codechef.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 05/12/2014
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee;
        int t, n;
        int[] apples;
        int i;

        // aqui inicia el programa
        Lee = new Scanner(System.in);
        t = Lee.nextInt();
        while (t-- > 0) {
            n = Lee.nextInt();
            apples = new int[n];
            for (i = 0; i < n; i++)
                apples[i] = Lee.nextInt();
            procesar(apples, n);
        }
    }

    /**
     * Metodo: procesar
     * 
     * @author BreakDark (Jhonny Monrroy)
     * @version 1.0 beta 05/12/2014
     * @param apples
     * @param n
     */
    private static void procesar(int[] apples, int n) {
        Arrays.sort(apples);
        int c = 1;
        int i;

        for (i = 0; i < n - 1; i++) {
            if (apples[i] != apples[i + 1]) {
                c++;
            }
        }
        System.out.println(c);
    }
}
