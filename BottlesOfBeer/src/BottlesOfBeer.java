import java.util.Scanner;

public class BottlesOfBeer {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);

		// Prompt user for starting number of beers and store it as an int variable
		System.out.println("How many bottles of beer would you like to start with?");
		int numOfBeers = scnObj.nextInt();
		System.out.println();

		// Loop through all bottles of beer and print verse with logic based on the number of bottles
		for (int i = numOfBeers; i >= 0; i--) {
			if (i == 2) {
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", i, i);
				System.out.printf("Take one down and pass it around, %d bottle of beer on the wall.\n", i - 1);
				System.out.println();
			}
			else if (i == 1) {
				System.out.printf("%d bottle of beer on the wall, %d bottle of beer.\n", i, i);
				System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n", i - 1);
				System.out.println();
			}
			else if (i == 0) {
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", i, i);
				System.out.printf("Go to the store and buy some more, %d bottles of beer on the wall.\n", numOfBeers);
				System.out.println();
			}
			else {
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n", i, i);
				System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n", i - 1);
				System.out.println();
			}
		}
	}
}
