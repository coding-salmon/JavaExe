package ch08.class09.Ex3;

public class Mart {
	private int numOfPear;
	private int saleMoney;
	final int PEAR_PRICE = 2500;
	
	public Mart(int numOfPear) {
		this.numOfPear = numOfPear;
	}
	
	public int salePear(int money) {
		int num = money/PEAR_PRICE;
		numOfPear -= num;
		saleMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("-----마트 현재 상황-----");
		System.out.println("남은 배:" + numOfPear);
		System.out.println("판매 수익:" + saleMoney);
	}
}
