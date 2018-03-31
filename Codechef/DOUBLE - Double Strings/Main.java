// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * DOUBLE - Double Strings [http://www.codechef.com] Gracias por la idea de uno
 * de los codigos publicados en Codechef
 * 
 * @author BreakDark
 * @version 1.1 beta
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // Para leer los datos de entrada
        short T; // para los casos de prueba
        int N; // para el numero a leer

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        T = Lee.nextShort();
        while (T-- > 0) {
            N = Lee.nextInt();
            // pregunto si es par
            if ((N & 1) == 0)
                System.out.println(N);
            else
                System.out.println(N - 1);
        }
    }
}
