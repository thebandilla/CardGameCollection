package tests;

import java.util.Iterator;
import java.util.Stack;

import cards.Card;
import cards.Deck;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Iterator<Card> iter = deck.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("hi");
	}
}