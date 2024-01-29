package ch06.method01;

import java.util.Scanner;

public class Resolve5 {
	
	public static void star(int num) {
		
		for(int i = 0; i< num ;i++) {
			for(int j=0; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		System.out.println("별의 갯수를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		
		
		int num =sc.nextInt();
		star(num);
		

	}

}
