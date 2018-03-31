// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * NUMGAME2 - Number Game Revisited [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.1 beta
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        int T; // para los casos de prueba
        int N; // para leer el n

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        T = Lee.nextInt();
        while (T-- > 0) {
            N = Lee.nextInt();
            // pregunto si es impar
            if (N % 4 == 1)
                System.out.println("ALICE");
            else
                System.out.println("BOB");
        }
    }
}
