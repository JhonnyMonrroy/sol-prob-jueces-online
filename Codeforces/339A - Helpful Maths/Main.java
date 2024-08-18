import java.util.Arrays;
import java.util.Scanner;

/**
 * Solucion al Problema: 339A - Helpful Maths [http://codeforces.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 16/07/2014
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para poder leer los datos
        String s; // la cadena de numeros a procesar
        String[] vec; // vector
        int i;

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            s = Lee.next();
            vec = s.replace('+', ' ').split(" ");
            Arrays.sort(vec);
            for (i = 0; i < vec.length; i++) {
                System.out.print(vec[i]);
                if (i < vec.length - 1)
                    System.out.print("+");
                else
                    System.out.println();
            }
        }
    }
}
