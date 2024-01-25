package ch03_control02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 점수 입력 >>");
		score = sc.nextInt();
		
		if(score >=90)
			System.out.println("A학점");
	}System.out.println("A학점이 아닙니다.")

}
