package ch09.ex3;

import java.util.Arrays;

public class ArrayUtility {
	public static void main(String[] args) {
		int[] intArray= {1,2,3,4,5};
		double[] doubleArray = {1.4,2.5,3.5,4.5,5,5};
		//정수 배열과 실수 배열을 생성
		
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(doubleArray));
		// 변환전 출력값
		double[] doubleArray1 = intToDouble(intArray);
		int[] intArray1 = doubleToInt(doubleArray);
		
		
		System.out.println(Arrays.toString(intArray1));
		System.out.println(Arrays.toString(doubleArray1));
		// 변환후 출력값
	}
	
	// 정수를 실수로 변환하는 메서드
	// 정수 배열과 같은 길의 실수배열을 만들고
	// 
	public static double[] intToDouble(int[] source) {
		double[] result = new double[source.length];
		for(int i=0; i<source.length;i++) {
			result[i] =(double)source[i];
			
			System.out.println(Arrays.toString(result));
		}
		return result;
	}
	// 실수를 정수로 변환하는 메서드
		public static int[] doubleToInt(double[] source) {
			int[] result = new int[source.length];
			for(int i=0; i<source.length;i++) {
				result[i] =(int)source[i];
			System.out.println(Arrays.toString(result));
			}
			return result;







}
}

