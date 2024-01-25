package ch03_Switch06;


import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		System.out.println("봄");
		System.out.println("여름");
		System.out.println("가을");
		System.out.println("겨울");
		System.out.println("선택>>");
		
		Scanner sc = new Scanner(System.in);
		String sel = sc.next();
		switch(sel) {
	case "봄":
		System.out.println("봄이왔다");
		break;
	case "여름":
		System.out.println("여름이왔다");
		break;
	case "가을":
		System.out.println("가을이왔다");
		break;
	case "겨울":
		System.out.println("겨울이왔다");
		break;
		}
	sc.close();
	}
}