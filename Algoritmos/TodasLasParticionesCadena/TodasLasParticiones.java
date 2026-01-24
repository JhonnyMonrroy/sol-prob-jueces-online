import java.util.ArrayList;
import java.util.List;

public class TodasLasParticiones {
	public static void main(String[] args) {

		String texto = "abc";
		List<List<String>> resultado = particionar(texto);

		for (List<String> particion : resultado)
			System.out.println(particion);
	}

	public static List<List<String>> particionar(String cadena) {
		List<List<String>> resultado = new ArrayList<>();
		backtrack(0, cadena, new ArrayList<String>(), resultado);
		return resultado;
	}

	private static void backtrack(int inicio, String cadena, ArrayList<String> particionActual,
			List<List<String>> resultado) {
		if (inicio == cadena.length()) {
			resultado.add(new ArrayList<>(particionActual));	// agregar una copia de la particionActual a resultado
			return;
		}

		for (int i = inicio; i < cadena.length(); i++) {
			String subCadena = cadena.substring(inicio, i + 1);
			particionActual.add(subCadena);	// agregar la subcadena a la partición actual
			backtrack(i + 1, cadena, particionActual, resultado);
			particionActual.removeLast();	//eliminar la ultima subcadena
		}
	}
}
