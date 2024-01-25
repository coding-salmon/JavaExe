package ch02_IncDec11;

public class IncDecOperator {

	public static void main(String[] args) {
		int num = 0;
		
		// num++ num을 대입하고 1을 증가
		// ++num num을 1을 증가하고 대입
		
		num++; // num의 값을 1 증가시켜라 num +=1, num +1
		System.out.println(num);
		
		
		++num; // 
		System.out.println(num);
		
		
		
		int result1 = ++num;
		System.out.println("result1=" + result1);
		System.out.println("num=" + num);
		
		int result = num++;
		System.out.println("result=" + result);
		System.out.println("num=" + num);
		num=5;
		System.out.println(--num);
		System.out.println(--num);

	}

}
