import java.util.Scanner;

/**
 * Solucion al Problema: 266A - Stones on the Table [http://codeforces.com]
 * 
 * @author BreakDark
 * @version 1.1 beta 30/01/2013
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte n; // numero de piedras en la mesa
        char[] s; // la cadena a procesar
        byte cont; // contador
        byte i, j; // para los indices

        // AQUI INICIA EL PROGRAMA!!!
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            n = Lee.nextByte();
            s = Lee.next().toCharArray();
            // solucion
            cont = 0;
            for (i = 0; i < n - 1; i++) {
                for (j = (byte) (i + 1); j < n; j++) {
                    if (s[i] == s[j])
                        cont++;
                    else {
                        i = (byte) (j - 1);
                        break;
                    }
                    if (j == n - 1)
                        i = n;
                }
            }
            System.out.println(cont);
        }
    }
}
