package ch08.class09.Ex3;

public class Boy {
	private int money;
	private int numOfPear;
	
	public Boy(int money) { //Boy 현재상황
		this.money = money;
		this.numOfPear =0;
	}
	
	public void buyPear(Mart mart, int money) {
		this.numOfPear += mart.salePear(money);
		this.money -= money;
	}
	
	public void showBuyresult() {
		System.out.println("----- Boy 의 현재 상황 -----");
		System.out.println("현재 잔액:" + money);
		System.out.println("배 개수:" + numOfPear);
	}
}
