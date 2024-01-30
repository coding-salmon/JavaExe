package ch05.array08;

import java.util.Arrays;

public class Resolve3 {

	public static void main(String[] args) {

		int[] numArr = new int[]{1,2,3,4,5};
		
		reverseArray(numArr);
		System.out.println(Arrays.toString(numArr));
		
	}
	private static void reverseArray(int[] arr) {
		int start= 0;
		int end = arr.length-1;
		
		while(start <end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
	}

}
