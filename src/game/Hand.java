package game;

import java.util.ArrayList;
import java.util.List;

import cards.Card;

public class Hand {
	
	private List<Card> cards;
	private int size;
	
	public Hand() {
		this.cards = new ArrayList<Card>();
		this.size = 0;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void addCard(List<Card> cards) {
		this.cards.addAll(cards);
	}
	
	public void printHand() {
		for(Card c : cards)
			System.out.println(c);
	}
}
