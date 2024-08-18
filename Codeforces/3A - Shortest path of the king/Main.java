import java.util.Scanner;

/**
 * Solucion al Problema: 3A - Shortest path of the king [http://codeforces.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0.1 beta 15/05/2016
 */
// Accepted x)
public class Main {
    public static void main(String[] args) {
        Scanner Lee;
        String s, t;

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            s = Lee.next();
            t = Lee.next();
            procesarInfo(s, t);
        }
    }

    /**
     * @author BreakDark (Jhonny Monrroy)
     * @version 1.0 beta 15/05/2016
     * @param s
     *            coordenadas de s
     * @param t
     *            coordenadas de t
     */
    private static void procesarInfo(String s, String t) {
        int sx, sy, tx, ty;
        sx = s.charAt(0) - 'a' + 1;
        sy = s.charAt(1) - '0';
        tx = t.charAt(0) - 'a' + 1;
        ty = t.charAt(1) - '0';

        int n = 0;
        String[] mov = new String[8];
        String m;
        while (sx != tx || sy != ty) {
            m = "";
            // para ir horizontalmente
            if (sx != tx) {
                if (sx < tx) {
                    m += "R";
                    sx++;
                } else {
                    m += "L";
                    sx--;
                }
            }
            // para ir verticalmente
            if (sy != ty) {
                if (sy > ty) {
                    m += "D";
                    sy--;
                } else {
                    m += "U";
                    sy++;
                }
            }
            mov[n++] = m;
        }
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(mov[i]);
        }
    }
}
