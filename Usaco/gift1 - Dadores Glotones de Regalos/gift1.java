import java.io.*;
import java.util.*;

/*
 ID: BreakDark
 LANG: JAVA
 TASK: gift1
 */
// ACEPTADO!!! xD
public class gift1 {
	public static void main(String[] args) throws IOException {
		// abrimos los archivos
		RandomAccessFile archivo = new RandomAccessFile("gift1.in", "r");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"gift1.out")));
		StringTokenizer Lee; // para leer lineas
		byte NP, NGi; // numero de amigos y amigos que reciben regalos
		int i, j, k; // para los bucles
		String[] amigos; // lista de amigos
		short[][] dinero; // dinero por amigos
		byte indice; // indice de amigo que da dinero
		short monto; // monto a dar a cada amigo

		// AQUI INICIA EL PROGRAMA
		Lee = new StringTokenizer(archivo.readLine());
		NP = Byte.parseByte(Lee.nextToken());
		amigos = new String[NP];
		dinero = new short[2][NP];
		for (i = 0; i < NP; i++) {
			Lee = new StringTokenizer(archivo.readLine());
			amigos[i] = Lee.nextToken();
		}
		// revisamos los grupos
		for (i = 0; i < NP; i++) {
			Lee = new StringTokenizer(archivo.readLine());
			indice = busca(Lee.nextToken(), amigos);
			Lee = new StringTokenizer(archivo.readLine());
			dinero[0][indice] = Short.parseShort(Lee.nextToken());
			NGi = Byte.parseByte(Lee.nextToken());
			if (NGi > 0) {
				monto = (short) (dinero[0][indice] / NGi);
				for (k = 0; k < NGi; k++) {
					Lee = new StringTokenizer(archivo.readLine());
					j = busca(Lee.nextToken(), amigos);
					dinero[1][j] += monto;
				}
				dinero[1][indice] += (short) (dinero[0][indice] % NGi);
			}
		}
		// mostramos los resultados
		for (i = 0; i < NP; i++)
			out.println(amigos[i] + " " + (dinero[1][i] - dinero[0][i]));
		out.close(); // cierre el archivo de salida
		System.exit(0);
	}

	/** Funcion que busca el indice en la lista de amigos de un nombre */
	private static byte busca(String nombre, String[] amigos) {
		for (byte i = 0; i < amigos.length; i++)
			if (amigos[i].equals(nombre))
				return i;
		return -1;
	}
}
