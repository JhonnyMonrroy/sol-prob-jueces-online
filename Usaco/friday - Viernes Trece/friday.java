/*
 ID: BreakDark
 LANG: JAVA
 TASK: friday
 */
import java.io.*;
import java.util.*;
// ACEPTADO!!! xD
public class friday {
	public static void main(String[] args) throws IOException {
		// abrimos los archivos
		RandomAccessFile archivo = new RandomAccessFile("friday.in", "r");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"friday.out")));
		StringTokenizer Lee; // para leer lineas
		short N;
		int[] dias = new int[7]; // dias de la semana
		byte dia = 2; // empieza en lunes
		byte diasMes = 0; // dias de un mes
		int i, j, k;

		// AQUI INICIA EL PROGRAMA
		Lee = new StringTokenizer(archivo.readLine());
		N = Short.parseShort(Lee.nextToken());
		for (i = 1900; i < 1900 + N; i++) {
			// contamos por mes
			for (j = 1; j <= 12; j++) {
				switch (j) {
				case 1:
					diasMes = 31;
					break;
				case 2:
					if (i % 100 == 0)
						if (i % 400 == 0)
							diasMes = 29;
						else
							diasMes = 28;
					else if (i % 4 == 0)
						diasMes = 29;
					else
						diasMes = 28;
					break;
				case 3:
					diasMes = 31;
					break;
				case 4:
					diasMes = 30;
					break;
				case 5:
					diasMes = 31;
					break;
				case 6:
					diasMes = 30;
					break;
				case 7:
					diasMes = 31;
					break;
				case 8:
					diasMes = 31;
					break;
				case 9:
					diasMes = 30;
					break;
				case 10:
					diasMes = 31;
					break;
				case 11:
					diasMes = 30;
					break;
				case 12:
					diasMes = 31;
					break;
				}
				// contamos los domingos que cayeron en primero de mes
				for (k = 1; k <= diasMes; k++) {
					if (k == 13)
						dias[dia]++;
					dia++;
					if (dia > 6)
						dia = 0;
				}
			}
		}
		out.println(dias[0] + " " + dias[1] + " " + dias[2] + " " + dias[3]
				+ " " + dias[4] + " " + dias[5] + " " + dias[6]);
		out.close(); // cierre el archivo de salida
		System.exit(0);
	}
}
