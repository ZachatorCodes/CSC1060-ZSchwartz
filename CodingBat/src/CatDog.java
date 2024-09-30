
public class CatDog {

	public static void main(String[] args) {
		System.out.println(catDog("catdog"));
	}

	public static boolean catDog(String str) {
		int dogCount = 0;
		int catCount = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			String testString = str.substring(i, i + 3);
			System.out.println(testString);
			if (testString.equals("dog")) {
				dogCount += 1;
			}
			if (testString.equals("cat")) {
				catCount += 1;
			}
		}
		return dogCount == catCount;
	}

}
