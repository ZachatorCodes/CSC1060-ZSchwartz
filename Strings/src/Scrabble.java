import java.util.Scanner;

public class Scrabble {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);

		System.out.println("Please enter all of your tiles:");
		String userTiles = scnObj.nextLine();

		System.out.println("Please enter your word:");
		String userWord = scnObj.nextLine();

		boolean canSpellResult = canSpell(userTiles, userWord);

		System.out.println();
		System.out.println(canSpellResult);
	}

	public static boolean canSpell(String tiles, String word) {
		for (int i = 0; i < word.length(); i++) {
			String letter = word.substring(i, i + 1);
			if (!tiles.contains(letter)) {
				return false;
			}
			tiles = tiles.substring(0, tiles.indexOf(letter)) + tiles.substring(tiles.indexOf(letter) + 1);
			System.out.println(tiles);
		}
		return true;
	}
}
