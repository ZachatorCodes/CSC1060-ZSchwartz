import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		
		System.out.println("Please input a value to determine whether or not it is positive:");
		int inputValue = scnObj.nextInt();
		
		if (isPositive(inputValue)) {
			System.out.println("Value is positive.");
		}
		else {
			System.out.println("Value is not positive.");
		}
	}
	
	public static boolean isPositive(int value) {
		return value > 0;
	}

}
