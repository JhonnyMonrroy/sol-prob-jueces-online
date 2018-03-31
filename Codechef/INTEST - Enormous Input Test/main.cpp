/**
 * INTEST - Enormous Input Test [http://www.codechef.com]
 *
 * @author BreakDark
 * @version 2.0 beta ver C++
 */
 // ACEPTADO!!! xD
#include <iostream>
#include <stdio.h>

using namespace std;

int main(){
    long n; // numero de enteros
	long k; // numero para verificar devisibilidad
	long contador; // para contar los divisbles
	long aux; // variable auxiliar

    // AQUI INICIA EL PROGRAMA
	while (scanf("%ld %ld",&n,&k)!=EOF) {
        contador = 0;
		// contamos solo aquellos que son multiplos de k
		while (n--) {
            scanf("%ld",&aux);
            if(aux%k==0)
				contador++;
        }
		printf("%ld\n",contador);
    }
    return 0;
}
