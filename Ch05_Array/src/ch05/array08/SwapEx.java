package ch05.array08;

public class SwapEx {

	public static void main(String[] args) {
//		a = 10;
//		b = 20;
//		a, b = b, a;  2개의 변수값을 바꾸려면
//		파이썬은 위처럼 가능하다.
		
		int a = 100;
		int b = 200;
		a = b;
		
		
		System.out.printf("a=%d, b=%d\n", a,b);
		
		int num0 = 10;
		int num1 = 20;
		int temp = 0;
		
		temp = num0;
		num0 = num1;
		num1 = temp;
		
		System.out.printf("num0=%d, num1=%d\n",num0,num1);
	}

}
