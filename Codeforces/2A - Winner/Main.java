import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Solucion al Problema: 2A - Winner [http://codeforces.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0 beta 24/09/2014
 */
// ACCEPTED!!! xD
public class Main {
    public static void main(String[] args) {
        Scanner Lee;
        int n;
        String[] rNames;
        int[] rScores;

        // aqui inicia el programa
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            n = Lee.nextInt();
            rNames = new String[n];
            rScores = new int[n];
            for (int i = 0; i < n; i++) {
                rNames[i] = Lee.next();
                rScores[i] = Lee.nextInt();
            }
            procesar(rNames, rScores, n);
        }
    }

    /**
     * Resuelve el problema
     * 
     * @author BreakDark (Jhonny Monrroy)
     * @version 2.0.1 beta 24/09/2014
     * @param rNames
     * @param rScores
     * @param n
     */
    private static void procesar(String[] rNames, int[] rScores, int n) {
        HashMap<Integer, String> indiceJugador = new HashMap<Integer, String>();
        HashMap<String, Integer> jugadorIndice = new HashMap<String, Integer>();
        int[] puntajes = new int[n];
        int numJugadores = 0;
        int max = Integer.MIN_VALUE;
        int indGanador = -1;
        int i;
        boolean hayGanador;
        BitSet ganadores;

        for (i = 0; i < n; i++) {
            if (!indiceJugador.containsValue(rNames[i])) {
                indiceJugador.put(numJugadores, rNames[i]);
                jugadorIndice.put(rNames[i], numJugadores);
                puntajes[numJugadores] = rScores[i];
                numJugadores++;
            } else
                puntajes[jugadorIndice.get(rNames[i])] += rScores[i];
        }
        // buscamos el maximo puntaje
        for (i = 0; i < numJugadores; i++)
            if (puntajes[i] > max)
                max = puntajes[i];
        // buscamos a todos los ganadores
        ganadores = new BitSet(numJugadores);
        for (i = 0; i < numJugadores; i++)
            if (puntajes[i] == max)
                ganadores.set(i);
        // preguntamos si son mas de 1
        if (ganadores.cardinality() > 1) {
            // emulamos el juego hasta encontrar al verdadero ganador
            puntajes = new int[numJugadores];
            hayGanador = false;
            for (i = 0; i < n; i++) {
                if (ganadores.get(jugadorIndice.get(rNames[i]))) {
                    if (rScores[i] >= 0) {
                        puntajes[jugadorIndice.get(rNames[i])] += rScores[i];
                        if (puntajes[jugadorIndice.get(rNames[i])] >= max
                                && !hayGanador) {
                            indGanador = jugadorIndice.get(rNames[i]);
                            hayGanador = true;
                        }
                    } else {
                        if (hayGanador
                                && puntajes[jugadorIndice.get(rNames[i])] == indGanador)
                            hayGanador = false;
                        puntajes[jugadorIndice.get(rNames[i])] += rScores[i];
                    }
                }
            }
            System.out.println(indiceJugador.get(indGanador));
        } else {
            for (i = 0; i < numJugadores; i++)
                if (ganadores.get(i)) {
                    System.out.println(indiceJugador.get(i));
                    return;
                }
        }
    }
}
