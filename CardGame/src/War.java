
public class War {

	public static void main(String[] args) {
		// Create and shuffle deck
		Deck deck = new Deck();
		System.out.println(deck);
		
		
		System.out.println();
		
		deck.shuffle();
		System.out.println(deck);
		
		System.out.println();
		
		deck.selectionSort();
	
		System.out.println(deck);

		// Create a pile for player 1
		Pile p1 = new Pile();
		p1.addDeck(deck.subdeck(0, 25));

		// Create a pile for player 2
		Pile p2 = new Pile();
		p2.addDeck(deck.subdeck(26, deck.getCards().length - 1));

		// Create a pile to play cards in
		Pile midPile = new Pile();
		Pile winP1 = new Pile();
		Pile winP2 = new Pile();

		while (!p1.isEmpty() && !p2.isEmpty()) {

			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			System.out.println("Player 1: " + c1);
			System.out.println("Player 2: " + c2);

			midPile.addCard(c1);
			midPile.addCard(c2);

			int result = c1.compareTo(c2);
			if (result > 0) {
				winP1.addPile(midPile);
				System.out.println("Player 1 Wins The Round!\n");
			}
			else if (result < 0) {
				winP2.addPile(midPile);
				System.out.println("Player 2 Wins The Round!\n");
			}
			else {
				System.out.println("No one wins. Time for another card!\n");
			}
		}
		if (winP1.size() > winP2.size()) {
			System.out.println("Player 1 Wins");
		}
		else if (winP2.size() > winP1.size()) {
			System.out.println("Player 2 Wins");
		}
		else {
			System.out.println("Tied Game");
		}
	}
}
