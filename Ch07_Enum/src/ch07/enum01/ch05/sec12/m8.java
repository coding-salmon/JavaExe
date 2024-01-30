package ch07.enum01.ch05.sec12;

import java.util.Scanner;

public class m8 {

	public static void main(String[] args) {
		System.out.println("메세지를 입력");
		Scanner sc = new Scanner(System.in);
		String hi = sc.next();
		
		do {
			System.out.println("계속입력");
			 hi = sc.next();
			
			System.out.printf(hi);
		} while (! hi.equals("q"));
		
		System.out.println();
		System.out.println("종료");
		
		

	}

}
