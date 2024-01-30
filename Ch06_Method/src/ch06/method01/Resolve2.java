package ch06.method01;

import java.util.Scanner;

public class Resolve2 {
	
	//절대값을 비교하고 출력하는 메소드 
	public static  void difNum(int num0 , int num1) {
		
		int difNum = num0 - num1;
		int neverDifNum =0;
		if(difNum<0) {
			neverDifNum = -difNum;
			
		}else {neverDifNum = difNum;
			
		}
		System.out.println("두수의 차의 절대값은" +neverDifNum);
	}
	public static void main(String[] args) {
		
		// 두개의 정수를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하시오>>");
		int num0 = sc.nextInt();	
	
		System.out.println("두번째 정수를 입력하시오>>");
		int num1 = sc.nextInt();	
		//절대값 메소드 호출
		difNum(num0,num1);
		sc.close();	

	}

}
