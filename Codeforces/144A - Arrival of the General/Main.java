import java.util.Scanner;

/**
 * Solucion al Problema: 144A - Arrival of the General [http://codeforces.com]
 * 
 * @author BreakDark
 * @version 1.0 beta 22/01/2013
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte n; // numero de soldados
        byte[] a; // fila de soldados
        int i, j;
        byte min, max; // minima y maxima altura

        // AQUI INICIA EL PROGRAMA!!!
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            n = Lee.nextByte();
            a = new byte[n];
            min = Byte.MAX_VALUE;
            max = Byte.MIN_VALUE;
            for (i = 0; i < n; i++) {
                a[i] = Lee.nextByte();
                if (a[i] < min)
                    min = a[i];
                if (a[i] > max)
                    max = a[i];
            }
            // solucion
            // buscamos al maximo
            for (i = 0; i < n; i++)
                if (a[i] == max)
                    break;
            // buscamos al minimo
            for (j = n - 1; j >= 0; j--)
                if (a[j] == min)
                    break;
            // resultado
            if (i > j)
                j++;
            System.out.println((i + (n - 1 - j)));
        }
    }
}
