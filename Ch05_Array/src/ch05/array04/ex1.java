package ch05.array04;

import java.util.Arrays;

public class ex1 {

	public static void main(String[] args) {
		//배열의 얕은 복사 / 깊은 복사
		
		int[] scores = {100,88,95,67,42};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		
		System.out.println(scores);
		System.out.println(scores1);
		System.out.println(scores2);
		
		scores[2] = 999999;
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		
		//깊은복사 (힙에 별도의 공간을 생성한 후 scores4는 
		//새로 생성한 공간을 가리키게 된다.
		int[] scores4 = Arrays.copyOf(scores, scores.length);
		
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores4));
		System.out.println(scores1);
		System.out.println(scores4);
	}

}
