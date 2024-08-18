import java.util.BitSet;
import java.util.Scanner;

/**
 * Solucion al Problema: 228A - Is your horseshoe on the other hoof
 * [http://codeforces.com]
 * 
 * @author BreakDark
 * @version 1.0 beta 22/01/2013
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        int[] s = new int[4]; // las herraduras de colores
        BitSet contados = new BitSet(4); // para no contar 2 veces
        byte i, j; // para los indices
        byte cont; // contador

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            for (i = 0; i < 4; i++)
                s[i] = Lee.nextInt();
            // solucion
            cont = 0;
            contados.clear();
            for (i = 0; i < 3; i++)
                if (!contados.get(i))
                    for (j = (byte) (i + 1); j < 4; j++)
                        if (s[i] == s[j]) {
                            cont++;
                            contados.set(j);
                        }
            // respuesta
            System.out.println(cont);
        }
    }
}
