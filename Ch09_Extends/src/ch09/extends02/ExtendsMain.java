package ch09.extends02;

public class ExtendsMain {
	public static void main(String[] args) {
		Child child = new Child();
		child.handsome();
		child.wealth();
		child.play();
		
		System.out.println("잘생김점수:"+ child.handsomeScore);
		System.out.println("돈:"+ child.money);
		System.out.println("즐거운날"+ child.day);
	}

}
