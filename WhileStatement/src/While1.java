import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnObj = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = scnObj.nextLine();

		System.out.println("What is your age?");
		int age = scnObj.nextInt();

		while (age < 0) {
			System.out.println("Sorry! Your age cannot be negative.");
			System.out.println("What is your age?");
			age = scnObj.nextInt();
		}
		
	}
	
}
