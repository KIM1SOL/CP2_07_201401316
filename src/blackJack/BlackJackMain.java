package blackJack;

import java.util.Scanner;

public class BlackJackMain {
	/*
	 * ������ �÷��̾�� 2�徿 ī�带 ���� ���´�.
	 * �÷��̾�� ������ �и� ��� ����, ������ 1�常 ����
	 * �÷��̾�� hit�� ���� 21�� ���� �ʴ� �� �󸶵� ���ϴ� ī�带 ���� ���ִ�.
	 * �� 21�� ������ bust�� �й�
	 * ������ ������ 16������ ��� �ݵ�� 1�� �߰�, 17�̻��� ��� ī�� �߰� �Ұ���
	 * ( ** ���������� 16�̻��� �ɶ����� ī�带 �޴´�. )
	 * �÷��̾ stand�� �ϸ� �÷��̾�� ������ �и� ��, 21�� ����� ����� �¸�
	 *  ( ** ���������� ������ ��� ������ �¸��� ����)
	 */
	
	/*
	 * ī�� ������ �⺻������ ����
	 * ó�� ���� 2���� ���� 21�� ������ ��� �������� 1.5��
	 * 21�� �Ѵ� ��� ����Ʈ�� ������ �й�
	 * K, Q, J = 10��
	 * ACE�� 1&11 -> ������ 10 ������ ��� 11, 10 �ʰ��� ��� 1�ΰ�� 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		
		
		System.out.println("-- [ Black Jack ] --");
		System.out.println("������ �����մϴ�.");
		System.out.println("������ ī�带 �����մϴ�.");
		dealer.Shuffle_D();
		
		System.out.println("������ ī�带 �޽��ϴ�.");
		dealer.addCard(dealer.getDeck().popCard());
		dealer.addCard(dealer.getDeck().popCard());
		
		System.out.println("�÷��̾�� ī�� 2���� �ݴϴ�.");
		player.addCard(dealer.getDeck().popCard());
		player.addCard(dealer.getDeck().popCard());
		
		if(player.getCount() == 21) {
			System.out.println("BLACK JACK");
			System.out.println("�÷��̾� �¸� !!! ");
			System.exit(0);
		}
		
		while(true) {
			System.out.println("<���� ī�� ����>");
			if(dealer.getHand().size() >= 2) {
				String dealer_status = "[" + dealer.getHand().get(0).getSuit() + dealer.getHand().get(0).getRank()+ "]";
				for(int i = 1 ; i < dealer.getHand().size(); i++) {
					dealer_status += "[xxxxxx]";
				}
				System.out.println("Dealer : { " + dealer_status +" }");
			}
			else {
				System.out.println("Dealer : {"+ dealer.Status(dealer.getHand(), dealer.getStatus()) + "}");
			}
			System.out.println("Player : {"+ player.Status(player.getHand(), player.getStatus()) + "}");
			dealer.setCount(dealer.Calculator(dealer.getHand()));
			player.setCount(player.Calculator(player.getHand()));
			System.out.println("Score : " + player.getCount());
			System.out.println("");
			
			if(player.getCount() > 21) {
				System.out.println("���и� �����մϴ�!!!");
				System.out.println("���� �¸�!");
				break;
			}
			
			
			String yesOrNo = "";
			System.out.print("ī�带 �� �����ðڽ��ϱ�? (y/n)");
			Scanner scan = new Scanner(System.in);
			yesOrNo = scan.next();
			
			if(yesOrNo.equals("y")) {
				if(dealer.getCount() <= 16) {
					dealer.addCard(dealer.getDeck().popCard());
					player.addCard(dealer.getDeck().popCard());
					
				}
				else {
					player.addCard(dealer.getDeck().popCard());	
				}
			}
			
			else if(yesOrNo.equals("n")) {
				if(dealer.getCount() >= player.getCount()) {
					System.out.println("���и� �����մϴ�!!!");
					System.out.println("���� �¸�!!");
					break;
				}
				else {
					System.out.println("���и� �����մϴ�!!!");
					System.out.println("�÷��̾� �¸�!!");
					break;
				}
			}
		
		}
		
		System.out.println("<��� ī�� ����>");
		System.out.println("Dealer : {"+ dealer.Status(dealer.getHand(), dealer.getStatus()) + "}");
		System.out.println("Player : {"+ player.Status(player.getHand(), player.getStatus()) + "}");
		System.out.println("Score : " + player.getCount());
		
	}
}
