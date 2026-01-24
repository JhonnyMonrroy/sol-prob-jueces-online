/**
 * 017 - Problem 17 [http://projecteuler.net]
 * 
 * @author BreakDark
 * @version 1.0.1 beta
 */
// ACEPTADO!!! xD
public class Main {
    public static void main(String[] args) {
        // definimos vectores para las unidades y decenas
        int numLetras = 0; // contador de letras
        final short limite = 1000; // limite de la cuenta

        // AQUI INICIA EL PROGRAMA!!!
        // contamos del 1 al 1000
        for (short i = 1; i <= limite; i++)
            numLetras += obtenNumLetras(i);
        System.out.println("Numero total de letras del 1 al " + limite + ": "
                + numLetras);
    }

    /** obtiene el numero de caracteres del literal del numero */
    private static int obtenNumLetras(int i) {
        String numero = Integer.toString(i);
        byte res = 0;
        // definimos vectores para las unidades y decenas
        String[] num = new String[10001];
        num[0] = "";
        num[1] = "one";
        num[2] = "two";
        num[3] = "three";
        num[4] = "four";
        num[5] = "five";
        num[6] = "six";
        num[7] = "seven";
        num[8] = "eight";
        num[9] = "nine";
        num[10] = "ten";
        num[11] = "eleven";
        num[12] = "twelve";
        num[13] = "thirteen";
        num[14] = "fourteen";
        num[15] = "fifteen";
        num[16] = "sixteen";
        num[17] = "seventeen";
        num[18] = "eighteen";
        num[19] = "nineteen";
        num[20] = "twenty";
        num[30] = "thirty";
        num[40] = "forty";
        num[50] = "fifty";
        num[60] = "sixty";
        num[70] = "seventy";
        num[80] = "eighty";
        num[90] = "ninety";
        num[100] = "onehundred";
        num[1000] = "onethousand";

        // identificamos el numero
        switch (numero.length()) {
            case 1:
                res += num[i].length();
                break;
            case 2:
                if (Byte.parseByte(numero) < 21)
                    res += num[i].length();
                else {
                    res += num[Byte.parseByte(numero.charAt(0) + "0")].length();
                    res += num[numero.charAt(1) - '0'].length();
                }
                break;
            case 3:
                res += num[numero.charAt(0) - '0'].length();
                res += num[100].substring(3).length();
                if (Short.parseShort(numero.substring(1)) > 0) {
                    res += "and".length();
                    res += obtenNumLetras(Short.parseShort(numero.substring(1)));
                }
                break;
            case 4:
                res += num[1000].length();
                break;
        }
        return res;
    }
}
