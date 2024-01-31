package ch08.class09.Ex1;

public class FruitBuyer {
	private int money; //돈
	private int buyMoney; //사용한돈
	private int numOfApple; //사과 개수
	final int APPLE_PRICE = 1000; //사과가격
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
	}
	
	public int buyApple(int money) { //2000원어치 사과를 샀다 =2개
		int num = money/APPLE_PRICE;
		numOfApple += num;
		buyMoney -= money;
		return num;
	}
	public void buyApple(FruitSeller seller, int money) {
		this.numOfApple += seller.saleApple(money);
		this.money -= money;
		
	
		
	
	}
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황");
		System.out.println("현재 잔액: " + (money-(-buyMoney)));
		System.out.println("사과 개수: " + numOfApple);
	}
}
