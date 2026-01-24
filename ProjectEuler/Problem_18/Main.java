import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 018 - Problem 18 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 2.1 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // Para leer los datos
        int[][] mat = new int[15][15]; // matriz de numeros
        int i, j; // para los indices
        StringTokenizer LeeLinea; // para procesar una linea

        // AQUI INCIA EL PROGRAMA
        Lee = new Scanner(System.in);
        // leemos todos los datos
        i = 0;
        while (Lee.hasNextLine()) {
            LeeLinea = new StringTokenizer(Lee.nextLine());
            j = 0;
            while (LeeLinea.hasMoreTokens())
                mat[i][j++] = Integer.parseInt(LeeLinea.nextToken());
            i++;
        }
        System.out.println("La mayor suma se numeros seguidos es: "
                + sumaSecuencia(mat, i));
    }

    /**
     * Funcion que suma la posible suma de numeros consecutivos de una matriz de
     * altura h basado en programacion dinamica
     * 
     * @author BreakDark
     * @version 2.0
     * @param mat
     *            Matriz que representa el triangulo a evaluar
     * @param h
     *            la altura del triangulo
     * @return Un entero que representa la suma mayor del triangulo.
     */
    private static int sumaSecuencia(int[][] mat, int h) {
        int i = 0;
        h--;
        while (h>=0) {
            for(i=0;i<h;i++)
                mat[h-1][i]=Math.max((mat[h][i]+mat[h-1][i]), (mat[h][i+1]+mat[h-1][i]));
            h--;
        }
        return mat[0][0];
    }
}
