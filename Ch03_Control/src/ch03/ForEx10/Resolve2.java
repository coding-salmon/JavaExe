package ch03.ForEx10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {
		
System.out.println("369게임 1~99중 하나를 입력");
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 나누기  나머지 십의자리 일의자리
		if(num/3 == 1|| num/3==2 || num/3==3 )
			System.out.println("짝");
		else if(num==13 || num== 16 ||num== 19)
			System.out.println("짝짝");
		else if(num==23 || num== 26 ||num== 29)
			System.out.println("짝");
		else if(num==33 || num== 36 ||num== 39)
			System.out.println("짝짝");
		else if(num==43 || num== 46 ||num== 49)
			System.out.println("짝");
		else if(num==53 || num== 56 ||num== 59)
			System.out.println("짝");
		else if(num==63 || num== 66 ||num== 69)
			System.out.println("짝짝");
		else if(num==73 || num== 76 ||num== 79)
			System.out.println("짝");
		else if(num==83 || num== 86 ||num== 89)
			System.out.println("짝");
		else if(num==93 || num== 96 ||num== 99)
			System.out.println("짝짝");
		sc.close();	

	}

}
