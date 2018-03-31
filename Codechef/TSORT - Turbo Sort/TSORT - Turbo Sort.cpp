///**
// * Problema: TSORT - Turbo Sort [http://www.codechef.com]
// *
// * author BreakDark (Jhonny Monrroy)
// * version 1.2b CPP 25/02/2015
// */
// Correct Answer!!! xD
#include <iostream>
#include <cstdio>
using namespace std;

int main() {
	int t; // cantidad de numeros en la lista
	int dato;
	int N[1000001] = { 0 }; // vector de numeros
	int min = 999999, max = 0;

	int i;

	// aqui inicia el programa
	scanf("%d", &t);
	for (i = 0; i < t; i++) {
		scanf("%d", &dato);
		N[dato]++;
		if (dato < min)
			min = dato;
		if (dato > max)
			max = dato;
	}
	for (i = min; i <= max; i++)
		while (N[i]-- > 0)
			printf("%d\n", i);
	return 0;
}
