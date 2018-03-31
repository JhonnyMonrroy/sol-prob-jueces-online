// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * RESN04 - Stone Game [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte T; // para los casos de entrada
        byte N; // para el numero de pilares
        byte i; // para los bucles
        int maximaExtraccion; // para sumar la maxima extraccion posible

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        T = Lee.nextByte();
        while (T-- > 0) {
            N = Lee.nextByte();
            maximaExtraccion = 0;
            for (i = 1; i <= N; i++)
                maximaExtraccion += (Lee.nextShort() / i);
            // preguntamos quien podria ganar
            if ((maximaExtraccion & 1) == 1)
                System.out.println("ALICE");
            else
                System.out.println("BOB");
        }
    }
}
