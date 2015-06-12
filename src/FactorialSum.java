class FactorialSum {
	
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
}