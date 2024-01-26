package ch05.array04;

import java.util.Scanner;

public class Resolve03 {

	public static void main(String[] args) {
		// TODO 3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[7];
		
		for(int i=0; i<grade.length;i++) {
		System.out.println((i+1)+"번째 학생의 학점을 입력하시오>>");
		grade[i] = sc.nextInt();
	}
		int total = 0;
		double avg = 0;
		for(int i =0; i<grade.length;i++) {
			 total += grade[i];
		}
		avg = total/grade.length;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);
		sc.close();
}
}
