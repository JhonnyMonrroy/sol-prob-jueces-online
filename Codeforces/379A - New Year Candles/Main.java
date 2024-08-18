import java.util.Scanner;

/**
 * Solucion al Problema: 279A - New Year Candles [http://codeforces.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 15/09/2014
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        short a, b; // total de velas y cada cuaas velas hace una nueva

        // aqui inicia el programa
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            a = Lee.nextShort();
            b = Lee.nextShort();
            procesar(a, b);
        }
    }

    /**
     * @param a
     *            total de velas
     * @param b
     *            cuantas velas se consumen hasta crear una nueva
     */
    private static void procesar(int a, int b) {
        int totalHoras = 0;

        while (b <= a) {
            totalHoras += b;
            a -= b;
            a++;
        }
        totalHoras += a;
        System.out.println(totalHoras);
    }
}
