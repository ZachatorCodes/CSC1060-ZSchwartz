import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(reverseArray(nums)));
		
	}
	
	public static int[] reverseArray(int[] arr) {
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArray[arr.length - (i + 1)] = arr[i];
		}
		return newArray;
	}

}
