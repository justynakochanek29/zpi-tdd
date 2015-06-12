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
	
	@Test
	public void convertIntoArray(){
		int[] test = {1,2,3};
		assertArrayEquals("FactorialSum.convertIntoArray()", test, FactorialSum.convertIntoArray(123));
	}
	
	@Test
	public void sumOfFactorialDigits(){
		int[] test = {1,2,3};
		assertEquals("FactorialSum.sumOfFactorialDigits()",6 ,FactorialSum.sumOfFactorialDigits(test));
	}
	
	@Test
	public void getSum(){
		FactorialSum test = new FactorialSum(10);
		assertEquals("test.getSum()",27 ,test.getSum());
	}

}
