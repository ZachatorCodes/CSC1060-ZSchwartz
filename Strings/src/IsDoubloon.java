import java.util.Scanner;

public class IsDoubloon {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);

		System.out.println("Please enter a word:");
		String userWord = scnObj.nextLine();

		boolean wordIsDoubloon = isDoubloon(userWord);

		System.out.println(wordIsDoubloon);
	}

	public static boolean isDoubloon(String str) {
		String lowercaseStr = str.toLowerCase();

		for (int i = 0; i < lowercaseStr.length(); i++) {
			char letter = lowercaseStr.charAt(i);
			int letterCount = 0;
			
			for (int j = 0; j < str.length(); j++) {
				
				if (lowercaseStr.charAt(j) == letter) {
					letterCount++;
				}
			}
			
			if (!(letterCount == 2)) {
				return false;
			}
		}
		return true;
	}
}
