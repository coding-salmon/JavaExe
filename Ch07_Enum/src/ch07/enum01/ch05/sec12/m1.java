package ch07.enum01.ch05.sec12;

import java.util.*;

public class m1 {
	
	public static void findMax(int num0, int num1) {
		if(num0 < num1) {
			System.out.println("더 큰값은" +num1);
		}else {
			System.out.println("더 큰값은" +num0);
		
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개입력>>");
		
		int num0 = sc.nextInt();
		
		int num1 = sc.nextInt();
		findMax(num0,num1);
		
		sc.close();
	}

}
