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
	}

}
