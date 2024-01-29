package ch06.method01;

import java.util.*;

public class Resolve4 {
	
	public static void dandan(int dan) {
		for(int i=1; i<=9;i++) {
			
				System.out.println(dan +"*" +i + "="+dan*i );
			
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단?>>");
		int dan = sc.nextInt();
		
		dandan(dan);
	
		

	}

}
