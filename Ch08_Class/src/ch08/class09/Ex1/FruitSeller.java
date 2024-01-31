package ch08.class09.Ex1;

public class FruitSeller {
	private int numOfApple;				//사과개수
	private int saleMoney;				//판매금액
	final int APPLE_PRICE = 1000;		//사과가격(상수) 더이상바꾸지않겠다.
	
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		saleMoney += money;
		return num;
		
	
	
	}
	public void saleApple(FruitBuyer buyer, int money) {
		this.numOfApple -= buyer.buyApple(money);
		this.saleMoney += money;
	}
	
	
	public void showSaleResul() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 :" + numOfApple);
		System.out.println("판매 수익 :" + saleMoney);
	}

} //상수를 만들때 final을 쓴다
