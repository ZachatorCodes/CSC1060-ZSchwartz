
public class Array {

	public static void main(String[] args) {
		int num;
		
		// Not created in memory
		int[] numbers;
		
		// Created in memory with 5 placeholder 0s
		numbers = new int[5];
		
		// Assign value to certain index of array
		numbers[0] = 3;
		numbers[1] = 7;
		numbers[2] = 8;
		numbers[3] = 2;
		numbers[4] = 9;
		
		String[] greetings = {"Hi", "Hello", "What's Up"};
		
		double[] values = {2.52, 4.79, 1.68};
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] *= 2;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
