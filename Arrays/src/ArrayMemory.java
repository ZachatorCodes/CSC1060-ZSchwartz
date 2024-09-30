import java.util.Scanner;

public class ArrayMemory {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);

		System.out.println("How many numbers do you want to store?");
		int numOfNums = scnObj.nextInt();

		int[] numsArr = new int[numOfNums];

		for (int i = 0; i < numsArr.length; i++) {
			System.out.println("What number do you want to store in spot " + (i + 1) + "?");
			numsArr[i] = scnObj.nextInt();
		}

		for (int i = 0; i < numsArr.length; i++) {
			System.out.print(numsArr[i] + " ");
		}

	}

}
