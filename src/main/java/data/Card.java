package data;

public class Card {

	Suit suit;
	Value value;
	String name;
	
	
	public Card(){
		
	}
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


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Card [suit=");
		builder.append(suit);
		builder.append(", value=");
		builder.append(value);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
