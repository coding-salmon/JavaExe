package ch05.array08;

import java.util.*;

public class Resolve04 {

	public static void main(String[] args) {
		int[] numArr = new int[] { 7, 6, 5, 4, 3,2,1 };

		{
			for (int i = 0; i < numArr.length; i++) {
				for (int j = 0; j < numArr.length - i - 1; j++) {
					if (numArr[j] > numArr[j + 1]) {

						int temp = numArr[j];
						numArr[j] = numArr[j + 1];
						numArr[j + 1] = temp;

					}
				}System.out.println(Arrays.toString(numArr));
			}
		}
		System.out.println(Arrays.toString(numArr));
	}
}
