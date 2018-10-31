package blackJack;

import java.util.ArrayList;

public class Player {
	/*
	 * Dealer�� Player�� extends�� ��, �� player�� Dealer�� �θ� Ŭ����
	 * player�� ī�� �������� arrayListŸ���� hand�ʵ忡 ����
	 * Dealer�� Player�� ���� hand�ʵ�� CardDeck�ϳ��� ����
	 * ������ ����ϴ� ����� player�ȿ� �޼ҵ常 ����, Dealer�� Player�� ��� �޼ҵ带 ���
	 * hand�� ���¸� ����ϴ� ����� Dealer�� Player�� �޼ҵ带 �̿�
	 */
	
	/*
	 * ī�� ������ �⺻������ ����
	 * ó�� ���� 2���� ���� 21�� ������ ��� �������� 1.5��
	 * 21�� �Ѵ� ��� ����Ʈ�� ������ �й�
	 * K, Q, J = 10��
	 * ACE�� 1&11 -> ������ 10 ������ ��� 11, 10 �ʰ��� ��� 1�ΰ�� 
	 */
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	private int count_P = 0;
	private String status_P = "";
	
	public int Calculator(ArrayList<Card> hand) {
		//�������
		int count = 0;
		for(int i = 0; i < hand.size(); i ++) {
			
			if(hand.get(i).getRank() == "2") {
				count += 2;
			}
			if(hand.get(i).getRank() == "3") {
				count += 3;
			}
			if(hand.get(i).getRank() == "4") {
				count += 4;
			}
			if(hand.get(i).getRank() == "5") {
				count += 5;
			}
			if(hand.get(i).getRank() == "6") {
				count += 6;
			}
			if(hand.get(i).getRank() == "7") {
				count += 7;
			}
			if(hand.get(i).getRank() == "8") {
				count += 8;
			}
			if(hand.get(i).getRank() == "9") {
				count += 9;
			}
			if(hand.get(i).getRank() == "10") {
				count += 10;
			}
			if(hand.get(i).getRank() == "Q") {
				count += 10;
			}
			if(hand.get(i).getRank() == "K") {
				count += 10;
			}
			if(hand.get(i).getRank() == "J") {
				count += 10;
			}
			if(hand.get(i).getRank() == "A") {
				if(count <= 10) {
					count += 11;
				}
				else {
					count += 1;
				}
			}
		}
		
		return count;
		
	}
	
	
	
	public String Status(ArrayList<Card> hand, String status) {
		//���¸� ����ϴ� ��� 
		//String status = "";
		int temp = hand.size();
		for(int i = 0; i < temp; i++) {
			status += "[" + hand.get(i).getSuit() + hand.get(i).getRank() + "]";
		}
		
		return status;
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public int getCount() {
		return count_P;
	}
	
	public void setCount(int count) {
		count_P = count;
	}
	
	public ArrayList<Card> getHand(){
		return hand;
	}
	public String getStatus() {
		return status_P;
	}
	
}
