package ch03_control01;


import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 점수 입력 >>");
		score = sc.nextInt();
		
		if(score >=90) 
			System.out.println("A학점");
	else if(score >=80)
		System.out.println("B학점");
		

	
	sc.close();
	}
}