// Import Scanner class
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// Create new Scanner object from Scanner class
		Scanner scanObj = new Scanner(System.in);

		System.out.println("Hello World.");
		System.out.println("My name is Zach.\n");
		System.out.println("What is your name?");

		String newName = scanObj.nextLine();
		sayName(newName);

		scanObj.close();
	}
	
	public static void sayName(String name) {
		System.out.println("Hello, " + name + "."); 
		System.out.println("Hello!");
	}
}