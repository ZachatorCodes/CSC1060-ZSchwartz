
public class Tile {
	private char letter;
	private int value;

	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Tile Letter: %s | Tile Value: %s\n", letter, value);
	}

	public boolean equals(Tile tile) {
		return this.letter == tile.getLetter();
	}
}
