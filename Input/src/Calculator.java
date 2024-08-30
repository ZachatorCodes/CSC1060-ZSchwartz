import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create scanner object
		Scanner scannerObj = new Scanner(System.in);
		
		// Capture first number
		System.out.println("What is your first number?");
		double num1 = scannerObj.nextInt();
		
		// Capture second number
		System.out.println("What is your second number?");
		double num2 = scannerObj.nextInt();
		
		// Calculate all values
		double addedNums = num1 + num2;
		double subtractedNums = num1 - num2;
		double multipliedNums = num1 * num2;
		double dividedNums = num1 / num2;
		double numsRemainder = num1 % num2;
		
		// Print out all values
		System.out.printf("%s + %s = %s\n", num1, num2, addedNums);
		System.out.printf("%s - %s = %s\n", num1, num2, subtractedNums);
		System.out.printf("%s x %s = %s\n", num1, num2, multipliedNums);
		System.out.printf("%s / %s = %s\n", num1, num2, dividedNums);
		System.out.printf("%s %% %s = %s\n", num1, num2, numsRemainder);

	}

}
