package ch03.ForEx10;


import java.util.Scanner;

public class Resolve1 {

	public static void main(String[] args) {
		//나누기  + 나머지 연산 / %
		
				System.out.println("입금할 액수를 입력하세요");
				Scanner sc = new Scanner(System.in);
				//78670
				int num = sc.nextInt();
				int a =0, b=0, c=0, d=0, e=0, f=0 , g=0, h=0, i=0;
				
				a = num/50000;
				System.out.print("오만원권"+a+"매");
				
				b = (num%50000)/10000;
				System.out.print("만원권"+b+"매");
				
				c = ((num%50000)%10000)/5000;
				System.out.print("오천원권"+c+"매");
				
				d = (((num%50000)%10000)%5000)/1000;
				System.out.print("천원권"+d+"매");
				
				e = (((num%50000)%10000)%5000)/500;
				System.out.print("오백원동전"+e+"개");
				
				f = ((((num%50000)%10000)%5000)%500)/100;
				System.out.print("백원동전"+f+"개");
				
				g = (((((num%50000)%10000)%5000)%500)%100)/50;
				System.out.print("오십원동전"+g+"개");
				
				h = ((((((num%50000)%10000)%5000)%500)%100)%50)/10;
				System.out.print("십원동전"+h+"개");
				
				i = (((((((num%50000)%10000)%5000)%500)%100)%50)%10)/1;
				System.out.print("일원동전"+i+"개");
				sc.close();
			}
				

	}


