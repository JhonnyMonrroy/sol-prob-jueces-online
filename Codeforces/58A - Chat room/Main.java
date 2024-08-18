import java.util.Scanner;

/**
 * Solucion al Problema: 58A - Chat room [http://codeforces.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 24/09/2014
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        String s; // para la cadena que se procesara

        // aqui inicia el programa
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            s = Lee.next();
            procesar(s);
        }
    }

    /**
     * Resuelve el problema, agradecimientos a <b>yeputons</b> por su tutorial
     * 
     * @author BreakDark (Jhonny Monrroy)
     * @version 2.0 beta 24/09/2014
     * @param s
     *            Cadena a procesar
     */
    private static void procesar(String s) {
        int i, ind; // para los bucles
        String hello = "hello";

        // buscamos la palabra;
        for (i = 0, ind = 0; i < s.length() && ind < hello.length(); i++) {
            if (s.charAt(i) == hello.charAt(ind))
                ind++;
        }
        // si se completo hello
        if (ind == hello.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
