package ch06.method01;

import java.util.Scanner;

//메서드를 만들기전 코드
public class MethodEx3 {
	// num0 과 num1  add 함수의 지역변수이다.
	public static int add(int num0, int num1) {
		int result = num0 + num1;
		return result;
		
	}
	public static void main(String[] args) {
		//int num0 = 10 , num1 =5;
		int result1 = add(11, 16);
		System.out.println("결과"+ result1);
		
		int a= 3, b=7;
		int result2= add(a,b);
		System.out.println("결과"+result2);
		
}
}
