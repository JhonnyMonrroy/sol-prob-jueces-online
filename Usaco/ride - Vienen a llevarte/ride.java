import java.io.*;
import java.util.*;

/*
 ID: BreakDark
 LANG: JAVA
 TASK: ride
 */
// ACEPTADO!!! xD
public class ride {
	public static void main(String[] args) throws IOException {
		// abrimos los archivos
		RandomAccessFile archivo = new RandomAccessFile("ride.in", "r");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"ride.out")));
		StringTokenizer Lee; // para leer lineas
		int sumCometa, sumGrupo;
		String nombre; // para guardar el nombre
		int i; // para los bucles

		// AQUI INICIA EL PROGRAMA
		sumCometa = sumGrupo = 1;
		Lee = new StringTokenizer(archivo.readLine());
		nombre = Lee.nextToken();
		for (i = 0; i < nombre.length(); i++)
			sumCometa *= (nombre.charAt(i) - '@');
		Lee = new StringTokenizer(archivo.readLine());
		nombre = Lee.nextToken();
		for (i = 0; i < nombre.length(); i++)
			sumGrupo *= (nombre.charAt(i) - '@');
		if (sumCometa % 47 == sumGrupo % 47)
			out.println("GO");
		else
			out.println("STAY");
		out.close(); // cierre el archivo de salida
		System.exit(0);
	}
}
