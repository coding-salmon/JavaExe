package ch03.ForEx10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {
		
System.out.println("369게임 1~99중 하나를 입력");
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int n10 = num/10;
		int n1 = num%10;
		
		int cnt = 0;
		if(n10==3 || n10 ==6 || n10 ==9)
			cnt++;
		if(n1==3 || n1 ==6 || n1 ==9)
			cnt++;
		
		if(cnt==1)
			System.out.println("박수짝"); 
		else if (cnt==2)
			System.out.println("박수짝짝");
		
		sc.close();	

	}

}
