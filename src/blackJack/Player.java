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
	
	ArrayList<Card> hand = new ArrayList<Card>();
	private int count = 0;
	
	public void Calculator() {
		//�������
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
		
	}
	
	public Card Status() {
		//���¸� ����ϴ� ��� 
		
		for(int i = 0; i < hand.size(); i++) {
			return hand.get(i);
		}
		
		return null;
	}
}
