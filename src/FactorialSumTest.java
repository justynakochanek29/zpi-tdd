import static org.junit.Assert.*;

import org.junit.Test;


/**
 * This is a test class
 * 
 * @author Justyna
 *
 */
public class FactorialSumTest {

	/**
	 * Test for method calculateFactorial()
	 */
	@Test
	public void calculateFactorial() {
		assertEquals("FactorialSum.calculateFactorial()", 3628800, FactorialSum.calculateFactorial(10));
	}
	
	/**
	 * Test for method convertIntoArray()
	 */
	@Test
	public void convertIntoArray(){
		int[] test = {1,2,3};
		assertArrayEquals("FactorialSum.convertIntoArray()", test, FactorialSum.convertIntoArray(123));
	}
	
	/**
	 * Test for method sumOfFactorialDigits()
	 */
	@Test
	public void sumOfFactorialDigits(){
		int[] test = {1,2,3};
		assertEquals("FactorialSum.sumOfFactorialDigits()",6 ,FactorialSum.sumOfFactorialDigits(test));
	}
	
	/**
	 * Test for getter getSum()
	 */
	@Test
	public void getSum(){
		FactorialSum test = new FactorialSum(10);
		assertEquals("test.getSum()",27 ,test.getSum());
	}

}
