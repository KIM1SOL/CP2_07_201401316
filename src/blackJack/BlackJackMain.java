package blackJack;

import java.util.Scanner;

public class BlackJackMain {
	/*
	 * 딜러와 플레이어는 2장씩 카드를 나눠 갖는다.
	 * 플레이어는 본인의 패를 모두 개방, 딜러는 1장만 개방
	 * 플레이어는 hit를 통해 21이 되지 않는 한 얼마든 원하는 카드를 뽑을 수있다.
	 * 단 21이 넘으면 bust로 패배
	 * 딜러는 총합이 16이하인 경우 반드시 1장 추가, 17이상인 경우 카드 추가 불가능
	 * ( ** 과제에서는 16이상이 될때까지 카드를 받는다. )
	 * 플레이어가 stand를 하면 플레이어와 딜러의 패를 비교, 21에 가까운 사람이 승리
	 *  ( ** 과제에서는 동점의 경우 딜러의 승리로 간주)
	 */
	
	/*
	 * 카드 두장은 기본적으로 지급
	 * 처음 받은 2장이 합쳐 21이 나오는 경우 블랙잭으로 1.5배
	 * 21이 넘는 경우 버스트로 무조건 패배
	 * K, Q, J = 10점
	 * ACE는 1&11 -> 총합이 10 이하인 경우 11, 10 초과인 경우 1로계산 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		
		
		System.out.println("-- [ Black Jack ] --");
		System.out.println("게임을 시작합니다.");
		System.out.println("딜러가 카드를 셔플합니다.");
		dealer.Shuffle_D();
		
		System.out.println("딜러가 카드를 받습니다.");
		dealer.addCard(dealer.getDeck().popCard());
		dealer.addCard(dealer.getDeck().popCard());
		
		System.out.println("플레이어에게 카드 2장을 줍니다.");
		player.addCard(dealer.getDeck().popCard());
		player.addCard(dealer.getDeck().popCard());
		
		if(player.getCount() == 21) {
			System.out.println("BLACK JACK");
			System.out.println("플레이어 승리 !!! ");
			System.exit(0);
		}
		
		while(true) {
			System.out.println("<현재 카드 상태>");
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
				System.out.println("승패를 결정합니다!!!");
				System.out.println("딜러 승리!");
				break;
			}
			
			
			String yesOrNo = "";
			System.out.print("카드를 더 받으시겠습니까? (y/n)");
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
					System.out.println("승패를 결정합니다!!!");
					System.out.println("딜러 승리!!");
					break;
				}
				else {
					System.out.println("승패를 결정합니다!!!");
					System.out.println("플레이어 승리!!");
					break;
				}
			}
		
		}
		
		System.out.println("<모든 카드 공개>");
		System.out.println("Dealer : {"+ dealer.Status(dealer.getHand(), dealer.getStatus()) + "}");
		System.out.println("Player : {"+ player.Status(player.getHand(), player.getStatus()) + "}");
		System.out.println("Score : " + player.getCount());
		
	}
}
