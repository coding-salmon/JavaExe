package ch09.ex5;

public class Child1 {
	private int numOfMable; //구슬 개수
	
	public Child1(int numOfMable) {
		this.numOfMable = numOfMable;
		
	}	
	
	public void getMable(Child2 child2, int mable) {
		this.numOfMable += mable;
		child2.lostMable(mable);
		
	}
	public void lostMable(int mable ) {
		this.numOfMable -= mable;
	}
	public void showChild1() {
		System.out.println("*** 어린이1의 현재 상황");
		System.out.println("현재 구슬: " + numOfMable);
	}
}
	
	
	
	
	
	

