package blackJack;

import java.util.ArrayList;

public class Dealer extends Player{
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
	
}
