package ch09.ex4;

import java.util.Arrays;

public class ArrayUtilityMain {
	public static void main(String[] args) {
	
	ArrayUtility arrayUtility = new ArrayUtility();	
		int[] s1 = {1,2,3,4};
		int[] s2 = {3,4,5,6,7,8,9};
		int[] s3 = arrayUtility.concat(s1, s2);
		int[] s4 = arrayUtility.remove(s1, s2);
	
		System.out.println(Arrays.toString(s3));
		System.out.println(Arrays.toString(s4));
	
	}
	

}
