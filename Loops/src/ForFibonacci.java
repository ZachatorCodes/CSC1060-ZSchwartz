import java.util.Scanner;

public class ForFibonacci {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);
		
		// Prompt user for number of terms and store value
		System.out.println("How many terms of the Fibonacci Sequence would you like to see?");
		int numOfTerms = scnObj.nextInt();
		
		// Create variables to store starting numbers
		int a = 0;
		int b = 1;
		
		// Loop the number of times the user provided
		for (int i = 0; i < numOfTerms; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}
}