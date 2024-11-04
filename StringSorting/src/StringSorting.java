import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		// Create Scanner Object
		Scanner scnObj = new Scanner(System.in);

		// Prompt user and create array
		System.out.printf("Enter the number of strings: ");
		String[] strings = new String[scnObj.nextInt()];

		// Clear Scanner
		scnObj.nextLine();

		// Loop through array and store user submitted strings
		for (int i = 0; i < strings.length; i++) {
			System.out.printf("Please enter string number %d: ", i + 1);
			strings[i] = scnObj.nextLine();
		}

		// Spacer
		System.out.println();

		// Call bubbleSort and print sorted array
		bubbleSort(strings, 1);
		System.out.println("Sorted:");
		printArray(strings);

		// Spacer
		System.out.println();

		// Call bubbleSort and print reverse sorted array
		bubbleSort(strings, 2);
		System.out.println("Reverse Sorted:");
		printArray(strings);

	}

	// Method to sort array using bubble sort algorithm
	public static void bubbleSort(String[] arr, int direction) {
		// If direction param is 1, sort using bubble sort
		if (direction == 1) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 1; j < arr.length - i; j++) {
					if (arr[j - 1].compareTo(arr[j]) > 0) {
						String temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
				}
			}

		}
		// If direction param is 2, sort in the other direction using bubble sort
		else if (direction == 2) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 1; j < arr.length - i; j++) {
					if (arr[j - 1].compareTo(arr[j]) < 0) {
						String temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
				}
			}
		}
	}

	// Method to print each array item on a new line
	public static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
