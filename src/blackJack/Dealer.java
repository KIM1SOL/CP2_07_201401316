package blackJack;

import java.util.ArrayList;

public class Dealer extends Player{
	/*
	 * Dealer는 Player를 extends할 것, 즉 player는 Dealer의 부모 클래스
	 * player는 카드 여러장을 arrayList타입의 hand필드에 저장
	 * Dealer는 Player와 같이 hand필드와 CardDeck하나를 가짐
	 * 점수를 계산하는 방법은 player안에 메소드만 구현, Dealer는 Player의 계산 메소드를 사용
	 * hand의 상태를 출력하는 방법도 Dealer는 Player의 메소드를 이용
	 */
	
	/*
	 * 카드 두장은 기본적으로 지급
	 * 처음 받은 2장이 합쳐 21이 나오는 경우 블랙잭으로 1.5배
	 * 21이 넘는 경우 버스트로 무조건 패배
	 * K, Q, J = 10점
	 * ACE는 1&11 -> 총합이 10 이하인 경우 11, 10 초과인 경우 1로계산 
	 */
	
	ArrayList<Card> hand = new ArrayList<Card>();
	
}
