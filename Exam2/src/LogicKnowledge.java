
public class LogicKnowledge {

	public static void main(String[] args) {
		// Run pickNumber method tests
		runPickNumberTests();
		
		// Run equiDistance method test
		runEquiDistanceTests();
	}
	
	public static int pickNumber(int a, int b, int c) {
		// Test if all numbers are equal
		if (a == b && b == c) {
			return a;
		}
		// Test if any of the numbers are equal to each other, and then return the number that isn't
		else if (a == b || b == c || c == a) {
			// Alternate solution with ternary operator
			// return a == b ? c : a == c ? b : a;
			if (b == c) {
				return a;
			}
			else if (a == c) {
				return b;
			}
			else {
				return c;
			}
		}
		// Return sum if no other conditions are true
		else {
			return a + b + c;
		}
	}
	
	public static boolean equiDistance(int a, int b, int c) {
		// Find maximum, minimum, and middle numbers
		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		int mid = a + b + c - max - min;
		
		// Return if distance between max and mid is equal to the distance between mid and min
		return Math.abs(max - mid) == Math.abs(mid - min);
	}
	
	// TEST METHODS

	public static void testPickNumber(int a, int b, int c, int expected) {
		System.out.printf(
			"\tA: %d | B: %d | C: %d | Expected Result: %d | Actual Result: %d | Overall Result: %b\n",
			a, b, c, expected, pickNumber(a, b, c), expected == pickNumber(a, b, c)
		);
	}
	
	public static void testEquiDistance(int a, int b, int c, boolean expected) {
		System.out.printf(
			"\tA: %d | B: %d | C: %d | Expected Result: %b | Actual Result: %b | Overall Result: %b\n",
			a, b, c, expected, equiDistance(a, b, c), expected == equiDistance(a, b, c)
		);
	}
	
	public static void runPickNumberTests() {
		System.out.println("pickNumber Tests:");
		testPickNumber(1, 2, 3, 6);
		testPickNumber(2, 2, 2, 2);
		testPickNumber(1, 1, 2, 2);
		testPickNumber(3, 7, 7, 3);
		testPickNumber(3, 7, 3, 7);
		System.out.println();
	}
	
	public static void runEquiDistanceTests() {
		System.out.println("equiDistance Tests");
		testEquiDistance(2, 4, 6, true);
		testEquiDistance(4, 6, 2, true);
		testEquiDistance(4, 6, 3, false);
		testEquiDistance(5, 10, 0, true);
		testEquiDistance(19, 11, 15, true);
		System.out.println();
	}
}
