import java.util.Scanner;

/**
 * Solucion al Problema: 231A - Team [http://codeforces.com]
 * 
 * @author BreakDark
 * @version 1.0 beta 21/11/2012
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        short n; // numero de problemas
        short numRes; // numero de problemas que resolveran
        byte aux; // variable auxiliar

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            n = Lee.nextShort(); // leemos los datos de entrada
            numRes = 0;
            while (n-- > 0) {
                aux = 0;
                aux += Lee.nextByte();
                aux += Lee.nextByte();
                aux += Lee.nextByte();
                if (aux > 1)
                    numRes++;
            }
            // mostramos el resultado
            System.out.println(numRes);
        }
    }
}
