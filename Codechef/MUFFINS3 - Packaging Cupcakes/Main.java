// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * Problema: MUFFINS3 - Packaging Cupcakes [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta 03/01/2014
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        short T; // numero de casos de prueba

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        T = Lee.nextShort();
        while (T-- > 0)
            procesar(Lee.nextInt());
    }

    /**
     * Metodo: procesar, que resuelve el problema
     * 
     * @author BreakDark
     * @version 1.0 beta 03/01/2014
     * @param N
     *            numero de panqueques
     */
    private static void procesar(int N) {
        System.out.println((int) Math.ceil(((double) N + 1) / 2));
    }
}
