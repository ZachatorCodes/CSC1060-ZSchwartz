
public class StringKnowledge {

	public static void main(String[] args) {
		// Run howManyCat method tests
		runHowManyCatTests();
		
		// Run endOther method tests
		runEndOtherTests();
	}

	public static int howManyCat(String str) {
		// Create method variables
		int catCount = 0;
		String lowercaseStr = str.toLowerCase();
		
		// Capture if String is too short to contain cat
		if (lowercaseStr.length() < 3) {
			return catCount;
		}
		
		// Loop through String searching for cat
		for (int i = 0; i < lowercaseStr.length() - 2; i++) {
			// If cat is found, increase cat count by 1 and move index to the end of cat
			if (lowercaseStr.charAt(i) == 'c' && lowercaseStr.charAt(i + 1) == 'a' && lowercaseStr.charAt(i + 2) == 't') {
				catCount++;
				i += 2;
			}
		}
		// Return final cat count
		return catCount;
	}
	
	public static boolean endOther(String a, String b) {
		// Create method variables
		String lowercaseA = a.toLowerCase();
		String lowercaseB = b.toLowerCase();
		String substring;
		
		// Test to see which String is longer then compares the substring of the longer String to the shorter String
		if (lowercaseA.equals(lowercaseB)) {
			return true;
		}
		// If String a is longer than String b, create a substring from String a with the length of String b
		else if (lowercaseA.length() > lowercaseB.length()) {
			substring = lowercaseA.substring(lowercaseA.length() - lowercaseB.length());
			return substring.equals(lowercaseB);
		}
		// If String b is longer than String a, create a substring from String b with the length of String a
		else {
			substring = lowercaseB.substring(lowercaseB.length() - lowercaseA.length());
			return substring.equals(lowercaseA);
		}
	}
	
	// TEST METHODS
	
	public static void testHowManyCat(String str, int expected) {
		System.out.printf(
			"\tString: %s | Expected Result: %d | Actual Result: %d | Overall Result: %b\n",
			str, expected, howManyCat(str), expected == howManyCat(str)
		);
	}
	
	public static void testEndOther(String a, String b, boolean expected) {
		System.out.printf(
			"\tString A: %s | String B: %s | Expected Result: %b | Actual Result: %b | Overall Result: %b\n",
			a, b, expected, endOther(a, b), expected == endOther(a, b)
		);
	}
	
	public static void runHowManyCatTests() {
		System.out.println("howManyCat Tests:");
		testHowManyCat("abc cat ho", 1);
		testHowManyCat("catABC cat", 2);
		testHowManyCat("catcat", 2);
		testHowManyCat("dogdog", 0);
		testHowManyCat("ca", 0);
		testHowManyCat("cat CAT cat", 3);
		testHowManyCat("cacat", 1);
		testHowManyCat("cat ca", 1);
		System.out.println();
	}
	
	public static void runEndOtherTests() {
		System.out.println("endOther Tests:");
		testEndOther("Hiabc", "abc", true);
		testEndOther("AbC", "HiaBc", true);
		testEndOther("abc", "abXabc", true);
		testEndOther("ABC", "abc", true);
		testEndOther("ABCDEF", "XYZ", false);
		testEndOther("abc", "AHCHAE", false);
		System.out.println();
	}
}
