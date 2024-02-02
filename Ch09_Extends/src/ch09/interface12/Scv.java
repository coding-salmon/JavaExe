package ch09.interface12;

public class Scv implements StarUnit{

	@Override //에노테이션 생략해도되지만 가독성을 위해서 사용
	public void walk() {
		System.out.println("스르륵==");

	}

	@Override
	public void attack() {
		System.out.println("징징==");

	}

	@Override
	public void die() {
		System.out.println("펑==");
		
	}

}
