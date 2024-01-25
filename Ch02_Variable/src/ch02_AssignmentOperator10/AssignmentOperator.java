package ch02_AssignmentOperator10;

public class AssignmentOperator {

	public static void main(String[] args) {
		int num = 0;
		num = num + 10;
		System.out.println(num);
		num = num + 20;
		System.out.println(num);
		num = num*30;
		System.out.println(num);
		num = num+num;
		System.out.println(num);
		
		num =20000;
		if( num<10000){
		System.out.println(num);
		}else {System.out.println("너무큽니다");
	}
	}
}
