package cards;

import java.util.Iterator;
import java.util.Stack;

public class Deck implements Iterable<Card>{

	private Stack<Card> cards;
	private int numCards;
	
	private final int MAX_DECK_SIZE = 52;
	private final int MIN_DECK_SIZE = 0;
	
	public Deck() {
		initDeck();
	}
	
	private void initDeck() {
		cards = new Stack<Card>();
		// upon creation the deck always put cards in their generic unshuffled order
		for (Suit s : Suit.values()) {
			for (Denomination d : Denomination.values()) {
				cards.push(new Card(s, d));
			}
		}
		
		numCards = 52;
	}
	
	public void shuffle() {
		
	}
	
	public void resetDeck() {
		initDeck();
	}

	@Override
	public Iterator<Card> iterator() {
		return cards.iterator();
	}
	
	public Stack<Card> getCards() {
		return cards;
	}
}
