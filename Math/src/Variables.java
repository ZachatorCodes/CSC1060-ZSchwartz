public class Variables {

	public static void main(String[] args) {
		
		// Declaration
		int num1;
		// Assignment
		num1 = 6;
		// Initialization
		int num2 = 4;
		
		// Create variables for math operators
		int numAdd = num1 + num2;
		int numSub = num1 - num2;
		int numDiv = num1 / num2;
		int numMultiply = num1 * num2;
		
		// Print results of math operations
		System.out.println("The addition result is: " + numAdd);
		System.out.println("The subtraction result is: " + numSub);
		System.out.println("The division result is: " + numDiv);
		System.out.println("The multiplication result is: " + numMultiply);
		
		// NOTE: The final keyword makes it so that variables cannot be assigned.
		final int finalNum1 = 5;
		System.out.println(finalNum1);
		
		// String Concatenation (Using the + operator to combine different variables with a String.
		System.out.println("The number is \"" + num1 + "\"");
		
		// You can use the String method format for String interpolation
		System.out.println(String.format("The number is %s", numAdd));
		System.out.println(String.format("This is a math test. 1 + 1 is %s", (1 + 1)));
		
		// Type Casting
		double num3 = 1.324;
		int num4 = (int)num3;
		System.out.println(num4);
		System.out.println(String.format("Number 3 is %s and Number 4 is %s", num3, num4));
		
		// Modulo Operator: Returns Remainder
		int num5 = num1 % num2;
		System.out.println(num1 / num2);
		System.out.println(num5);
		
		// Use the built in Math class to access Math methods
		int num6 = 144;
		double num7 = Math.sqrt(num6);
		System.out.println(num7);
		
		double num8 = -1.428;
		double num8ABS = Math.abs(num8);
		System.out.println(num8ABS);
		
		// If you have calculations that have more than one intermediate step, use variables
		
	}
}
