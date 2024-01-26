package ch03.ForEx10;


import java.util.Scanner;

public class Resolve1 {

	public static void main(String[] args) {
		//나누기  + 나머지 연산 / %
		
				System.out.println("입금할 액수를 입력하세요>>");
				Scanner sc = new Scanner(System.in);
				//78670
				int num = sc.nextInt();
				int a = num/50000;
				num= num%50000;
				int b = num/10000;
				num =num%10000;
				int c = num/5000;
				num =num%5000;
				int d = num%1000;
				int e = num/500;
				int f = num%100;
				int g = num/50;
				int h = num%10;
				int i = num/1;
						
						
				
				
				System.out.print("오만원권"+a+"매");
				
			
				System.out.print("만원권"+b+"매");
				
				
				System.out.print("오천원권"+c+"매");
				
				
				System.out.print("천원권"+d+"매");
				
				
				System.out.print("오백원동전"+e+"개");
				
				
				System.out.print("백원동전"+f+"개");
				
				
				System.out.print("오십원동전"+g+"개");
				
			
				System.out.print("십원동전"+h+"개");
				
				
				System.out.print("일원동전"+i+"개");
				sc.close();
			}
				

	}


