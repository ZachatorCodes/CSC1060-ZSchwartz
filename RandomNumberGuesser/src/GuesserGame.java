import java.util.Random;
import java.util.Scanner;

public class GuesserGame {

	public static void main(String[] args) {
		// Set up required objects
		Random randomObj = new Random();
		int randomNum = randomObj.nextInt(0, 100);
		Scanner scannerObj = new Scanner(System.in);
		
		// Run game
		game(randomNum, scannerObj);
	}
	
	public static void game(int randomNum, Scanner scannerObj) {
		System.out.println("Welcome to the guessing game! What is your guess?");
		int guess = scannerObj.nextInt();
		while (guess != randomNum) {
			if (guess > randomNum) {
				System.out.println("Your number is a little too high! Try again!");
				guess = scannerObj.nextInt();
			}
			else {
				System.out.println("Your number is a little too low! Try again!");
				guess = scannerObj.nextInt();
			}
		}
		System.out.println("Congrats, you got it! The number was " + randomNum + ".");
	}

}
