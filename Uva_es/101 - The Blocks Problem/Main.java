import java.util.Scanner;
import java.util.Stack;

/**
 * Soluci&oacute;n a 101 - The Blocks Problem [https://uva.onlinejudge.org/]
 * 
 * @author Jhonny Monrroy (Jhonny Monrroy )
 * @version 1.0.2 02 abr 2022
 */
// Accepted 	JAVA 	0.230 	2022-04-08 01:04:52 ;)
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n; // numero de bloques y bloques a y b

		n = Integer.valueOf(in.nextLine());

		// cargamos el Vector de Pilas
		@SuppressWarnings("unchecked")
		Stack<Integer>[] vecStack = new Stack[n];
		for (int i = 0; i < n; i++) {
			vecStack[i] = new Stack<Integer>();
			vecStack[i].add(i);
		}

		while (in.hasNextLine()) {
			String command = in.nextLine();
			if (command.equals("quit"))
				break;

			// procesamos el comando
			String[] comData = command.split(" ");
			int a = Integer.valueOf(comData[1]);
			int b = Integer.valueOf(comData[3]);
			// preguntamos si es un comando ilegal
			if (a != b) {
				// buscamos los indices
				int indexA = -1;
				int indexB = -1;
				int subIndexA = -1;
				int subIndexB = -1;
				Stack<Integer> auxIni;
				Stack<Integer> auxLast;
				for (int i = 0; i < n && subIndexA == -1; i++) {
					indexA = i;
					subIndexA = vecStack[i].indexOf(a);
				}
				for (int i = 0; i < n && subIndexB == -1; i++) {
					indexB = i;
					subIndexB = vecStack[i].indexOf(b);
				}
				// preguntamos si es un comando ilegal
				if (indexA != indexB) {
					if (comData[0].equals("move")) {
						// colocamos todos los bloques que estan arriba de a a sus posiciones iniciales
						while (vecStack[indexA].peek() != a) {
							int aux = vecStack[indexA].pop();
							vecStack[aux].push(aux);
						}
						if (comData[2].contains("onto")) {
							// colocamos todos los bloques que estan arriba de b a sus posiciones iniciales
							while (vecStack[indexB].peek() != b) {
								int aux = vecStack[indexB].pop();
								// los bloques encima de los bloques restaurados deben ser movidos a sus
								// posiciones originales
								vecStack[aux].push(aux);
							}
						}
						// eliminamos a de su pila
						vecStack[indexB].push(vecStack[indexA].pop());
					} else {
						// pile
						// eliminamos toda la pila de a incluida
						auxIni = new Stack<Integer>();
						auxLast = new Stack<Integer>();
						auxIni.addAll(vecStack[indexA].subList(0, subIndexA));
						auxLast.addAll(vecStack[indexA].subList(subIndexA, vecStack[indexA].size()));
						vecStack[indexA] = auxIni;
						if (comData[2].contains("onto")) {
							// colocamos todos los bloques que estan arriba de b a sus posiciones iniciales
							while (vecStack[indexB].peek() != b) {
								int aux = vecStack[indexB].remove(subIndexB + 1);
								vecStack[aux].push(aux);
							}
						}
						// over
						vecStack[indexB].addAll(auxLast);
					}
				}
			}
		}
		in.close();

		// mostramos el resultado
		for (int i = 0; i < n; i++) {
			String output = i + ":";
			while (!vecStack[i].empty()) {
				output += " " + vecStack[i].remove(0);
			}
			System.out.println(output);
		}
	}
}
