import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 208A - Dubstep [http://codeforces.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee;
        StringTokenizer LeerLinea;
        String linea;

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            linea = "";
            LeerLinea = new StringTokenizer(Lee.next().replace("WUB", " "));
            while (LeerLinea.hasMoreTokens()) {
                linea += LeerLinea.nextToken();
                if (LeerLinea.hasMoreTokens())
                    linea += " ";
            }
            System.out.println(linea);
        }
    }
}
