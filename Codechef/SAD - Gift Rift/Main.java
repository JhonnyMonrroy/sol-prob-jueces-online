// ACEPTADO!!! xD
import java.util.Scanner;

/**
 * SAD - Gift Rift [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte R, C; // filas y columnas
        int[][] cost; // matriz de costos
        boolean[][] fil, col; // para minimos y maximos
        byte i, j; // indices
        int aux;
        boolean existe; // para ver si existe solucion

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        // leemos los datos
        while (Lee.hasNext()) {
            R = Lee.nextByte();
            C = Lee.nextByte();
            cost = new int[R][C];
            fil = new boolean[R][C];
            col = new boolean[R][C];
            // llenamos la matriz
            for (i = 0; i < R; i++)
                for (j = 0; j < C; j++)
                    cost[i][j] = Lee.nextInt();
            // buscamos el minimo de cada fila
            for (i = 0; i < R; i++) {
                aux = Integer.MAX_VALUE;
                for (j = 0; j < C; j++) {
                    if (cost[i][j] < aux)
                        aux = cost[i][j];
                }
                // marcamos los menores
                for (j = 0; j < C; j++) {
                    if (cost[i][j] == aux)
                        fil[i][j] = true;
                }
            }
            // buscamos el maximo de cada columna
            for (j = 0; j < C; j++) {
                aux = Integer.MIN_VALUE;
                for (i = 0; i < R; i++) {
                    if (cost[i][j] > aux)
                        aux = cost[i][j];
                }
                // marcamos los mayores
                for (i = 0; i < R; i++) {
                    if (cost[i][j] == aux)
                        col[i][j] = true;
                }
            }
            existe = false;
            // buscamos si hay respuesta
            for (i = 0; i < R && !existe; i++) {
                for (j = 0; j < C && !existe; j++) {
                    if (fil[i][j] && col[i][j]) {
                        System.out.println(cost[i][j]);
                        existe = true;
                    }
                }
            }
            // si no hay solucion
            if (!existe)
                System.out.println("GUESS");
        }
    }
}
