import java.util.Scanner;

/**
 * Soluci&oacute;n al problema: NAME2 - Your Name is Mine
 * [https://www.codechef.com/]
 * 
 * @author Jhonny Monrroy (JhonnyMon)
 * @version 1.0 23 ene 2023
 */
// Correct Answer!!! xD
class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int t, i, j;
		String m, w;

		t = read.nextInt();
		while (t-- > 0) {
			m = read.next();
			w = read.next();
			// buscamos el de menor longitud
			if (m.length() > w.length()) {
				String aux = m;
				m = w;
				w = aux;
			}
			i = 0; // recorremos las cadenas
			j = 0;
			while (i < m.length() && j < w.length()) {
				if (m.charAt(i) == w.charAt(j))
					i++;
				j++;
			}
			System.out.println(i == m.length() ? "YES" : "NO");
		}

		read.close();
	}
}
