import java.util.Random;
import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		// Create new objects
		Scanner scnObj = new Scanner(System.in);
		Random randObj = new Random();

		// Generate a random number between 10 and 16 (inclusive)
		int randNum = randObj.nextInt(10, 17);
		char guessCorrect = 'n';
		int userGuess;
		int numOfGuesses = 0;

		while (guessCorrect == 'n') {
			System.out.println("Guess my number! It is between 10 and 16 (inclusive).");
			userGuess = scnObj.nextInt();
			if (userGuess == randNum) {
				guessCorrect = 'y';
			}
			else {
				System.out.println("EHH you're wrong. Guess again!");
			}
		}
		System.out.println("Congrats! You guessed my number!");
	}
}
