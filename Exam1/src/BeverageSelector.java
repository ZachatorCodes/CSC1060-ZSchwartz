import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);

		// Prompt user to make a beverage selection based on the integer value of each option
		System.out.println("Please select a beverage:\nWater (1), Coke (2), or Coffee (3)");
		int userSelection = scnObj.nextInt();
		
		// Prompt user to make a different selection if they pick something that is not offered
		while (userSelection != 1 && userSelection != 2 && userSelection != 3) {
			System.out.println("Your selection is not valid. Please make another selection:");
			userSelection = scnObj.nextInt();
		}
		
		// Display results (beverage)
		if (userSelection == 1) {
			System.out.println("You selected water.");
		}
		else if (userSelection == 2) {
			System.out.println("You selected Coke.");
		}
		else {
			System.out.println("You selected coffee.");
		}
	}
}
