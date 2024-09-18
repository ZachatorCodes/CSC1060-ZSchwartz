import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);

		// Prompt user for starting number and store variable
		System.out.println("What number would you like to find the factorial of?");
		int num = scnObj.nextInt();

		// Set total number to one (not 0 because of multiplication)
		int productNum = 1;

		// Return 1 if starting number is 0.
		if (num == 0) {
			System.out.println("The factorial of 0 is 1.");
		}
		// If number is not zero, calculate the factorial and then print the result
		else {
			// Counting down version
			for (int i = num; i >= 1; i--) {
				productNum *= i;
			}
			
//			Counting up version
//			for (int i = 1; i <= num; i++) {
//				productNum *= i;
//			}
			
			System.out.printf("The factorial of %d is %d.", num, productNum);
		}
	}
}
