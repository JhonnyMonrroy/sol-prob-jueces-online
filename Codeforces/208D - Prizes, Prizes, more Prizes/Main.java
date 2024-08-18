import java.util.Scanner;

/**
 * 208D - Prizes, Prizes, more Prizes [http://codeforces.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte n;
        long[] p;
        int a, b, c, d, e;
        byte i; // indices
        long[] numArt;
        long aux;

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            n = Lee.nextByte();
            p = new long[n + 1];
            for (i = 0; i < n; i++)
                p[i] = Lee.nextInt();
            a = Lee.nextInt();
            b = Lee.nextInt();
            c = Lee.nextInt();
            d = Lee.nextInt();
            e = Lee.nextInt();
            // procesamos
            numArt = new long[5];
            i = 0;
            while (i < n) {
                if (p[i] >= e) {
                    aux = p[i] / e;
                    numArt[4] += aux;
                    p[i] -= e * aux;
                } else if (p[i] >= d) {
                    aux = p[i] / d;
                    numArt[3] += aux;
                    p[i] -= d * aux;
                } else if (p[i] >= c) {
                    aux = p[i] / c;
                    numArt[2] += aux;
                    p[i] -= c * aux;
                } else if (p[i] >= b) {
                    aux = p[i] / b;
                    numArt[1] += aux;
                    p[i] -= b * aux;
                } else if (p[i] >= a) {
                    aux = p[i] / a;
                    numArt[0] += aux;
                    p[i] -= a * aux;
                } else {
                    p[i + 1] += p[i];
                    i++;
                }
            }
            // mostramos el resultado
            System.out.println(numArt[0] + " " + numArt[1] + " " + numArt[2]
                    + " " + numArt[3] + " " + numArt[4]);
            System.out.println(p[n]);
        }
    }
}
