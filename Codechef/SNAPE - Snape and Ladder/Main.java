// ACEPTADO!!!
import java.util.Scanner;

/**
 * Problema: SNAPE - Snape and Ladder [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta 29/08/2014
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        short t; // numero de casos de prueba
        short b, ls; // base y lado izquierdo
        float rsMax, rsMin; // Lado derecho, max y min

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        t = Lee.nextShort();
        while (t-- > 0) {
            b = Lee.nextShort();
            ls = Lee.nextShort();
            // calculamos
            rsMax = (float) Math.sqrt(ls * ls + b * b);
            rsMin = (float) Math.sqrt(ls * ls - b * b);
            // mostramos el resultado
            System.out.println(rsMin + " " + rsMax);
        }
    }
}
