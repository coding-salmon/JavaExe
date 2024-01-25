package ch03_control03;


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
		switch(sel) {
		
	case 1:
		System.out.println("짜장면");
		break;
	case 2:
		System.out.println("짬뽕");
		break;
	case 3:
		System.out.println("탕수육");
		break;
	case 4:
		System.out.println("양장피");
		break;
	case 5:
		System.out.println("유산슬");
		break;
	default: // else 와 같은 의미
		System.out.println("해당메뉴번호가없습니다.");
		break;

		}
	sc.close();
	}
}