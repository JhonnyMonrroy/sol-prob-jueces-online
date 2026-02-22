import java.util.Scanner;
import java.util.Stack;

/**
 * [https://www.spoj.com] Solución al problema OPN - Transform the Expression
 * 
 * @author JhonnyMonrroy
 * @version 1.0 22 feb 2026
 */
// accepted xD
public class Main {
	public static void main(String[] args) {
		Scanner Lee = new Scanner(System.in);
		int t = Lee.nextInt();

		while (t-- > 0)
			System.out.println(solucion(Lee.next()));

		Lee.close();
	}

	private static String solucion(String expresion) {
		Stack<String> pila = new Stack<String>();

		for (int i = 0; i < expresion.length(); i++) {
			char letra = expresion.charAt(i);
			if (letra != ')')
				pila.push("" + letra);
			else {
				String term2 = pila.pop();
				String operador = pila.pop();
				String term1 = pila.pop();
				pila.pop(); // nos deshacemos del '('
				pila.push(term1 + term2 + operador);
			}
		}

		return pila.peek();
	}
}
