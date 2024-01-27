package ch05.array08;

import java.util.Arrays;

public class Resolve2 {

	public static void main(String[] args) {
		// 1. 정수 배열 5개를 할당하고 Arrays.sort 를 사용하지말고 최소값 최대값 얻으시오
		
		int[] num = {5,23,34,53,24};
		
		System.out.println(Arrays.toString(num));
		
		if(num[0]<num[1]) {
			System.out.println("최소값은" + num[0]);
			}if else(num[0]<num[2]) {
				System.out.println("최소값은" + num[0]);
			}
	}

}
