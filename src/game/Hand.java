package game;

import java.util.ArrayList;
import java.util.List;

import cards.Card;

public class Hand {
	
	private List<Card> cards;
	private int size;
	
	public Hand (Card card) {
		this.cards = new ArrayList<Card>(1);
		this.cards.add(card);
		size = 1;
	}
	
	public Hand (List<Card> cards) {
		this.cards = cards;
		size = cards.size();
	}
}
