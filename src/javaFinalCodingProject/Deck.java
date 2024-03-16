package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	String[] suits = {"Hearts" , "Diamonds", "Spades", "Clubs"};
	
	String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven",
			 "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
	public Deck() {
		for (String suit : suits) {
			for (int i=0; i<13; i++) {
				cards.add(new Card(names[i], suit, i+2));
			}
		}
		System.out.println("New deck of 52 cards...");
	}
	
	public int size() {
		return cards.size()
;	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	
	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println("The cards have been shuffled...");
	}
	
	
	public Card draw() {
		return cards.remove(0);		
	}
	
}

