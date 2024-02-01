package ch09.ex4;

import java.util.Arrays;

public class ArrayUtility {

	public static int[] concat(int[] s1, int[] s2) {
		int n = s1.length + s2.length;
		int[] s3 = new int[n];

		for (int i = 0; i < s1.length; i++) {
			s3[i] = s1[i];

			// System.out.println(Arrays.toString(s3));
		}
		for (int i = 0; i < s2.length; i++) {
			s3[s1.length + i] = s2[i];
			// System.out.println(Arrays.toString(s3));
		}

		return s3;
	}

	public static int[] remove(int[] s1, int[] s2) {
		int[] s3 = concat(s1,s2);
		int n1 = 0;
		boolean[] isDuplicate = new boolean[s3.length];

		for (int k = 0; k < s3.length; k++) {
			if (!isDuplicate[k]) {
				for (int l = k + 1; l < s3.length; l++) {
					if (s3[k] == s3[l]) {
						isDuplicate[l] = true;
					}
				}
				n1++;
			}
		}
				int[] uni = new int[n1];
				int index = 0;

				for (int i = 0; i < s3.length; i++) {
					if (!isDuplicate[i]) {
						uni[index++] = s3[i];
						
					}
				}
				return uni;
	}
}