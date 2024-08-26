import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// Prompt for number selection
		System.out.println("Please enter a number that you'd like to determine whether is even or odd:");
		
		// Take in next int as input
		int num = myScanner.nextInt();
		
		// Find mod 2
		int numRemainder = num % 2;
		
		// Determine whether even or odd
		if (numRemainder == 0) {
			System.out.println("That number is even.");
		}
		else {
			System.out.println("That number is odd.");
		}
	}
}
