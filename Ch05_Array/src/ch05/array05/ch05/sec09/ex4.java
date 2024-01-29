package ch05.array05.ch05.sec09;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total1 = 0;
		double avg = 0.0;
		for(int i =0; i<7;i++) {
			System.out.println((i+1) + "학생학점입력>");
			int score = sc.nextInt();
			total1 += score;
			
		}
		avg = (double)total1/7;
		System.out.println("총점은 " + total1);
		System.out.println("평균은"+ avg);
	}

}
