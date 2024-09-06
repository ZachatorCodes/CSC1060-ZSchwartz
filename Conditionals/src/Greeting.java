import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String userName = scannerObj.nextLine();
		
		System.out.println("How old are you?");
		int userAge = scannerObj.nextInt();
		
		if (userAge > 18) {
			System.out.printf("Hello %s. You are %d years old.", userName, userAge);
		}

	}

}
