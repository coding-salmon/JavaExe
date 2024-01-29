package ch05.array06;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		String[] nameArr = new String[5];
		int[] scoreArr = new int[5];
		char[] chScoreArr = new char[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<nameArr.length;i++) {
			System.out.println((i+1)+"번째 학생이름>>");
			String name = sc.nextLine();
			
			System.out.println((i+1)+"번째 학생 점수>>");
			String strScore = sc.nextLine();
			int score = Integer.parseInt(strScore);
					
					nameArr[i] = name;
					scoreArr[i] = score;
					
		char chScore;
		
		
		if(score>=90)
			chScore = 'A';
		else if(score>=90)
			chScore = 'B';
		else if(score>=80)
			chScore = 'C';
		else if(score>=70)
			chScore = 'D';
		else
			chScore = 'F';
		
		chScoreArr[i] =chScore;
		}
		
		for(int i=0; i< nameArr.length;i++) {
			System.out.printf("%d %s:%c\n", (i+1),nameArr[i], chScoreArr[i]);
		}
	}

}
