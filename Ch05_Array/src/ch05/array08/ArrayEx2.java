package ch05.array08;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		//이차원 배열
		// arr 은 1차원 배여을 가리키는 3개의참조변수 배열을 가르킨다(참조값)
		int [][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[5];
		//arr 배열요소는 1차원 배열을 가르킨다
		for(int i = 0 ; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]= i*3 +j;
			}
		}
		System.out.println(arr);
	System.out.println(Arrays.toString(arr));
	for(int[]temp : arr) {
 System.out.println(Arrays.toString(temp));

}
	}
}
