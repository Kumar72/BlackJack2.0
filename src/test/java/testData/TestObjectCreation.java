package testData;

import static org.junit.Assert.*;

import org.junit.*;

import data.Card;
import data.Dealer;
import data.Deck;
import data.Game;
import data.Player;

public class TestObjectCreation {

	Card card;
	Deck deck;
	Dealer dealer;
	Player player;
	Game game;
	
	@Before
	public void setup() {
		card = new Card();
		deck = new Deck();
		dealer = new Dealer();
		player = new Player();
		game = new Game();
	}
	
	@After
	public void teardown() {
		
	}
	
	@Test
	public void test_InstanceOfCard() {
		assertNotNull(card);
		assertNotNull(deck);
		assertNotNull(dealer);
		assertNotNull(player);
		assertNotNull(game);
	}

}
