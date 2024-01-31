package ch09.ex5;

public class Child2 {
	private int numOfMable; //구슬 개수
	
	public Child2(int numOfMable) {
		this.numOfMable = numOfMable;
		
	}	
	
	public void getMable(Child1 child1, int mable) {
		this.numOfMable += mable;
		child1.lostMable(mable);
	}
	public void lostMable(int mable) {
		this.numOfMable -= mable; 
		
	}
	public void showChild2() {
		System.out.println("*** 어린이2의 현재 상황");
		System.out.println("현재 구슬: " + numOfMable);
	}
}
	
	
	
	
	
	

