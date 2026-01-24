import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 022 - Problem 22 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // Para leer los datos de entrada
        StringTokenizer LeeLinea; // para leer una linea
        String[] nombre; // vector de nombres
        int dim; // numero de nombres
        int i; // para los indices

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        // leemos la informacion
        LeeLinea = new StringTokenizer(Lee.next().replace('"', ' ')
                .replace(',', ' '));
        dim = LeeLinea.countTokens();
        nombre = new String[dim];
        for (i = 0; i < dim; i++)
            nombre[i] = LeeLinea.nextToken();
        // mostramos el resultado
        System.out.println("El score total de todos los nombres es: "
                + totalScore(nombre, dim));
    }

    /**
     * Funcion que obtiene el score total de lo dim del nombres del vec
     * 
     * @author BreakDark
     * @param vec
     *            vector de nombres
     * @param dim
     *            tamanio del vector
     * @return el score total de nos nombres
     */
    private static int totalScore(String[] vec, int dim) {
        int total = 0;
        int i, j; // para los bucles
        int sumLetras; // para sumar el valor de las letras

        // ordenamos el vector
        Arrays.sort(vec);
        for (i = 0; i < dim; i++) {
            sumLetras = 0;
            for (j = 0; j < vec[i].length(); j++)
                sumLetras += (vec[i].charAt(j) - '@');
            // multiplicamos y sumamos
            total += (sumLetras * (i + 1));
        }
        return total;
    }
}
