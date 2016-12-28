package cards;

import java.util.Stack;

public class Deck {

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
		cards.push(new Card(Suit.SPADES, Denomination.KING));
		cards.push(new Card(Suit.HEARTS, Denomination.KING));
		cards.push(new Card(Suit.CLUBS, Denomination.KING));
		cards.push(new Card(Suit.DIAMONDS, Denomination.KING));
		
		cards.push(new Card(Suit.SPADES, Denomination.QUEEN));
		cards.push(new Card(Suit.HEARTS, Denomination.QUEEN));
		cards.push(new Card(Suit.CLUBS, Denomination.QUEEN));
		cards.push(new Card(Suit.DIAMONDS, Denomination.QUEEN));
		
		cards.push(new Card(Suit.SPADES, Denomination.JACK));
		cards.push(new Card(Suit.HEARTS, Denomination.JACK));
		cards.push(new Card(Suit.CLUBS, Denomination.JACK));
		cards.push(new Card(Suit.DIAMONDS, Denomination.JACK));
		
		cards.push(new Card(Suit.SPADES, Denomination.TEN));
		cards.push(new Card(Suit.HEARTS, Denomination.TEN));
		cards.push(new Card(Suit.CLUBS, Denomination.TEN));
		cards.push(new Card(Suit.DIAMONDS, Denomination.TEN));
		
		cards.push(new Card(Suit.SPADES, Denomination.NINE));
		cards.push(new Card(Suit.HEARTS, Denomination.NINE));
		cards.push(new Card(Suit.CLUBS, Denomination.NINE));
		cards.push(new Card(Suit.DIAMONDS, Denomination.NINE));
		
		cards.push(new Card(Suit.SPADES, Denomination.EIGHT));
		cards.push(new Card(Suit.HEARTS, Denomination.EIGHT));
		cards.push(new Card(Suit.CLUBS, Denomination.EIGHT));
		cards.push(new Card(Suit.DIAMONDS, Denomination.EIGHT));
		
		cards.push(new Card(Suit.SPADES, Denomination.SEVEN));
		cards.push(new Card(Suit.HEARTS, Denomination.SEVEN));
		cards.push(new Card(Suit.CLUBS, Denomination.SEVEN));
		cards.push(new Card(Suit.DIAMONDS, Denomination.SEVEN));
		
		cards.push(new Card(Suit.SPADES, Denomination.SIX));
		cards.push(new Card(Suit.HEARTS, Denomination.SIX));
		cards.push(new Card(Suit.CLUBS, Denomination.SIX));
		cards.push(new Card(Suit.DIAMONDS, Denomination.SIX));
		
		cards.push(new Card(Suit.SPADES, Denomination.FIVE));
		cards.push(new Card(Suit.HEARTS, Denomination.FIVE));
		cards.push(new Card(Suit.CLUBS, Denomination.FIVE));
		cards.push(new Card(Suit.DIAMONDS, Denomination.FIVE));
		
		cards.push(new Card(Suit.SPADES, Denomination.FOUR));
		cards.push(new Card(Suit.HEARTS, Denomination.FOUR));
		cards.push(new Card(Suit.CLUBS, Denomination.FOUR));
		cards.push(new Card(Suit.DIAMONDS, Denomination.FOUR));
		
		cards.push(new Card(Suit.SPADES, Denomination.THREE));
		cards.push(new Card(Suit.HEARTS, Denomination.THREE));
		cards.push(new Card(Suit.CLUBS, Denomination.THREE));
		cards.push(new Card(Suit.DIAMONDS, Denomination.THREE));
		
		cards.push(new Card(Suit.SPADES, Denomination.TWO));
		cards.push(new Card(Suit.HEARTS, Denomination.TWO));
		cards.push(new Card(Suit.CLUBS, Denomination.TWO));
		cards.push(new Card(Suit.DIAMONDS, Denomination.TWO));
				
		cards.push(new Card(Suit.SPADES, Denomination.ACE));
		cards.push(new Card(Suit.HEARTS, Denomination.ACE));
		cards.push(new Card(Suit.CLUBS, Denomination.ACE));
		cards.push(new Card(Suit.DIAMONDS, Denomination.ACE));
		
		numCards = 52;
	}
	
	public void shuffle() {
		
	}
	
	public void resetDeck() {
		initDeck();
	}
}
