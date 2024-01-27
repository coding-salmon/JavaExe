package ch05.array08;

import java.util.Arrays;

public class Resolve1 {

	public static void main(String[] args) {
		// 1. 정수 배열 5개를 할당하고 Arrays.sort 를 활용해서 최소값과 최대값을 구하시오
		
		int[] num = {5,23,34,53,24};
		
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}

}
