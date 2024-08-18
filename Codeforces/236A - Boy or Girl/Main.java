import java.util.BitSet;
import java.util.Scanner;

/**
 * Solucion al Problema: 236A - Boy or Girl [http://codeforces.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 15/09/2014
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        String nombre; // nombre a leer

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            nombre = Lee.next();
            procesar(nombre);
        }
    }

    /**
     * @param nombre
     *            a evaluar
     */
    private static void procesar(String nombre) {
        BitSet letras = new BitSet('z' - 'a');
        for (int i = 0; i < nombre.length(); i++) {
            letras.set(nombre.charAt(i) - 'a');
        }
        if ((letras.cardinality() & 1) == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
