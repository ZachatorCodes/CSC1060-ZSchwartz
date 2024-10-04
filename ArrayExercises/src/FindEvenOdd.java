import java.util.Scanner;

public class FindEvenOdd {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		
		int numEven = 0;
		int numOdd = 0;
		
		System.out.println("How many numbers do you want to check?");
		int[] numArray = new int[scnObj.nextInt()];
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.println("Please enter value number " + (i + 1) + ":");
			numArray[i] = scnObj.nextInt();
		}
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
			if (numArray[i] % 2 == 0) {
				numEven++;
				System.out.println("Even++: " + numEven);
			}
			else {
				numOdd++;
				System.out.println("Odd++: " + numOdd);
			}
		}
		
		System.out.printf("There are %d even and %d odd numbers in the array.", numEven, numOdd);
	}
}
