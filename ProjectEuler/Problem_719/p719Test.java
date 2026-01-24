import java.math.BigInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class p719Test {

	@Test
	void testIsRadixSNumber81() {
		int val = 81;
		Assertions.assertTrue(p719.isRadixSNumber(BigInteger.valueOf((long) Math.sqrt(val))),
				String.format("%d no es un NumberS", val));
	}

	@Test
	void testIsRadixSNumber6724() {
		int val = 6724;
		Assertions.assertTrue(p719.isRadixSNumber(BigInteger.valueOf((long) Math.sqrt(val))),
				String.format("%d no es un NumberS", val));
	}

	@Test
	void testIsRadixSNumber8281() {
		int val = 8281;
		Assertions.assertTrue(p719.isRadixSNumber(BigInteger.valueOf((long) Math.sqrt(val))),
				String.format("%d no es un NumberS", val));
	}

	@Test
	void testIsRadixSNumber9801() {
		int val = 9801;
		Assertions.assertTrue(p719.isRadixSNumber(BigInteger.valueOf((long) Math.sqrt(val))),
				String.format("%d no es un NumberS", val));
	}

	///// test de la funciónT

	@Test
	void testFuncionT() {
		int n = 10000;
		int result = 41333;
		Assertions.assertEquals(BigInteger.valueOf(result), p719.funcionT(BigInteger.valueOf(n)));
	}
}
