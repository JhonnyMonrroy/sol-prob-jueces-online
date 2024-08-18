import java.util.Arrays;
import java.util.Scanner;

/**
 * Solucion al Problema: 160A - Twins [http://codeforces.com]
 * 
 * @author BreakDark
 * @version 1.1 beta 21/11/2012
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte n; // numero de monedas
        byte[] vec; // vector de valores de monedas
        short suma; // suma total
        byte i; // para los bucles
        byte cont; // contador
        short aux; // suamauxiliar

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            // leemos los datos
            n = Lee.nextByte();
            suma = 0;
            vec = new byte[n];
            for (i = 0; i < n; i++) {
                vec[i] = Lee.nextByte();
                suma += vec[i];
            }
            suma >>= 1; // buscamos la mitad
            Arrays.sort(vec); // ordenamos
            // buscamos el numero minimo necesario de monedas
            aux = 0;
            for (i = (byte) (n - 1), cont = 1; i >= 0; i--, cont++) {
                aux += vec[i];
                if (aux > suma)
                    break;
            }
            // mostramos el resultado
            System.out.println(cont);
        }
    }
}
