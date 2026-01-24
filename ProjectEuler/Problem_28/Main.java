/**
 * 028 - Problem 28 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        int sum; // para sumar todos los valores de las diagonales
        int inc = 2; // para incrementar 4 veces de dos en dos
        int i = 1, j; // un contador y bucles
        int limite = 1001;

        // AQUI INICIA EL PROGRAMA
        sum = 1; // la primera vez
        for (i = 3, j = 1, inc = 2; i <= limite * limite; i += inc, j++) {
            sum += i;
            if (j == 4) {
                inc += 2;
                j = 0;
            }
        }
        // mostramos el resultado
        System.out.println("La suma de las diagonales es: " + sum);
    }
}
