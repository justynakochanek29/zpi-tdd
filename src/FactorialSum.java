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
	public static int calculateFactorial(int n){
		int result = 1;
		for (int i = 1; i <= n; i++){
			result *= i;
		}
		return result;
	}
	
	/**
	 * Method convert integer number into array of its digits
	 * 
	 * @param number
	 * @return array of integer digits
	 */
	public static int[] convertIntoArray(int number){
		String temp = Integer.toString(number);
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
			result+= array[i];
		}
		return result;
	}
}