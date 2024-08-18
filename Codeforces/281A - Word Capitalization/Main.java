import java.util.Scanner;

/**
 * Solucion al Problema: 281A - Word Capitalization [http://codeforces.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 16/07/2014
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para poder leer los datos
        String cadena; // cadena a leer

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            cadena = Lee.next();
            System.out.println(cadena.substring(0, 1).toUpperCase()
                    + cadena.substring(1));
        }
    }
}
