package cards;

public enum Suit {
	SPADES 		("Spades"),
	CLUBS		("Clubs"),
	DIAMONDS	("Diamonds"),
	HEARTS		("Hearts");
	
	private final String name;
	
	Suit(String str) {
		name = str;
	}
	
	public final String getName() { return name; }
}
