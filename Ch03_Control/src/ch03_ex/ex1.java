package ch03_ex;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int score;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(0~100): ");
		score = scanner.nextInt();
		
		if(score <30){
			System.out.println("30보다 작습니다.");
		}else {
			System.out.println("30보다 큽니다.");}
	    
	
		scanner.close();
   }

}

	


