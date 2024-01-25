package ch03_ex;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(0~100): ");
		
		int a = scanner.nextInt();
				
		if(a <30){
				System.out.println(a);
		        System.out.println("30보다 작습니다.");
	}else {
		System.out.println("30보다 큽니다.");}
		}
		scanner.close();
	}
}

