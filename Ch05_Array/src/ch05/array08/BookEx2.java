package ch05.array08;

import java.util.Scanner;

public class BookEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("1:증속 | 2:감속 | 3:중지 ");
			System.out.println("선택>");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: "+ speed);
			}else if(strNum.equals("2") ) {
				speed--;
				System.out.println("현재속도: "+ speed);
			}else if(strNum.equals("3") ) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
		
	}
	
		
			
	}

