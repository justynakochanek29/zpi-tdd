class FactorialSum {
	
	private int sum = 0;
	
	public FactorialSum(int n) {
		int[] array = convertIntoArray(calculateFactorial(n));
		this.sum = sumOfFactorialDigits(array);
	}
		
	public int getSum() {
		return this.sum;
	}

	public static int calculateFactorial(int n){
		int result = 1;
		for (int i = 1; i <= n; i++){
			result = result * i;
		}
		return result;
	}
	
	public static int[] convertIntoArray(int number){
		String arr = Integer.toString(number);
		int[] newNumber = new int[arr.length()];
		for (int i = 0; i < arr.length(); i++)
		{
			newNumber[i] = arr.charAt(i) - '0';
		}
		
		return newNumber;
	}
	
	public static int sumOfFactorialDigits(int[] array){
		int result = 0;
		for (int i = 0; i < array.length; i++){
			result+= array[i];
		}
		return result;
	}
}