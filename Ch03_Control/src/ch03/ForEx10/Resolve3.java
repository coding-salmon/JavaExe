package ch03.ForEx10;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		System.out.println("정수3개를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하시오");
				int num1 = sc.nextInt();
		
		
		System.out.println("세번째 정수를 입력하시오");
		int num2 = sc.nextInt();
		
		int sum = 0;
		sum = num +num1;
		if(sum < num2) {
			System.out.println("삼각형을 만들수있습니다.");
		}else {
			System.out.println("삼각형을 만들수없습니다.");
		}
		
		
		
		
		
		sc.close();
	} 

}
