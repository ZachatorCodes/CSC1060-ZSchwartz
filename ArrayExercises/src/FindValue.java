
public class FindValue {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int value = 7;
		System.out.println(findValue(nums, value));
	}

	public static boolean findValue(int[] arr, int searchValue) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchValue) {
				return true;
			}
		}
		return false;
	}

}
