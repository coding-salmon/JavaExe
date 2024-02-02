package ch09.hasa08;

/* 상속을 할때는 고려해야 할 것이 있다.
 * 1)부모로 정할 클래스와 자식 클래스간에
 * 자연스러운 종속 관계인지 
 * 자연스러운 종속 관계이면 상속을 고려할수 있다.
 * 그렇지 않다면 사용하지 않는 것이 좋다.
 * ex) Gun - Police : 자연스러운 종속관계가 아니라
 * Police 가 Gun 의 기능이 필요한 관계
 * 
 * 2) 만약 이 예제처럼 상속관계를 정한다면
 * 2-1)불필요한 기능을 제공함으로써 잘못된 서비스/ 오류를 야기할 가능성이 매우 높아진다.
 * 
 * 2-2)상속관계를 가지면 부모의 모든 객체는 자식 객체에 포함되므로
 * 메모리의 낭비를 가져올수있다.
 * 3) 그러므로 Gun - Police의 관계는 상속 < 포함 관계가 더 나을수 있다.
 */
public class PoliceMain {
	public static void main(String[] args) {
		ForcePolice fp = new ForcePolice(3,5,5);
		fp.run();
		fp.fight();
		fp.putOnHandCuffs();
		
		NursePolice np = new NursePolice(10, 5);
		np.calcThermometer();
		
		
		Police pp = new Police(3);
	}

}
