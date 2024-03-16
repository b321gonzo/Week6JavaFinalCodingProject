package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand;
	int score;
	String name;
	
	Player (String name) {
		this.name = name;
		score = 0;
		hand = new ArrayList<Card>();
	}
	
	
	public void describe() {
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);		
	}
	
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		score ++;
	}
	
}
