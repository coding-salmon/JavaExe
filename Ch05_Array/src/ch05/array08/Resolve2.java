package ch05.array08;

import java.util.Arrays;

public class Resolve2 {

	public static void main(String[] args) {
		// 1. 정수 배열 5개를 할당하고 Arrays.sort 를 사용하지말고 최소값 최대값 얻으시오

		int[] num = { 5, 23, 34, 53, 24 };

		System.out.println(Arrays.toString(num));

//		if (num[0] < num[1]) {
//			System.out.println("최소값은" + num[0]);
//		} else if (num[0] < num[2]) {
//			System.out.println("최소값은" + num[0]);
//		} else if (num[0] < num[3]) {
//			System.out.println("최소값은" + num[0]);
//		} else if (num[0] < num[4]) {
//			System.out.println("최소값은" + num[0]);
//		}
		
//		int minValue = num[0];
//		
//		for(int i= 1; i<num.length;i++) {
//			if(num[i] < minValue){
//				minValue = num[i];
//			}
//			
//				
//			}
//		System.out.println("최소값은" + minValue);
		
		int maxValue = num[0];
		
		for(int i= 1; i<num.length;i++) {
			if(num[i] > maxValue){
				maxValue = num[i];
			}
			
				
			}
		System.out.println("최대값은" + maxValue);
		}

}


