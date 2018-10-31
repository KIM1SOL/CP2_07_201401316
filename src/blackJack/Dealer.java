package blackJack;

import java.util.ArrayList;

public class Dealer extends Player{

	private ArrayList<Card> hand_D = new ArrayList<Card>();
	private CardDeck NewDeck = new CardDeck();
	private int count_D = 0;
	private String status_D = "";
	
	public void Shuffle_D() {
		NewDeck.shuffle();
	}
	
	public CardDeck getDeck() {
		return NewDeck;
	}
	
	public void addCard(Card card) {
		hand_D.add(card);
	}
	
	public ArrayList<Card> getHand(){
		return hand_D;
	}
	
	
	public int getCount() {
		return count_D;
	}
	public void setCount(int count) {
		count_D = count;
	}
	public String getStatus() {
		return status_D;
	}


}
