package ch03.ForEx10;

import java.util.Scanner;

public class Resolve15 {
	public static void method0() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			
			System.out.println("정수입력 (0은 합계 출력)");
			int num = sc.nextInt();
			if(num == 0)
				break;
			  sum += num;
	}
		System.out.println(sum);
	}

		public static void main(String[] args) {
			method0();
	}

}
