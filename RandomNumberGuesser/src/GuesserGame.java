import java.util.Random;
import java.util.Scanner;

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomObj = new Random();
		int randomNum = randomObj.nextInt(0, 10);
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Welcome to the guessing game! What is your guess?");
		game(randomNum, scannerObj);
	}
	
	public static void game(int randomNum, Scanner scannerObj) {
		int guess = scannerObj.nextInt();
		while (guess != randomNum) {
			System.out.println("Ooh good try, but that's not it! Try again");
		}
	}

}
