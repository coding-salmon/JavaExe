package ch09.ex5;

public class Main {
	public static void main(String[] args) {
		System.out.println("게임을 시작합니다.");
		Child1 child1 = new Child1(15);
		Child2 child2 = new Child2(9);
		
		child1.showChild1();
		child2.showChild2();
		
		System.out.println();
		
		System.out.println("첫번째 게임결과");
		
		child1.getMable(child2, 2);
		
		
		child1.showChild1();
		child2.showChild2();
		
		System.out.println();
		
		System.out.println("두번째 게임결과");
		
		child2.getMable(child1, 7);
		
		
		child1.showChild1();
		child2.showChild2();
		
	}

}
