package ch09.Resolve16;

import java.util.Scanner;



public class BaseBall {
	
	private Scanner sc = new Scanner(System.in);
	private int sel;
	private int[] numbers = new int[3];
	
	public int viewMenu() {
		System.out.println("-----야구게임------");
				System.out.println(" [ 메뉴 선택 ] ");
		System.out.println("1. 게임시작 " );
		System.out.println("2. 끝내기 ");
		System.out.println("번호 입력 >> ");
		System.out.println("----(재미있음)-----");
		sel = sc.nextInt();
		return sel;
	}
	
	public void baseBallGame() {
	 	switch (sel) {
		case 1:
			
		System.out.println("1P는 0~9까지 숫자중 3개를 입력하시오(중복금지)");
	 	
		for(int i=0; i<3; i++) {
			numbers[i] = sc.nextInt();
		
		}
			System.out.println("투수 던졌습니다! 상대타자...");
				
			
			
			
		
		
		
//		System.out.println("볼!");
//		System.out.println("삼진!");
		
		break;
		
		case 2:
			System.out.println("게임을 종료합니다.");
			break;
			
		default: 
	 	System.out.println("잘못입력했습니다.");
	 	break;
	 	}
	}

	public int[] getNumbers() {
		return numbers;
	}	 

}





