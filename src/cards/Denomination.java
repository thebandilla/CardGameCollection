package cards;

public enum Denomination {
	ACE		("Ace"),
	TWO		("Two"),
	THREE	("Three"),
	FOUR	("Four"),
	FIVE	("Five"),
	SIX		("Six"),
	SEVEN	("Seven"),
	EIGHT	("Eight"),
	NINE	("Nine"),
	TEN		("Ten"),
	JACK	("Jack"),
	QUEEN	("Queen"),
	KING	("King");
	
	private final String name;
	Denomination (String str) {
		name = str;
	}
	
	public final String getName() { return name; }
}
