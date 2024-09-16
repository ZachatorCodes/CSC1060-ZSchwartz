import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// Create Scanner Object
		Scanner scnObj = new Scanner(System.in);

		// Prompt user for a starting number and store it
		System.out.println("Pick a number between 1 and 10 (inclusive):");
		int userChoice = scnObj.nextInt();

		// Capture error if user choice is not between 1 and 10
		while (userChoice < 0 || userChoice > 10) {
			System.out.println("Make sure your number is between 1 and 10!");
			System.out.println("Please select a different number between 1 and 10 (inclusive):");
			userChoice = scnObj.nextInt();
		}

		// Initialize the number of guesses at 1
		int numOfGuesses = 0;
		// Initialize the first random guess
		int randomNum = (int) (Math.random() * 10) + 1;
		// Set starting condition so that the loop runs
		char yesOrNo = 'n';

		while (yesOrNo == 'n') {
			numOfGuesses++;
			randomNum = (int) (Math.random() * 10) + 1;
			System.out.printf("My guess is %d. Is that correct? Please respond with yes or no.\n", randomNum);
			yesOrNo = scnObj.next().toLowerCase().charAt(0);
			if (yesOrNo == 'n') {
				System.out.println("Dang I'll get it next time!");
			}
		}

		System.out.printf("It took me %d guesses to guess your number!", numOfGuesses);

	}

}
