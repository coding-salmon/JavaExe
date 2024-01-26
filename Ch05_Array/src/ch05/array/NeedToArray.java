package ch05.array;

import java.util.Scanner;

public class NeedToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] kor = new int[3]; // int변수 공간 3개 만들어줘. 대표이름은 kor
		
		System.out.print("1번째 학생 국어점수 입력 >>");
		int kor0 = sc.nextInt();
		System.out.print("2번째 학생 국어점수 입력 >>");
		int kor1 = sc.nextInt();
		System.out.print("3번째 학생 국어점수 입력 >>");
		int kor2 = sc.nextInt();
		
		
		int total = 0;
		double avg = 0;
		for(int i=0; i<kor.length; i++) {
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);
		}
		sc.close();
	}

}
