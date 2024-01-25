package ch02_conditionalOperator12;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~100사이의 점수 입력>>");
		num = sc.nextInt();
		/* 조건 삼항 연산자를 사용하는 방법
		 * 
		 * A  ? B : c; 3개의 항목
		 * 항목의 조건 ?  true 면 실행 :  false면 실행
		 * str = num >= 85 ? "상위권입니다." : :"상위권에 미치지 못합니다.";
		
		 * 
		 * if (num >= 85)
		 * str = "상위권입니다.";
		 * 
		 * else
		 * str = "상위권에 미치지 못합니다.";
		 */
		
		
		if(num >=85)
			str= "상위권입니다.";
		else
			str = "상위권에 미치지 못합니다.";
		
		System.out.println(str);
		sc.close();
	}

}
