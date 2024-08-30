import java.util.Scanner;

public class MultTableExtreme {

	public static void main(String[] args) {
		// Create new Scanner object
		Scanner scannerObj = new Scanner(System.in);
		
		// Capture starting value
		System.out.println("What is your starting number?");
		int startingNum = scannerObj.nextInt();
		
		// Print a list of starting values
		for (int i = 0; i <= startingNum; i++) {
			if (i == 0) {
				System.out.printf("X   ");
			}
			else {
				System.out.printf("%s   ", i);				
			}
		}
		System.out.println();
		
		// Loop through every number
		for (int i = 1; i <= startingNum; i++) {
			System.out.printf("%s  ", i);
			// For every number, multiply up until starting number
			for (int j = 1; j <= startingNum; j++) {
				System.out.printf("%s   ", i * j);
			}
			// Create a new line
			System.out.println();
		}
	}

}
