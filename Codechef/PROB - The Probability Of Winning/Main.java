// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * Problema: PROB - The Probability Of Winning [http://www.codechef.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 03/01/2014
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de prueba
        short T; // numero de casos de prueba

        // AQUI INICIA EL PROGRAMA!!!
        Lee = new Scanner(System.in);
        T = Lee.nextShort();
        while (T-- > 0)
            procesar(Lee.nextInt(), Lee.nextInt(), Lee.nextInt(), Lee.nextInt());
    }

    /**
     * Metodo: procesar, que resuelve el problema
     * 
     * @author BreakDark (Jhonny Monrroy)
     * @version 1.0 beta 03/01/2014
     * @param T1
     *            numero de tickets ganadores
     * @param T2
     *            numero de tickets perdedores
     * @param T3
     *            numero de tickets para una segunda oportunidad
     * @param T4
     *            numero de tickets que el chef retirara
     */
    private static void procesar(int T1, int T2, int T3, int T4) {
        // Lo que interesa aqui es el numero de tickets ganadores y perdedores
        // ya que los otros no garantizan que el jugador gane
        int total = T1 + T2;
        System.out.println((double) T1 / total);
    }
}
