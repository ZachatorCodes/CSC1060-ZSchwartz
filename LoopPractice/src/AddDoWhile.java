import java.util.Scanner;

public class AddDoWhile {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		int userNumber = 0;
		int totalNum = 0;
		do {
			System.out.println("Please enter another number:");
			userNumber = scnObj.nextInt();
			totalNum += userNumber;
		} while (userNumber != 0);
		System.out.println("The total of all numbers entered is " + totalNum);
	}

}
