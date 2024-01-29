package ch06.method01;

import java.util.Scanner;

public class Resolve3 {
	
	public static int total(int num0, int num1) {
		int result =0;
		
		for (int i= num0; i<=num1;i++) {
			result +=i;
		}
		
		return result;
				
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작하는 정수를 입력하시오>>");
		int num0 = sc.nextInt();
		
		System.out.println("끝나는 정수를 입력하시오>>");
		int num1 = sc.nextInt();
		
		int sum = total(num0,num1);
		System.out.println("총합은"+sum);	
		
		sc.close();
	}

}
