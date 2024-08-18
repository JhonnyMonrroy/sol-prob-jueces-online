import java.util.Scanner;

/**
 * Soluci&oacute;n al problema 380C - Sereja and Brackets -
 * [https://codeforces.com]
 * 
 * @author JhonnyMonrroy - JhonnyMon (Jhonny Monrroy)
 * @version 1.0.2 beta - 11 ago. de 2024
 */

// Time limit exceeded on test 13!!! T_T
public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in), readLine;

		int n, l, r;
		boolean[] sequenceBool;

		Nodo[] arbol;

		sequenceBool = convertToArrayBool(read.nextLine());
		// generamos el arbol de secuencias
		int maxDim = 4 * sequenceBool.length + 1;
		arbol = new Nodo[maxDim]; // tamaño maximo del arbol
		construirArbol(arbol, sequenceBool, 0, sequenceBool.length - 1, 0);

		n = Integer.parseInt(read.nextLine());
		while (n-- > 0) {
			readLine = new Scanner(read.nextLine());
			l = readLine.nextInt();
			r = readLine.nextInt();
			readLine.close();
			Nodo nodoRespuesta = solucion(arbol, 0, sequenceBool.length - 1, l - 1, r - 1, 0);
			System.out.println(nodoRespuesta.respueta << 1); // solucion*2
		}

		read.close();
	}

	static void construirArbol(Nodo[] arbol, boolean[] secuencia, int indiceIzquierdo, int indiceDerecho,
			int indiceArbol) {
		// si es una hoja
		if (indiceIzquierdo == indiceDerecho) {
			arbol[indiceArbol] = secuencia[indiceIzquierdo] ? new Nodo(0, 0, 1) : new Nodo(0, 1, 0);
			return;
		}

		// crear nodos recursivamente
		int mitad = (indiceIzquierdo + indiceDerecho) >> 1; // (l+r)/2
		int subIndiceIzquierdo = (indiceArbol << 1) + 1; // 2*i+1
		int subIndiceDerecho = (indiceArbol << 1) + 2; // 2*i+2
		construirArbol(arbol, secuencia, indiceIzquierdo, mitad, subIndiceIzquierdo); // para la izquierda
		construirArbol(arbol, secuencia, mitad + 1, indiceDerecho, subIndiceDerecho); // para la derecha

		// asociamos el valor calculado el resultados de esa ramas
		arbol[indiceArbol] = unir(arbol[subIndiceIzquierdo], arbol[subIndiceDerecho]);
	}

	static Nodo unir(Nodo nodoA, Nodo nodoB) {
		Nodo resultado = new Nodo(0, 0, 0);
		int numParejas = Math.min(nodoA.nParentesisAbrir, nodoB.nParentesisCerrar); // ( y ) que forman parejas
																					// correctas

		resultado.respueta = nodoA.respueta + nodoB.respueta + numParejas;
		resultado.nParentesisAbrir = nodoA.nParentesisAbrir + nodoB.nParentesisAbrir - numParejas;
		resultado.nParentesisCerrar = nodoA.nParentesisCerrar + nodoB.nParentesisCerrar - numParejas;

		return resultado;
	}

	static boolean[] convertToArrayBool(String sequenceString) {
		// '(' = 0 y ')' = 1
		boolean[] result = new boolean[sequenceString.length()];

		for (int i = 0; i < sequenceString.length(); i++)
			result[i] = sequenceString.charAt(i) == ')';
		return result;
	}

	static Nodo solucion(Nodo[] arbol, int indiceIzquierdo, int indiceDerecho, int subIndiceIzquierdo,
			int subIndiceDerecho, int indiceArbol) {

		if (subIndiceIzquierdo <= indiceIzquierdo && indiceDerecho <= subIndiceDerecho) // si esta incluido
			return arbol[indiceArbol]; // retornamos la hoja

		// si no esta incluido
		if (subIndiceIzquierdo > indiceDerecho || subIndiceDerecho < indiceIzquierdo) // si no esta incluido
			return new Nodo(0, 0, 0); // retornamos una hoja fake, que no afecte al resultado

		// si esta parcialmente incluido o hay interseción
		int mitad = (indiceIzquierdo + indiceDerecho) >> 1;
		int subSubIndIzq = (indiceArbol << 1) + 1; // 2*i+1
		int subSubIndDer = (indiceArbol << 1) + 2; // 2*i+2

		Nodo nodoIzquierdo = solucion(arbol, indiceIzquierdo, mitad, subIndiceIzquierdo, subIndiceDerecho,
				subSubIndIzq);
		Nodo nodoDerecho = solucion(arbol, mitad + 1, indiceDerecho, subIndiceIzquierdo, subIndiceDerecho,
				subSubIndDer);

		return unir(nodoIzquierdo, nodoDerecho);
	}
}

// para la estructura del arbol
class Nodo {
	public int respueta; // numero de combinaciones correctas ()
	public int nParentesisAbrir; // número de (
	public int nParentesisCerrar; // número )

	Nodo(int r, int nPA, int nPC) {
		this.respueta = r;
		this.nParentesisAbrir = nPA;
		this.nParentesisCerrar = nPC;
	}
}
