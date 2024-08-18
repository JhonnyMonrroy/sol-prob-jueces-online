import java.util.BitSet;
import java.util.Scanner;

/**
 * Solucion al Problema: 271A - Beautiful Year [http://codeforces.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 15/09/2014
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los adtos de entrada
        short y; // para el año

        // Aqui inicia el programa
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            y = Lee.nextShort();
            procesar(y);
        }
    }

    /**
     * @param y
     *            año a procesar
     */
    private static void procesar(short y) {
        BitSet dig = new BitSet(9);
        int i;
        String yCad;
        char d;

        do {
            y++;
            dig.clear();
            yCad = Short.toString(y);
            for (i = 0; i < yCad.length(); i++) {
                d = yCad.charAt(i);
                if (!dig.get(d - '0'))
                    dig.set(d - '0');
                else
                    break;
            }
        } while (i < yCad.length());
        System.out.println(y);
    }
}
