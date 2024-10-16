
public class Scrabble {

	public static void main(String[] args) {
		Tile newTile = new Tile('Z', 10);
		Tile tile2 = new Tile('Y', 10);
		System.out.println(newTile.equals(tile2));
		printTile(newTile);
	}

	public static void printTile(Tile tile) {
		System.out.println(tile.toString());
	}

}
