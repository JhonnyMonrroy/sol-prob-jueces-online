// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * J7 - The Best Box [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        double P; // dim del alambre
        double S; // area del papel
        int t; // para los casos de prueba
        double a, b;// lado a y b; un lado c es igual al lado b

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        // leemos los datos
        t = Lee.nextInt();
        while (t-- > 0) {
            P = Lee.nextInt();
            S = Lee.nextShort();
            // reducimos a la mitad para no hacer doble el trabajo
            P /= 2;
            S /= 2;
            // calculamos a y b
            b = (P - Math.sqrt(P * P - 12 * S)) / 6; // por ser varios lados se
                                                     // elige el menor
            a = P / 2 - 2 * b;
            // mostramos el resultado
            System.out.println(String.format("%.2f", a * b * b).replace(',',
                    '.'));
        }
    }
}
