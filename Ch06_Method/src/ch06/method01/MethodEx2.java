package ch06.method01;

import java.util.Scanner;

//메서드를 만들기전 코드
public class MethodEx2 {
	
	public static void calcArith(int num0, int num1, String op) {
		int result = 0;
		
		switch (op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		case "%":
			result = num0 % num1;
			break;
		default:
			System.out.println("연산이 불가능합니다.");
			break;
			
	}System.out.println("결과값은" +result+ "입니다.");
	sc.close();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 정수입력>>");
		int num0 = sc.nextInt();
		System.out.println("2번째 정수입력>>");
		int num1 = sc.nextInt();
		System.out.println("연산자 입력(+ - * / %)>>");
		String op = sc.next();
		
		calcArith(num0,num1,op);
		sc.close();	
		
		
}
}
