package data;

public class Card {

	Suit suit;
	Value value;
	String name;
	
	public Card(Suit suit, Value value, String name) {
		super();
		this.suit = suit;
		this.value = value;
		this.name = name;
	}
	
	
	public Suit getSuit() {
		return suit;
	}
	public Value getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
