import org.junit.Assert;
import org.junit.Test;

/**
 * Test a la Soluci&oacute;n al problema: TLG - The Lead Game
 * [https://www.codechef.com]
 * 
 * @author BreakDark (Jhonny Monrroy)
 * @version 1.0b 25 feb. 2017
 */
public class MainTest {
	short n;
	short[] si, ti;
	String respuesta;

	/**
	 * Test method for {@link Main#obtenerResultado(short[], short[], short)}.
	 */
	@Test
	public void testObtenerResultado() {
		n = 5;

		si = new short[n];
		ti = new short[n];

		si[0] = 140;
		si[1] = 89;
		si[2] = 90;
		si[3] = 112;
		si[4] = 88;

		ti[0] = 82;
		ti[1] = 134;
		ti[2] = 110;
		ti[3] = 106;
		ti[4] = 90;

		respuesta = "1 58";

		Assert.assertEquals(respuesta, Main.obtenerResultado(si, ti, n));
	}

}
