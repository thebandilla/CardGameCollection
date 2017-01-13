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
		return denom.toString() + " of " + suit.toString();
	}
	
	
}
