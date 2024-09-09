import java.util.Scanner;

public class LogicOperations {

	public static void main(String[] args) {

		// Create Scanner Object
		Scanner scnObj = new Scanner(System.in);

		// Prompt user for input and store as an int
		System.out.println("Please enter an integer value into the computer:");
		int inputValue = scnObj.nextInt();

		// Run only if user input is greater than 10
		if (inputValue > 10) {
			System.out.println("Greater Than 10");
		}

		// Run only if user input is greater than 10 AND less than or equal to 20
		if (inputValue > 10 && inputValue <= 20) {
			System.out.println("Greater Than 10 AND Less Than Or Equal To 20");
		}

		// If input is greater than 30 AND less than 50 OR less than -1 AND greater than
		// -6
		if ((inputValue > 30 && inputValue < 50) || (inputValue < -1 && inputValue > -6)) {
			System.out.println("In Range");
		} else {
			System.out.println("Out Of Range");
		}
	}

}
