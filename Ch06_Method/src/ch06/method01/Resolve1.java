package ch06.method01;

import java.util.*;

public class Resolve1 {

	public static int findMax(int num0, int num1) {
		if(num0 > num1) {
			return num0;
		}else {
			return num1;
		}
	}

	public static int findMin(int num0, int num1) {
		if(num0<num1) {
			return num0;
		}else {
			return num1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수를 입력받는 부분
		System.out.println("첫번째 정수를 입력하시오>>");
		int num0 = sc.nextInt();

		System.out.println("두번째 정수를 입력하시오>>");
		int num1 = sc.nextInt();
		
		int max = findMax(num0,num1);
		int min = findMin(num0,num1);
		System.out.println("두정수중 큰값은" + max + "작은값은" + min);

		sc.close();

	}
}
