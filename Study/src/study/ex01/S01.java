package study.ex01;

import java.util.Arrays;

public class S01 {
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		
		arr1 = new int[] {1,2,3};
		arr2 = arr1;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
