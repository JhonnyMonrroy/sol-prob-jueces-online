//============================================================================
// Name        : 380C_SerejaAndBrackets.cpp
// Author      : Jhonny Monrroy
//============================================================================

// Accepted!!! xD

#include <iostream>
#include <string>
#include <stack>

using namespace std;

bool sequenceBool[1000001];

struct Nodo{
	int respueta; // numero de combinaciones correctas ()
	int nParentesisAbrir; // numero de (
	int nParentesisCerrar; // número )
}arbol[1000000*4+1];	// para la cantidad maxima de nodos

Nodo unir(Nodo nodoA, Nodo nodoB) {
	Nodo resultado = {0, 0, 0};
	int numParejas = min(nodoA.nParentesisAbrir, nodoB.nParentesisCerrar); // ( y ) que forman parejas
																					// correctas
	resultado.respueta = nodoA.respueta + nodoB.respueta + numParejas;
	resultado.nParentesisAbrir = nodoA.nParentesisAbrir + nodoB.nParentesisAbrir - numParejas;
	resultado.nParentesisCerrar = nodoA.nParentesisCerrar + nodoB.nParentesisCerrar - numParejas;

	return resultado;
}

void construirArbol(int indiceIzquierdo, int indiceDerecho, int indiceArbol) {
	// si es una hoja
	if (indiceIzquierdo == indiceDerecho) {
		arbol[indiceArbol] = {0, !sequenceBool[indiceIzquierdo], sequenceBool[indiceIzquierdo]};
		return;
	}

	// crear nodos recursivamente
	int mitad = (indiceIzquierdo + indiceDerecho) >> 1; // (l+r)/2
	int subIndiceIzquierdo = (indiceArbol << 1) + 1; // 2*i+1
	int subIndiceDerecho = (indiceArbol << 1) + 2; // 2*i+2
	construirArbol(indiceIzquierdo, mitad, subIndiceIzquierdo); // para la izquierda
	construirArbol(mitad + 1, indiceDerecho, subIndiceDerecho); // para la derecha

	// asociamos el valor calculado el resultados de esa ramas
	arbol[indiceArbol] = unir(arbol[subIndiceIzquierdo], arbol[subIndiceDerecho]);
}

Nodo solucion(int indiceIzquierdo, int indiceDerecho, int subIndiceIzquierdo, int subIndiceDerecho, int indiceArbol) {
	if (subIndiceIzquierdo <= indiceIzquierdo && indiceDerecho <= subIndiceDerecho) // si esta incluido
		return arbol[indiceArbol]; // retornamos la hoja

	// si no esta incluido
	if (subIndiceIzquierdo > indiceDerecho || subIndiceDerecho < indiceIzquierdo) // si no esta incluido
		return {0, 0, 0}; // retornamos una hoja fake, que no afecte al resultado

	// si esta parcialmente incluido o hay interseción
	int mitad = (indiceIzquierdo + indiceDerecho) >> 1;
	int subSubIndIzq = (indiceArbol << 1) + 1; // 2*i+1
	int subSubIndDer = (indiceArbol << 1) + 2; // 2*i+2

	Nodo nodoIzquierdo = solucion(indiceIzquierdo, mitad, subIndiceIzquierdo, subIndiceDerecho, subSubIndIzq);
	Nodo nodoDerecho = solucion(mitad + 1, indiceDerecho, subIndiceIzquierdo, subIndiceDerecho, subSubIndDer);

	return unir(nodoIzquierdo, nodoDerecho);
}

int main() {
	int n, l, r, dimCadena;

	string sequence;

	cin >> sequence;
	dimCadena = sequence.length();

	for(int i=0; i<dimCadena; i++)
		sequenceBool[i]=sequence[i]==')';	// '(' == 0 y ')' == 1

	construirArbol(0, dimCadena - 1 , 0);

	cin >> n;

	while(n-->0){
		cin>>l>>r;
		Nodo nodoRespuesta = solucion(0, dimCadena - 1, l - 1, r - 1, 0);
		cout<<(nodoRespuesta.respueta<<1)<<endl;
	}
	return 0;
}
