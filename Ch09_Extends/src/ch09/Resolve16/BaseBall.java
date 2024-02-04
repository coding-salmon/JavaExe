package ch09.Resolve16;

import java.util.Scanner;


				
public class BaseBall { //메뉴를 담당하는 클래스
	
	private Scanner sc = new Scanner(System.in);
	private int sel;
	private int[] numbers = new int[3];
	
	public int viewMenu() { //메뉴를 블러옴
		System.out.println("-----삼진아웃게임------");
				System.out.println(" [ 메뉴 선택 ] ");
		System.out.println("1. 게임시작 " );
		System.out.println("2. 끝내기 ");
		System.out.println("번호 입력 >> ");
		System.out.println("----(재미있음)-----");
		sel = sc.nextInt();
		return sel;
	}
	public void inputNumbers() { 	// 게임을 위한 번호를 입력받음
		System.out.println("0~9까지 숫자중 3개를 입력하시오(중복금지)");
	 	
		for(int i=0; i<3; i++) {
			numbers[i] = sc.nextInt();
		}
		}   
	public void baseBallGame() { // 삼진아웃 게임을 실행시킴
		 switch (sel) {
		case 1:
			
			System.out.println("...어느새 9회말2아웃 마지막승부!");
			System.out.println("상대 4번타자 타석에 들어섰습니다!");
			System.out.println("당신은 마지막 구원투수 입니다.!");
			
			
		
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





