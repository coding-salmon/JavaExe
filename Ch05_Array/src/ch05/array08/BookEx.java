package ch05.array08;

import java.util.Scanner;

public class BookEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x값 입력>");
		String data1 = sc.nextLine();
		int num1 = Integer.parseInt(data1);
		
		System.out.println("y값 입력>");
		String data2 = sc.nextLine();
		int num2 = Integer.parseInt(data2);
		
		int result = num1+num2;
		System.out.println("x+y=" + result);
		System.out.println();
		
		while(true) {
			System.out.println("입력문자열:");
			String data = sc.nextLine()	;
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력문자열:" +data);
			System.out.println();
		}
		System.out.println("종료");
		
		
		
			
	}
}
