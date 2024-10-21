import java.util.Arrays;

public class Deck {
	private Card[] cards;
	
	public Deck() {
		this.cards = new Card[52];
		int cardIndex = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i < 14; i++) {
				cards[cardIndex] = new Card(i, j);
				cardIndex++;
			}
		}
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		// Option 1 (Use StringBuilder):
		StringBuilder strObj = new StringBuilder();
		for (int i = 0; i < cards.length; i++) {
			if (i == 0) {
				strObj.append(cards[i]);
			}
			else {
				strObj.append(", ").append(cards[i]);
			}
		}
		return strObj.toString();
		
//		Option 2 (Use generated toString method):
//		return "Deck [cards=" + Arrays.toString(cards) + "]";
		
//		Option 3 (Use for loop and string concatenation:
//		String str = "";
//		for (int i = 0; i < cards.length; i++) {
//			if (i == 0) {
//				str = str + cards[i].toString();
//			}
//			else {				
//				str = str + ", " + cards[i].toString();
//			}
//		}
//		return str;
	}
}
