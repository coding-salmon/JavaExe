package ch03.ForEx10;

import java.util.Scanner;

public class Resolve14 {

	public static void main(String[] args) {
		System.out.println("구구단을 보여드립니다. 몇단?");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.println(num+"단은"+num+"*"+i+"="+(num*i));
		}
		sc.close();

	}

}
