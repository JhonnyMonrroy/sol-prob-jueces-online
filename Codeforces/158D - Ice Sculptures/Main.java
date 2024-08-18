import java.util.Scanner;

/**
 * 158D - Ice Sculptures [http://codeforces.com]
 * 
 * @author BreakDark
 * @author elgolondrino
 * @version 3.0 beta 30/01/2013 Agradecimientos a <b>elgolondrino</b> por
 *          publicar su codigo :)
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        short n; // num de esculturas 3<=n<=2000
        short[] t; // esculturas
        short i, j, k; // para los indices
        int sum; // para sumar temporalmente
        int maxSum; // para sumar

        // AQUI INICIA EL PROGRAMA!!!
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            n = Lee.nextShort();
            t = new short[n + 1];
            // leemos los datos
            maxSum = 0;
            for (i = 0; i < n; i++) {
                t[i] = Lee.nextShort();
                maxSum += t[i];
            }
            // buscamos al mayor
            for (i = 1; i * 3 <= n; i++)
                if (n % i == 0)// multiplos
                    for (j = 0; j < i; j++) {
                        sum = 0;
                        for (k = j; k < n; k += i)
                            sum += t[k];
                        if (sum > maxSum)
                            maxSum = sum;
                    }
            // mostramos el resultado
            System.out.println(maxSum);
        }
    }
}
