package ch08.ex2;

public class CarExample {
	public static void main(String[] args) {
		
		
		

//		Car myCar = new Car();
//		System.out.println("제작회사" + myCar.company);
//		System.out.println("모델명" + myCar.model);
//		System.out.println("색깔" + myCar.color);
//		System.out.println("최고속도" + myCar.maxSpeed);
//		System.out.println("현재속도" + myCar.speed);
//		
//		myCar.speed = 60;
//		System.out.println("지금현재속도: "+ myCar.speed);

		Car car1 = new Car("지프차");
		System.out.println("car1.company:"+ car1.company);
		System.out.println("car1.model:"+ car1.model);
		System.out.println();
		
		Car car2 = new Car("트럭","흰색");
		System.out.println("car2.company:"+ car2.company);
		System.out.println("car2.model:"+ car2.model);
		System.out.println();
		
		Car car3 = new Car("스포츠카","빨강",200);
		System.out.println("car3.company:"+ car3.company);
		System.out.println("Car3.model:"+ car3.model);
		System.out.println("car3.color:"+ car3.color);
		System.out.println();
		
		Car car4 = new Car("택시","검정	",400);
		System.out.println("car4.company:"+ car4.company);
		System.out.println("Car4.model:"+ car4.model);
		System.out.println("car4.color:"+ car4.color);
		System.out.println("car4.maxSpeed:"+ car4.maxSpeed);
		System.out.println();
		
		
		
		
		
	}

}
