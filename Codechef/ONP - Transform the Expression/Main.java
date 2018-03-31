// ACEPTADO!!! xD
import java.util.Scanner;
import java.util.Stack;

/**
 * ONP - Transform the Expression [http://www.codechef.com]
 * 
 * @author BreakDark
 * @version 1.0 beta
 */
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte t; // para los casos de prueba

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        t = Lee.nextByte();
        while (t-- > 0)
            System.out.println(procesar(Lee.next().toCharArray()));
    }

    /**
     * Funcion que transforma una expresion en formato RPN
     * 
     * @param expresion
     *            vector de chars
     * @return
     */
    private static String procesar(char[] expr) {
        Stack<Byte> pila = new Stack<Byte>(); // pila para guardar los terminos
        String res = "";

        for (int i = 0; i < expr.length - 1; i++) {
            if (expr[i] != '(')
                if ((expr[i] == '+') || (expr[i] == '-') || (expr[i] == '*')
                        || (expr[i] == '/') || (expr[i] == '^'))
                    pila.push((byte) expr[i]);
                else if (expr[i] != ')')
                    res += expr[i];
                else
                    res += (char) pila.pop().byteValue();

        }
        while (!pila.isEmpty())
            res += (char) pila.pop().byteValue();
        return res;
    }
}
