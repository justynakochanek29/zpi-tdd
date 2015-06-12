import java.math.BigInteger;

public class FactorialSum {
	
	/**
	 *  Private attribute - sum of factorial digits
	 */
	private int sum = 0;
	

	/**
	 * Constructor for class FactorialSum
	 * 
	 * @param n - integer number
	 */
	public FactorialSum(int n) {
		int[] array = convertIntoArray(calculateFactorial(n));
		this.sum = sumOfFactorialDigits(array);
	}
		
	/**
	 * Getter for private int sum
	 * 
	 * @return sum of factorial digits
	 */
	public int getSum() {
		return this.sum;
	}

	/**
	 * Method calculate factorial for number from parameter
	 * 
	 * @param n - integer number
	 * @return factorial of number from parameter
	 */
	public static BigInteger calculateFactorial(int n){
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 1; i <= n; i++){
			result  = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
	
	/**
	 * Method convert BigInteger number into array of its digits
	 * 
	 * @param number
	 * @return array of integer digits
	 */
	public static int[] convertIntoArray(BigInteger number){
		String temp = number.toString();
		int[] numberArray = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
			numberArray[i] = temp.charAt(i) - '0';
		}
		
		return numberArray;
	}
	
	/**
	 * Method calculate sum for elements of integer array
	 * 
	 * @param array - array with integer elements
	 * @return sum of array elements
	 */
	public static int sumOfFactorialDigits(int[] array){
		int result = 0;
		for (int i = 0; i < array.length; i++){
			result += array[i];
		}
		return result;
	}
}