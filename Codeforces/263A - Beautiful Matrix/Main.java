import java.util.Scanner;

/**
 * Solucion al Problema: 263A - Beautiful Matrix [http://codeforces.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 15/05/2016
 */
// Accepted!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // Para leer los datos de entrada
        int[][] mat = new int[5][5]; // matriz que se leera

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    mat[i][j] = Lee.nextInt();
                }
            }
            System.out.println(obtenerResultadoInfo(mat));
        }
    }

    /**
     * @author BreakDark (Jhonny Monrroy)
     * @version 1.0 beta 15/05/2016
     * @param mat
     *            Matriz de enteros con la informacion necesario
     * @return Un entero que representa el numero de movimientos necesarios para
     *         obtener una matriz bonita
     */
    private static int obtenerResultadoInfo(int[][] mat) {
        int indI = 0, indJ = 0; // para los indices del 1
        boolean sw = false;

        // buscamos los indices del 1
        for (int i = 0; i < 5 && !sw; i++) {
            for (int j = 0; j < 5 && !sw; j++) {
                if (mat[i][j] == 1) {
                    indI = i;
                    indJ = j;
                    sw = true;
                }
            }
        }

        // calculamos la cantidad de movimientos necesarios
        return Math.abs(2 - indI) + Math.abs(2 - indJ);
    }
}
