package ch02_input03;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		int result = 0;
		int num0 =0, num1 =0, num2=0;
		
		
		//라이브러리 (jdk를 포함한) 에 존재하는 클래스는
		//컨트롤 + 시프트 + o 를 누르면 자동으로 팩키지 경로를 등록해준다
		//jdk 에 있는 클래스이고 키보드 입력을 받을때 사용한다
		Scanner sc = new Scanner(System.in);
			
		System.out.println("더하기 연산을 합니다");
		System.out.println("1번째 숫자 입력 >>");
		num0= sc.nextInt();
		System.out.println("2번째 숫자 입력>>");
		num1= sc.nextInt();
		System.out.println("3번째 숫자 입력>>");
		num2= sc.nextInt();
		
		//결과 계산
		// = (대입 연산자) 는 우측의 연산이 모두 완료된 후 처리된다.
		result = num0 + num1 + num2;
		System.out.println("결과는 " + result);
		
		
		
		sc.close(); //키보드와 연결을 닫는ㄴ다.

	}

}
