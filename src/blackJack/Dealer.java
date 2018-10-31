package blackJack;

import java.util.ArrayList;

public class Dealer extends Player{

	ArrayList<Card> hand_D = new ArrayList<Card>();
	CardDeck NewDeck = new CardDeck();
	
	public void Shuffle_D() {
		NewDeck.shuffle();
	}
	
	
}
