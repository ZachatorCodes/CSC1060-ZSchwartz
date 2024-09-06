import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Please enter a number and I'll tell you if it's even, odd, or zero!");
		int num = scannerObj.nextInt();
		
		if (num == 0) {
			System.out.println("Your number is 0 exactly.");
		} else if (num % 2 == 0) {
			System.out.println("Your number is even.");
		} else {
			System.out.println("Your number is odd.");
		}
	}

}
