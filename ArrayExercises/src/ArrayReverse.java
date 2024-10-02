import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("New Array Reversal: " + (Arrays.toString(reverseArray(nums))));
		System.out.println("Original Array Reversal: " + (Arrays.toString(reverseArrayInPlace(nums))));
		
	}
	
	public static int[] reverseArray(int[] arr) {
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArray[arr.length - (i + 1)] = arr[i];
		}
		return newArray;
	}
	
	public static int[] reverseArrayInPlace(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int placeholder = arr[arr.length - (1 + i)];
			arr[arr.length - (i + 1)] = arr[i];
			arr[i] = placeholder;
		}
		return arr;
	}

}
