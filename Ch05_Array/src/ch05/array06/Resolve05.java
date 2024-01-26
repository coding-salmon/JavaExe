package ch05.array06;

import java.util.Scanner;

public class Resolve05 {

	public static void main(String[] args) {
		// TODO 6. 5명의 학생의 이름과 점수를 입력받고
		//   해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
		  // A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
		Scanner sc = new Scanner(System.in);
		   String[] boy = new String[5];
		   
		   for(int i=0; i< boy.length;i++) {
			   System.out.print((i+1)+ "번째 학생 이름 입력>>");
		   
		   boy[i] = sc.next();
		   
		   
		   }
		   int[] grade = new int[5];
		   for(int j=0;j<grade.length;j++) {
			   System.out.print((j+1) + "번째 학생 학점 입력>>");
			   
			  grade[j] = sc.nextInt();  
		   
			  
			  
		   }
		   for(int k=0; k<boy.length;k++)
		   System.out.println(boy[k] + grade[k]);
		  
		  
	}

}

