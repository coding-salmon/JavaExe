package ch03.ForEx10;

import java.util.Scanner;

public class Resolve3 {
	
	
	public static void  methodIf() {
		System.out.println("정수3개를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하시오");
				int num1 = sc.nextInt();
		
		
		System.out.println("세번째 정수를 입력하시오");
		int num2 = sc.nextInt();
		
		boolean bTriangle =false;
		
		if((num+num1>num2) &&
			(num1+num2 >num) &&
				(num+num2>num1)) {
					bTriangle=true;
			}
		 System.out.println("조건"+ bTriangle );
		sc.close();
		
	}
	public static void main(String[] args) {
		methodIf();
}
}