import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		// Basic 1D Array Initialization
		int[] arr = new int[10];
		int[] arr2 = {1, 2, 3, 4};
		
		// Basic 2D Array Initialization
		int[][] arr3 = new int[2][4];
		
		int[][] arr4 = new int[2][5];
		
//		System.out.println(Arrays.deepToString(arr4));
		
//		for (int[] array: arr4) {
//			System.out.println(Arrays.toString(array));
//		}
		
		int[] nums = {1, 5, 6, 2, 6, 8};
		
//		for (int e: nums) {
//			System.out.println(e);
//		}
		
		int[][] my2Dim = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
//		print2DArray(arr4);
//		print2DArray(multiplicationTable10(20));
		
		int[][] matrix = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
		print2DArray(transposeArray(matrix));
	}	
	
	
	public static void print2DArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-5d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] multiplicationTable10(int size) {
		int[][] array = new int[size][size];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i + 1) * (j + 1);
			}
		}
		
		return array;
	}
	
	public static int[][] transposeArray(int[][] matrix) {
		int[][] arr = new int[matrix[0].length][matrix.length];
		
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				arr[i][j] = matrix[j][i];
			}
		}
		
		return arr;
	}
}
