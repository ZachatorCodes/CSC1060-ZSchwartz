import java.util.Random;

public class Deck {
	private Card[] cards;
	private Random randObj = new Random();
	
	public Deck() {
		this.cards = new Card[52];
		int cardIndex = 0;
		
		for (int j = 0; j <= 3; j++) {
			for (int i = 1; i <= 13; i++) {
				cards[cardIndex] = new Card(i, j);
				cardIndex++;
			}
		}
	}
	
	public Deck(int numCards) {
		this.cards = new Card[numCards];
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	public void shuffle() {
		Card placeholder;
		
		for (int i = 0; i < cards.length; i++) {
			int randomIndex = randObj.nextInt(cards.length);
			placeholder = cards[i];
			cards[i] = cards[randomIndex];
			cards[randomIndex] = placeholder;
		}
	}
	
	public Deck subdeck(int start, int end) {
		Deck subDeck = new Deck(end - start + 1);
		int j = 0;
		for (int i = start; i <= end; i++) {
			subDeck.cards[j] = this.cards[i];
			j++;
		}
		return subDeck;
	}
	
	public void selectionSort() {
		// Selection Sort with Min Index
//		int n = cards.length;
//		for (int i = 0; i < n - 1; i++ ) {
//			int minIndex = i;
//			for (int j = i + 1; j < n; j++) {
//				if (cards[j].compareTo(cards[minIndex]) < 0) {
//					minIndex = j;
//				}
//			}
//			Card temp = cards[i];
//			cards[i] = cards[minIndex];
//			cards[minIndex] = temp;
//		}
		
		// Selection Sort with Max Index
		int n = cards.length;
		for (int i = 0; i < n - 1; i++) {
			int maxIndex = 0;
			for (int j = 1; j < n - i; j++) {
				if (cards[j].compareTo(cards[maxIndex]) > 0) {
					maxIndex = j;
				}
			}
			Card temp = cards[n - i - 1];
			cards[n - i - 1] = cards[maxIndex];
			cards[maxIndex] = temp;
			
		}
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
