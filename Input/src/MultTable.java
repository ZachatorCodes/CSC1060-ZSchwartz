import java.util.Scanner;

public class MultTable {

	public static void main(String[] args) {
		// Create scanner object
		Scanner scannerObj = new Scanner(System.in);
		
		// Store initial number as variable
		System.out.println("What number would you like to build a multiplication table for?");
		int num = scannerObj.nextInt();
		
		// Store all multiplied values as a value in an array
		int[] multipliedNums = {num * 1, num * 2, num * 3, num * 4, num * 5, num * 6, num * 7, num * 8, num * 9, num * 10};
		
		// Loop through array and display calculated values
		for (int i = 0; i < multipliedNums.length; i++) {
			System.out.printf("%s x %s = %s\n", num, i + 1, multipliedNums[i]);
		}
		
	}

}
