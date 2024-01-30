package ch07.enum01.ch05.sec12;


import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		System.out.println("1짜장");
		System.out.println("2짬뽕");
		System.out.println("3탕수육");
		System.out.println("4유린기");
		System.out.println("5유산슬");
		System.out.println("선택>>");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		// sel 값과 같은 case 로 이동
		
		//  sel==2 , sel==3 처럼 해도된다.
		if(sel == Menu.ZZAJANGMYUN)  {
		    System.out.println("짜장면");
		}else if(sel == Menu.ZZAMPONG) {
			System.out.println("짬뽕");
		}else if(sel == Menu.TANGSUYUK) {
			System.out.println("탕수육");
		}else if(sel == Menu.YOULINGI) {
			System.out.println("유린기");
		}else if(sel == Menu.YOUSANSUL) {
			System.out.println("유산슬");
		}else {
			System.out.println("해당메뉴가없습니다.");
		}
	sc.close();
	}
}