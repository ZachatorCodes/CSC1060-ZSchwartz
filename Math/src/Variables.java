
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaration
		int num1;
		// Assignment
		num1 = 5;
		num1 = 6;
		
		int num2 = 4;
		int num3 = num1 + num2;
		// NOTE: The final keyword makes it so that variables cannot be assigned.
		final int finalNum1 = 5;
		
		// Initialization is declaration + assignment;
		
		// String Concatenation (Using the + operator to combine different variables with a String.
		System.out.println("The number is \"" + num1 + "\"");
		
		System.out.println(String.format("The number is %s", num3));
	}

}
