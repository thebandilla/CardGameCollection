package tests;

import java.util.Iterator;
import java.util.Stack;

import cards.Card;
import cards.Deck;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		for (Card c : deck){
			System.out.println(c);
		}
		System.out.println("hi");
	}
}