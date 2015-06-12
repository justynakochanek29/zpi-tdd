import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Justyna
 *
 */
public class FactorialSumTest {

	@Test
	public void calculateFactorial() {
		assertEquals("FactorialSum.calculateFactorial()", 3628800, FactorialSum.calculateFactorial(10));
	}

}
