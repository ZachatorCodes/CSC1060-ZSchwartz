import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);

		// Create a variable to hold total sum
		double totalValue = 0;

		// Prompt user to enter their first number and store it as as a double, then add it to the total sun
		System.out.println("Please enter a number:");
		double userNum = scnObj.nextDouble();
		totalValue += userNum;

		// Check if the number entered is a zero. If it is, skip block and print results
		// Otherwise prompt the user for another number, store it, and then add it's value to the total sum
		while (userNum != 0) {
			System.out.println("Please enter another number:");
			userNum = scnObj.nextDouble();
			totalValue += userNum;
		}

		// Prints total sum
		System.out.printf("The total value of all numbers entered is %.3f.", totalValue);
	}
	
}
