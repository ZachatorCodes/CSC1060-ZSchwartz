// Import used for testing
import java.util.Arrays;

public class ArrayKnowledge {

	public static void main(String[] args) {
		// Run hasXX method tests
		runHasXXTests();
		
		// Run fromToArray method tests
		runFromToArrayTests();
	}
	
	public static boolean hasxx(char[] characters) {
		// Loop through the characters in an array and if a character is an x, return true if the character after is also an x
		for (int i = 0; i < characters.length - 1; i++) {
			if (characters[i] == 'x' && characters[i + 1] == 'x') {
				return true;
			}
		}
		// If no xx are found, return false
		return false;
	}
	
	public static int[] fromToArray(int start, int end) {
		// Create method variables
		int length = end - start;
		
		// Create a new array with the length of the difference between the end and the start
		int[] arr = new int[length];
		
		// Loop through the array and store numbers not including the end number
		for (int i = 0; i < length; i++) {
			arr[i] = i + start;
		}
		
		// Return array
		return arr;
	}
	
	// TEST METHODS
	
	public static void testHasXX(char[] characters, boolean expected) {
		System.out.printf(
			"\tArray: %s | Expected Result: %b | Actual Result: %b | Overall Result: %b\n",
			Arrays.toString(characters), expected, hasxx(characters), expected == hasxx(characters)
		);
	}
	
	public static void testFromToArray(int start, int end, int[] expected) {
		System.out.printf(
			"\tStart Value: %d | End Value: %d | Expected Result: %s| Actual Result: %s | Overall Result: %b\n",
			start, end, Arrays.toString(expected), Arrays.toString(fromToArray(start, end)), Arrays.equals(expected, fromToArray(start, end))
		);
	}
	
	public static void runHasXXTests() {
		System.out.println("hasXX Tests:");
		testHasXX(new char[] {'a', 'b', 'c'}, false);
		testHasXX(new char[] {'a', 'x', 'c'}, false);
		testHasXX(new char[] {'a', 'x', 'x'}, true);
		testHasXX(new char[] {'b', 'x', 'c', 'x'}, false);
		testHasXX(new char[] {'a', 'x', 'x', 'y'}, true);
		testHasXX(new char[] {'x', 'c', 'x'}, false);
		testHasXX(new char[] {'a', 'b', 'x'}, false);
		System.out.println();
	}
	
	public static void runFromToArrayTests() {
		System.out.println("fromToArray Tests:");
		testFromToArray(5, 10, new int[] {5, 6, 7, 8, 9});
		testFromToArray(11, 18, new int[] {11, 12, 13, 14, 15, 16, 17});
		testFromToArray(1, 3, new int[] {1, 2});
		testFromToArray(1, 1, new int[] {});
		System.out.println();
	}

}
