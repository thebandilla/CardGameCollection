package tests;

import java.util.Iterator;
import java.util.Stack;

import cards.Card;
import cards.Deck;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		// get the iterator
		Iterator<Card> iter = deck.iterator();
		
		while (iter.hasNext()) {
			//calls the tostring method for each element in the iterator
			System.out.println(iter.next());
		}
		
		deck.shuffle();
		
		iter = deck.iterator();
		
		System.out.println();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		deck.shuffle();
		
		iter = deck.iterator();
		
		System.out.println();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("hi");
	}
}