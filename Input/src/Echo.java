import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String userName = scannerObj.nextLine();
		System.out.printf("Your name is %s.\n", userName);
		
		System.out.println("How old are you?");
		int userAge = scannerObj.nextInt();
		System.out.printf("You are %s years old.\n", userAge);
		
		System.out.println("What is the temperature today?");
		double dayTemp = scannerObj.nextDouble();
		System.out.printf("The temperature today is %s degrees.\n", dayTemp);
		
		// Whenever your Scanner doesn't stop for your input, make sure that the Scanner is not getting stuck on a next line.
		// If you are looking for the next line after an int or double it will hit the enter after the int value.
		
		scannerObj.nextLine();
		
		System.out.println("Say something nice.");
		String somethingNice = scannerObj.nextLine();
		System.out.println("Thanks for that!");
	}

}
