package cards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
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
		
		List<Stack<Card>> temp = new ArrayList<Stack<Card>>(10);
		
		for (int i = 0; i < 10; i++)
			temp.add(i, new Stack<Card>());
		
		while (!cards.isEmpty()) {
			Random rand = new Random();
			int distributor = rand.nextInt();
			temp.get(Math.abs(distributor % 10)).push(cards.pop());
		}
		
		for (Stack<Card> s : temp) {
			while (!s.isEmpty()) {
				cards.push(s.pop());
			}
		}
	}
	
	public Card draw() throws DeckEmptyException {
		if (numCards == 0)
			throw new DeckEmptyException();
		else {
			numCards--;
			return cards.pop();
		}
	}
	
	public void resetDeck() {
		initDeck();
	}

	public Iterator<Card> iterator() {
		return cards.iterator();
	}
	
	public Stack<Card> getCards() {
		return cards;
	}
}
