import java.util.Scanner;

public class Module {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int num = scannerObj.nextInt();

		if (num % 2 == 0) {
			System.out.println("Your number is even");
		} else if (num % 2 == 1) {
			System.out.println("Your number is odd");
		}
	}
}
