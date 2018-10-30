package blackJack;

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
		CardDeck asd = new CardDeck();
		asd.shuffle();
		System.out.print(asd.popCard().getSuit());
		System.out.print(asd.popCard().getRank());
		
		
	}

}
