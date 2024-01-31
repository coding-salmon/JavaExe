package ch08.class09.Ex3;

public class Main {
	public static void main(String[] args) {
		Mart mart = new Mart(100);
		Boy boy = new Boy(100000);
		
		mart.showSaleResult();
		boy.showBuyresult();
		
		boy.buyPear(mart, 5000);
		
		mart.showSaleResult();
		boy.showBuyresult();
	}

}
