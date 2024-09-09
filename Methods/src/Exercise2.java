import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		
		System.out.println("Please input three integer values to determine which one is the greatest:");
		
		// Print the returned value of the greatestNumber method
		System.out.println(greatestNumber(scnObj.nextInt(), scnObj.nextInt(), scnObj.nextInt()));
	}
	
	public static int greatestNumber(int num1, int num2, int num3) {
//		int maxNum = num1;
//		if (num2 > maxNum) {
//			maxNum = num2;
//		}
//		if (num3 > maxNum) {
//			maxNum = num3;
//		}
//		return maxNum;
		return Math.max(Math.max(num1, num2), num3);
	}
}
