public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaration
		int num1;
		// Assignment
		num1 = 6;
		// Initialization
		int num2 = 4;
		int numAdd = num1 + num2;
		int numSub = num1 - num2;
		double numDiv = num1 / num2;
		int numMultiply = num1 * num2;
		
		System.out.println("The addition result is: " + numAdd);
		System.out.println("The subtraction result is: " + numSub);
		System.out.println("The division result is: " + numDiv);
		System.out.println("The multiplication result is: " + numMultiply);
		
		// NOTE: The final keyword makes it so that variables cannot be assigned.
		final int finalNum1 = 5;
		System.out.println(finalNum1);
		
		// String Concatenation (Using the + operator to combine different variables with a String.
		System.out.println("The number is \"" + num1 + "\"");
		
		System.out.println(String.format("The number is %s", numAdd));
	}

}
