import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);
		
		// Prompt user for first number and store it as a double
		System.out.println("Please enter your first number:");
		double num1 = scnObj.nextDouble();
		
		// Prompt user for second number and store it as a double
		System.out.println("Please enter your second number:");
		double num2 = scnObj.nextDouble();
		
		// Loop on asking user for a different number if the denominator is 0
		while (num2 == 0) {
			System.out.println("Your second number cannot be zero. Please enter a different number:");
			num2 = scnObj.nextDouble();
		}
		
		// Store quotient as a double variable
		double quotient = num1 / num2;
		
		// Print results down to two decimal points using printf
		System.out.printf("The answer is %.2f when you divide %.2f by %.2f.", quotient, num1, num2);
	}

}
