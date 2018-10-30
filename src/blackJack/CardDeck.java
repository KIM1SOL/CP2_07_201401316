package blackJack;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
	ArrayList<Card> deck = new ArrayList<Card>();
	
	Card SpadeA = new Card();
	Card SpadeQ = new Card();
	Card SpadeK = new Card();
	Card SpadeJ = new Card();
	Card Spade2 = new Card();
	Card Spade3 = new Card();
	Card Spade4 = new Card();
	Card Spade5 = new Card();
	Card Spade6 = new Card();
	Card Spade7 = new Card();
	Card Spade8 = new Card();
	Card Spade9 = new Card();
	Card Spade10 = new Card();
	
	Card ClubA = new Card();
	Card ClubQ = new Card();
	Card ClubK = new Card();
	Card ClubJ = new Card();
	Card Club2 = new Card();
	Card Club3 = new Card();
	Card Club4 = new Card();
	Card Club5 = new Card();
	Card Club6 = new Card();
	Card Club7 = new Card();
	Card Club8 = new Card();
	Card Club9 = new Card();
	Card Club10 = new Card();
	
	Card HeartA = new Card();
	Card HeartQ = new Card();
	Card HeartJ = new Card();
	Card HeartK = new Card();
	Card Heart2 = new Card();
	Card Heart3 = new Card();
	Card Heart4 = new Card();
	Card Heart5 = new Card();
	Card Heart6 = new Card();
	Card Heart7 = new Card();
	Card Heart8 = new Card();
	Card Heart9 = new Card();
	Card Heart10 = new Card();
	
	Card DiamondA = new Card();
	Card DiamondQ = new Card();
	Card DiamondK = new Card();
	Card DiamondJ = new Card();
	Card Diamond2 = new Card();
	Card Diamond3 = new Card();
	Card Diamond4 = new Card();
	Card Diamond5 = new Card();
	Card Diamond6 = new Card();
	Card Diamond7 = new Card();
	Card Diamond8 = new Card();
	Card Diamond9 = new Card();
	Card Diamond10 = new Card();
	
	public CardDeck(){
		SpadeA.setRank("A");
		SpadeA.setSuit("Spade");
		SpadeQ.setRank("Q");
		SpadeQ.setSuit("Spade");
		SpadeK.setRank("K");
		SpadeK.setSuit("Spade");
		SpadeJ.setRank("J");
		SpadeJ.setSuit("Spade");
		Spade2.setRank("2");
		Spade2.setSuit("Spade");
		Spade3.setRank("3");
		Spade3.setSuit("Spade");
		Spade4.setRank("4");
		Spade4.setSuit("Spade");
		Spade5.setRank("5");
		Spade5.setSuit("Spade");
		Spade6.setRank("6");
		Spade6.setSuit("Spade");
		Spade7.setRank("7");
		Spade7.setSuit("Spade");
		Spade8.setRank("8");
		Spade8.setSuit("Spade");
		Spade9.setRank("9");
		Spade9.setSuit("Spade");
		Spade10.setRank("10");
		Spade10.setSuit("Spade");
		
		ClubA.setRank("A");
		ClubA.setSuit("Club");
		ClubQ.setRank("Q");
		ClubQ.setSuit("Club");
		ClubK.setRank("K");
		ClubK.setSuit("Club");
		ClubJ.setRank("J");
		ClubJ.setSuit("Club");
		Club2.setRank("2");
		Club2.setSuit("Club");
		Club3.setRank("3");
		Club3.setSuit("Club");
		Club4.setRank("4");
		Club4.setSuit("Club");
		Club5.setRank("5");
		Club5.setSuit("Club");
		Club6.setRank("6");
		Club6.setSuit("Club");
		Club7.setRank("7");
		Club7.setSuit("Club");
		Club8.setRank("8");
		Club8.setSuit("Club");
		Club9.setRank("9");
		Club9.setSuit("Club");
		Club10.setRank("10");
		Club10.setSuit("Club");
		
		HeartA.setRank("A");
		HeartA.setSuit("Heart");
		HeartQ.setRank("Q");
		HeartQ.setSuit("Heart");
		HeartK.setRank("K");
		HeartK.setSuit("Heart");
		HeartJ.setRank("J");
		HeartJ.setSuit("Heart");
		Heart2.setRank("2");
		Heart2.setSuit("Heart");
		Heart3.setRank("3");
		Heart3.setSuit("Heart");
		Heart4.setRank("4");
		Heart4.setSuit("Heart");
		Heart5.setRank("5");
		Heart5.setSuit("Heart");
		Heart6.setRank("6");
		Heart6.setSuit("Heart");
		Heart7.setRank("7");
		Heart7.setSuit("Heart");
		Heart8.setRank("8");
		Heart8.setSuit("Heart");
		Heart9.setRank("9");
		Heart9.setSuit("Heart");
		Heart10.setRank("10");
		Heart10.setSuit("Heart");
		
		DiamondA.setRank("A");
		DiamondA.setSuit("Diamond");
		DiamondQ.setRank("Q");
		DiamondQ.setSuit("Diamond");
		DiamondK.setRank("K");
		DiamondK.setSuit("Diamond");
		DiamondJ.setRank("J");
		DiamondJ.setSuit("Diamond");
		Diamond2.setRank("2");
		Diamond2.setSuit("Diamond");
		Diamond3.setRank("3");
		Diamond3.setSuit("Diamond");
		Diamond4.setRank("4");
		Diamond4.setSuit("Diamond");
		Diamond5.setRank("5");
		Diamond5.setSuit("Diamond");
		Diamond6.setRank("6");
		Diamond6.setSuit("Diamond");
		Diamond7.setRank("7");
		Diamond7.setSuit("Diamond");
		Diamond8.setRank("8");
		Diamond8.setSuit("Diamond");
		Diamond9.setRank("9");
		Diamond9.setSuit("Diamond");
		Diamond10.setRank("10");
		Diamond10.setSuit("Diamond");
		
		
		deck.add(SpadeA);
		deck.add(SpadeQ);
		deck.add(SpadeK);
		deck.add(SpadeJ);
		deck.add(Spade2);
		deck.add(Spade3);
		deck.add(Spade4);
		deck.add(Spade5);
		deck.add(Spade6);
		deck.add(Spade7);
		deck.add(Spade8);
		deck.add(Spade9);
		deck.add(Spade10);
		
		deck.add(ClubA);
		deck.add(ClubQ);
		deck.add(ClubK);
		deck.add(ClubJ);
		deck.add(Club2);
		deck.add(Club3);
		deck.add(Club4);
		deck.add(Club5);
		deck.add(Club6);
		deck.add(Club7);
		deck.add(Club8);
		deck.add(Club9);
		deck.add(Club10);
		
		deck.add(HeartA);
		deck.add(HeartQ);
		deck.add(HeartK);
		deck.add(HeartJ);
		deck.add(Heart2);
		deck.add(Heart3);
		deck.add(Heart4);
		deck.add(Heart5);
		deck.add(Heart6);
		deck.add(Heart7);
		deck.add(Heart8);
		deck.add(Heart9);
		deck.add(Heart10);
		
		deck.add(DiamondA);
		deck.add(DiamondQ);
		deck.add(DiamondK);
		deck.add(DiamondJ);
		deck.add(Diamond2);
		deck.add(Diamond3);
		deck.add(Diamond4);
		deck.add(Diamond5);
		deck.add(Diamond6);
		deck.add(Diamond7);
		deck.add(Diamond8);
		deck.add(Diamond9);
		deck.add(Diamond10);
		
	}
	
	

	public Card popCard() {
		Card temp = new Card();
		temp = deck.remove(0);
		return temp;
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
}
