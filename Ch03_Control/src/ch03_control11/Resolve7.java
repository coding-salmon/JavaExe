package ch03_control11;

import java.util.Scanner;

public class Resolve7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------" +
							"\n 1.예금 : 2.출금 : 3. 잔고 : 4. 종료" +
							"\n-------------------------------" +
							"\n 메뉴를 선택하세요>>");
			
		int num = sc.nextInt();
		
		if (num==1) {
			System.out.println("예금하실금액을 입력하세요.");
		
				int inMoney =sc.nextInt();
					
				
				System.out.println(inMoney+"입금되었습니다.");
				
		}else if (num==2 ) {
			System.out.println("출금하실금액을 입력하세요.");
			
			int outMoney =sc.nextInt();
				
			
			System.out.println(outMoney+"출금되었습니다.");
			
		}
				
		}

}

