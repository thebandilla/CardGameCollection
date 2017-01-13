package cards;

public class Card {
	
	private final Suit suit;
	private final Denomination denom;
	
	public Card (Suit suit, Denomination denom) {
		this.suit = suit;
		this.denom = denom;
	}
	
	@Override
	public String toString() {
		//returns the string derived by the denomination and suit of this card
		//eg. if suit == hearts and denom == three
		//this method would return the string representation of the denomination concatenated with the suit
		// "THREE of HEARTS"
		return denom.toString() + " of " + suit.toString();
	}
	
	
}
