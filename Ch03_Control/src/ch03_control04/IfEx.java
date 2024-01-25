package ch03_control04;


import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		System.out.println("1짜장");
		System.out.println("2짬뽕");
		System.out.println("3탕수육");
		System.out.println("4양장피");
		System.out.println("5유산슬");
		System.out.println("선택>>");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		// sel 값과 같은 case 로 이동
		
		//  sel==2 , sel==3 처럼 해도된다.
		if(sel<2)  {
		    System.out.println("짜장면");
		}else if(sel<3) {
			System.out.println("짬뽕");
		}else if(sel<4) {
			System.out.println("탕수육");
		}else if(sel<5) {
			System.out.println("양장피");
		}else if(sel<6) {
			System.out.println("유산슬");
		}else {
			System.out.println("해당메뉴가없습니다.");
		}
	sc.close();
	}
}