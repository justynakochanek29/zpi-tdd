import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigInteger;

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
		BigInteger data = BigInteger.valueOf(3628800);
		assertEquals("FactorialSum.calculateFactorial()", data, FactorialSum.calculateFactorial(10));
	}
	
	/**
	 * Test for method convertIntoArray()
	 */
	@Test
	public void convertIntoArray(){
		int[] test = {1,2,3};
		BigInteger data = BigInteger.valueOf(123);
		assertArrayEquals("FactorialSum.convertIntoArray()", test, FactorialSum.convertIntoArray(data));
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
		FactorialSum test2 = new FactorialSum(100);
		assertEquals("test.getSum()",27 ,test.getSum());
		assertEquals("test2.getSum()",648 ,test2.getSum());
	}
}
