// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * Problema: CIELRCPT - Ciel and Receipt [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta 03/01/2014
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte T; // total casos de prueba

        // AQUI INICA EL PROGRAMA
        Lee = new Scanner(System.in);
        T = Lee.nextByte();
        while (T-- > 0)
            procesar(Lee.nextInt());
    }

    /**
     * Metodo: procesar, que soluciona el problema
     * 
     * @author BreakDark
     * @version 1.0 beta 03/01/2014
     * @param p
     *            precio total a calcular
     */
    private static void procesar(int p) {
        short precioPlato = 2048;
        int numMenus = 0;

        while (p > 0) {
            if (p < precioPlato) {
                precioPlato >>= 1;
            } else {
                p -= precioPlato;
                numMenus++;
            }
        }
        System.out.println(numMenus);
    }
}
