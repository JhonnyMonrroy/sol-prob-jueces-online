import org.junit.Assert;
import org.junit.Test;

/**
 * Test a la Soluci&oacute;n al problema: SUMTRIAN - Sums in a Triangle
 * [https://www.codechef.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0b 26 feb. 2017
 */
public class MainTest {
	int numFil;
	int[][] tri;
	int resultado;

	/**
	 * Test 1 method for {@link Main#obtenerResultado(int[][], int)}.
	 */
	@Test
	public void testObtenerResultado1() {
		numFil = 3;
		int[][] tri = { { 1 }, { 2, 1 }, { 1, 2, 3 } };
		resultado = 5;

		Assert.assertEquals(resultado, Main.obtenerResultado(tri, numFil));
	}

	/**
	 * Test 2 method for {@link Main#obtenerResultado(int[][], int)}.
	 */
	@Test
	public void testObtenerResultado2() {
		numFil = 4;
		int[][] tri = { { 1 }, { 1, 2 }, { 4, 1, 2 }, { 2, 3, 1, 1 } };
		resultado = 9;

		Assert.assertEquals(resultado, Main.obtenerResultado(tri, numFil));
	}
}
