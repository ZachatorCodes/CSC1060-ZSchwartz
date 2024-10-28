import java.util.ArrayList;
import java.util.List;

public class Pile {
	private List<Card> cards;
	
	public Pile() {
		this.cards = new ArrayList<Card>();
	}
	
	public void addDeck(Deck deck) {
//		Card[] dCards = deck.getCards();
//		for (int i = 0; i < dCards.length; i++) {
//			this.cards.add(dCards[i]);
//		}
		Card[] dCards = deck.getCards();
		for (Card card: dCards) {
			this.cards.add(card);
		}
	}
	
	public Card popCard() {
		Card card = cards.remove(0);
		return card;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	public void addPile(Pile oPile) {
//		for (int i = 0; i < oPile.cards.size(); i++) {
//			cards.add(oPile.cards.remove(i));
//		}
		for (Card card: oPile.cards) {
			cards.add(card);
		}
	}
	
	public int size() {
		return cards.size();
	}

	@Override
	public String toString() {
		return "Pile [cards=" + cards + "]";
	}
}