import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		// Create new Scanner object
		Scanner scnObj = new Scanner(System.in);
		
		// Create a boolean to hold loop value;
		boolean loop = true;
		
		// Loop the entire program while loop is true
		while (loop) {
			// Prompt user to enter triangle size and store number
			System.out.println("Enter triangle size:");
			int userNumber = scnObj.nextInt();
			
			// Loop if user number is out of range to select another number
			while (userNumber < 1 || userNumber > 50) {
				System.out.println("Error: number must be in range [1, 50]. Please try again:");
				userNumber = scnObj.nextInt();
			}
			
			// Prompt user to enter a character and store as char variable
			System.out.println("Enter triangle character:");
			char userCharacter = scnObj.next().charAt(0);
			
			// Call print triangle method to print the triangle
			printTriangles(userNumber, userCharacter);
			
			// Prompt user if they want to print another triangle
			System.out.println("Do you want to print another triangle? (Yes / No)");
			char loopResponse = scnObj.next().toLowerCase().charAt(0);
			
			// Update loop boolean value based on user response
			if (loopResponse == 'n') {
				loop = false;
			}
		}
	}
	
	public static void printTriangles(int userNum, char userChar) {
		// Create a for loop to create a new row up to the number the user provided
		for (int rows = 1; rows <= userNum; rows++) {
			// Adds spaces to the front of the character equal to the user provided number
			// minus the number of characters
			for (int spaces = (userNum - rows); spaces > 0; spaces--) {
				System.out.print(" ");
			}
			// Print a character followed by a space equal to the row number
			for (int chars = rows; chars > 0; chars--) {
				System.out.print(userChar + " ");
			}
			// Print a new line to get ready for the next loop
			System.out.println();
		}
	}
}
