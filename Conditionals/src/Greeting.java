import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String userName = scannerObj.nextLine();
		
		System.out.println("How old are you?");
		int userAge = scannerObj.nextInt();
		
		printGreeting(userName, userAge);
	}
	
	public static void printGreeting(String name, int age) {
		if (age > 18) {
			System.out.printf("Hello %s. You are %d years old.", name, age);
		}
	}
}
