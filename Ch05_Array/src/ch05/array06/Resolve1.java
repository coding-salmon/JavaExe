package ch05.array06;

import java.util.Arrays;

public class Resolve1 {

	public static void main(String[] args) {
		// 1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
		
		
		
		String[] names = {"일", "이", "삼",	"사","오","육","칠","팔","구","십"};
		for(int i=0; i <names.length;i++) {
				System.out.print(names[i]+ " ");
				
		}
		System.out.println("이름은 모두"+names.length);
	}

}
