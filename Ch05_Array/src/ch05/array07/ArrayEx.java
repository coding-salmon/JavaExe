package ch05.array07;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		/*
		배열의정렬
		Arrays.sort(scores);
		Arrays.parallelSort(scores);
		*/
		int[] scores = {98,12,53,66,33,44,55,66};
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
	}

}
