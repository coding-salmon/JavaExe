package ch17.stream01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamReduce {
	public static void main(String[] args) {
		int[] numArr = {1,2,3,4,5,6,7,8,9};
		
		//배열의 총합을 구하는 수식
		/*
		 * 2개의 입력param -> 1개 리턴
		 * 모든 스트림을 순환
		 * 
		 */
		int sum = Arrays.stream(numArr).reduce(0, (a,b)-> a+b);
		System.out.println("sum="+sum);
		//a=1, b=2 -> 3
		//a=3, b=3 -> 6
		//a=6, b=4 -> 10
		// ...
		//->45
		
		
		String[] strArr = {"안녕하세요!!!","hello","Good Morning", "반갑습니다."};
		String result = Arrays.stream(strArr).reduce("", (s1, s2)-> {
			if(s1.getBytes().length >=s2.getBytes().length)
					return s1;
			else
					return s2;
		});
		
		System.out.println("가장 긴 인사말은 "+result);
		
		Arrays.stream(strArr)
				.mapToInt(s->s.getBytes().length)
				.forEach(s->System.out.println(s));
	
	
	}

}
