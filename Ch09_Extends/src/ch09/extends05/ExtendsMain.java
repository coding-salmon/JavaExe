package ch09.extends05;

/*Java 접근 제한자
 * 1) public :누구라도 접근가능
 * 2) protected : 같은 패키지 클래스 접근가능 + 패키지가 달라고 자식패키지는 접근가능
 * 3) default : 접근 제한자를 쓰지 않을때, 같은 패키지에 있는 클래스만 접근가능
 * 4) private :  클래스내에서 나만 가능 자식도 접근불가능
 */

public class ExtendsMain {
	public static void main(String[] args) {
		Child child = new Child(7,99999L, 72);
		child.handsome();
		child.wealth();
		child.play();
		
		/* private 때문에 접근제한
	 	System.out.println("잘생김점수:"+ child.handsomeScore);
		System.out.println("돈:"+ child.money);
		System.out.println("즐거운날"+ child.day);
		*/
	}

}
