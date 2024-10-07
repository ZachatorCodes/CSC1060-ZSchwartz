import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		int nums[] = new int[100];
		
		System.out.println("Enter a number to add to the array. Enter -1 to cancel:");
		int userNum = scnObj.nextInt();
		int incrementor = 0;
		
		while (userNum != -1) {
			nums[incrementor] = userNum;
			incrementor++;
			System.out.println("Enter another number. Enter -1 to finish:");
			userNum = scnObj.nextInt();
		}
		
		int filteredNums[] = Arrays.copyOf(nums, incrementor);
		
		System.out.println("Your values reversed are:");
		for (int i = filteredNums.length - 1; i >= 0; i--) {
			System.out.print(filteredNums[i] + " ");
		}
		
//		Code To Reverse Array And Then Print It
		
//		for (int i = 0; i < filteredNums.length / 2; i++) {
//			int placeholder = filteredNums[i];
//			filteredNums[i] = filteredNums[filteredNums.length - i - 1];
//			filteredNums[filteredNums.length - i - 1] = placeholder;
//		}
//		
//		for (int value: filteredNums) {
//			System.out.print(value + " ");
//		}
	}

}
