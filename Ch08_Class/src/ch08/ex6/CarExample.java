package ch08.ex6;



public class CarExample {
	public static void main(String[] args) {
		
	
	Car myCar = new Car();
	
	myCar.setGas(20);
	
	if(myCar.isLeftGas()) {
		System.out.println("출발합니다.");
		myCar.run();
	}
	System.out.println("gas를 주입하세요");
	
	}
}
