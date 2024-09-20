import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);
		
		// Prompt user for first number and store value
		System.out.println("Please enter your first integer number:");
		int userNum1 = scnObj.nextInt();
		
		// Prompt user for second number and store value
		System.out.println("Please enter your second integer number:");
		int userNum2 = scnObj.nextInt();
		
		// Call method and store boolean response
		boolean addsTo10 = makes10(userNum1, userNum2);
		
		// Check conditional if the numbers add to 10 and print results
		if (addsTo10) {
			System.out.println("The sum of your two numbers is 10.");
		}
		else {
			System.out.println("The sum of your tow numbers is NOT 10.");
		}
	}
	
	// Method to check if two integers add up to make 10
	// Returns a boolean true or false value
	public static boolean makes10(int numA, int numB) {
		return (numA + numB == 10);
	}
}
