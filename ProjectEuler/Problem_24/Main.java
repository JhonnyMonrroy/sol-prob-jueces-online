import java.util.Arrays;

/**
 * 024 - Problem 24 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
    static String[] per = new String[362880]; // para guardar las 10!
                                              // permutaciones
    static int dim; // dimension del vector de permutaciones

    public static void main(String[] args) {
        char[] vec = "013456789".toCharArray(); // para las permutaciones de
                                                // 0123456789

        // AQUI INICIA EL PROGRAMA
        permutar(vec, 9);
        // ordenamos el vector lexicograficamente
        Arrays.sort(per);
        // mostramos la permutación 9! + 9! + 274240 = 1000000
        System.out.println("La permutacion 1000000 es: 2" + per[274239]);
    }

    /** permuta un vector segun el n dado */
    private static void permutar(char[] v, int n) {
        if (n == 1) {
            per[dim++] = String.valueOf(v);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(v, i, n - 1);
            permutar(v, n - 1);
            swap(v, i, n - 1);
        }
    }

    /**
     * Intercambia el elemento de la posicion i con el de la posicion j en el
     * vector v
     */
    private static void swap(char[] v, int i, int j) {
        char aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
