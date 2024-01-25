package ch03.ForEx10;

import java.util.Scanner;

public class Resolve15 {

	public static void main(String[] args) {
			System.out.println("정수를 입력하시오(0을 누르면 합계가 나옵니다).");
			
			Scanner sc = new Scanner(System.in);
			int sum =0;
			
			while(true)
				
			{
				int num = sc.nextInt();
				if(num==0) {
			    	break;
			    }
			sum += num;
			System.out.println("계속 입력하시오");
			
			}		
			System.out.println("합계는"+sum+"입니다.");
			sc.close();

	}	

}
