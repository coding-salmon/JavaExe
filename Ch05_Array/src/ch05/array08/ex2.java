package ch05.array08;

import java.util.*;

public class ex2 {

	public static void main(String[] args) {
		int[] numArr = new int[] {4,7,9,1,2};
		
		for (int i = 0; i<numArr.length; i++) {
			for(int j=0; j<numArr.length-i-1; j++) {
				
				if(numArr[j] < numArr[j+1]) {
					
					int temp = numArr[j];
					numArr[j]=numArr[j+1];
					numArr[j+1]=temp;
				}
			}
				
		}
		System.out.print(Arrays.toString(numArr));
	} 

}
