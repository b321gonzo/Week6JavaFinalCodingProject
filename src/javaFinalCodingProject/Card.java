package javaFinalCodingProject;

public class Card {

	String name;
	String suit;
	int value;

	public Card() {}

	public Card(String name, String suit, int value ) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	public void describe() {
		System.out.println(description());
	}
	
	public String description() {
		return name + " of " + suit + " (" + value + ")";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	

}
