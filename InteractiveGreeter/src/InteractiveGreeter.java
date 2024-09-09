import java.util.Scanner;

public class InteractiveGreeter {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String userName = scnObj.nextLine();
		
		System.out.println("Where are you from?");
		String userFrom = scnObj.nextLine();
		
		System.out.println("How old are you (years)?");
		int userAge = scnObj.nextInt();
		
		System.out.printf("Hello %s from %s. You are %d years old.\n", userName, userFrom, userAge);
		
		System.out.println("What's something you like to do?");
		// Clear Scanner
		scnObj.nextLine();
		String userLike = scnObj.nextLine();
		
		System.out.printf("Have fun next time you %s!\n", userLike);
		
		System.out.println("How much would you like to donate today?");
		double userDonation = scnObj.nextDouble();
		
		System.out.printf("You will donate $%.2f today. Yay!\n", userDonation);
	}

}
