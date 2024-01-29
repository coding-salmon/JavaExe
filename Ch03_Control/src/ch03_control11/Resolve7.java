package ch03_control11;

import java.util.Scanner;

public class Resolve7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total =0;
		
		while (true) {
		System.out.println("-------------------------------" + "\n 1.예금 : 2.출금 : 3. 잔고 : 4. 종료"
				+ "\n-------------------------------" + "\n 메뉴를 선택하세요>>");

		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("예금하실금액을 입력하세요.");

			int inMoney = sc.nextInt();
			total += inMoney;

			System.out.println(inMoney + "입금되었습니다.");

		} else if (num == 2) {
			System.out.println("출금하실금액을 입력하세요.");

			int outMoney = sc.nextInt();
			if(total>=outMoney) {
				total -= outMoney;
				System.out.println(outMoney + "출금되었습니다.");
			}else {
				System.out.println("잔고가 부족합니다.");
			}
		} else if (num == 3) {
			System.out.println("현재 잔고는" + total + "입니다.");

		} else if (num==4) {
			System.out.println("안녕히가십시오.");
			break;
		}else {
			System.out.println("잘못입력되었습니다. 다시선택하세요");
		}

	}
}
}
