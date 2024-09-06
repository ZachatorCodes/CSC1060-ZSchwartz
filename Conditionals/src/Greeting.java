import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String userName = scannerObj.nextLine();
		
		System.out.println("How old are you?");
		int userAge = scannerObj.nextInt();
		
		if (userAge > 18) {
			printGreeting(userName, userAge);
		}

	}
	
	public static void printGreeting(String name, int age) {
		System.out.printf("Hello %s. You are %d years old.", name, age);
	}

}
