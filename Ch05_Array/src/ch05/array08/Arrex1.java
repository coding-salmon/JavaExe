package ch05.array08;

import java.util.Arrays;

public class Arrex1 {
	public static void sel(int[] numArr) {
		//선택정렬로 numArr을 오름차순으로 바꾸고 싶다
		int n = numArr.length;
		
		for (int i=0; i<n-1;i++) {
			int minIndex=i;
			for(int j= i+1 ; j <n; j++) {
				if(numArr[j]<numArr[minIndex]) {
					minIndex=j;
				}
			}
			int temp = numArr[i];
			numArr[i] = numArr[minIndex];
			numArr[minIndex] = temp;
		}
	}
	public static void main(String[] args) {
		int[] numArr = {2,5,10,1,55,33,21};
		
		System.out.println(Arrays.toString(numArr));
		
		sel(numArr);
		System.out.println(Arrays.toString(numArr));
	}

}
