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
	}

}
