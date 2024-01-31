package ch08.class09.Ex2;

import java.util.Scanner;

public class China {
	
	private String[] foods = {"짜장면","짬뽕","탕수육"};
	private int selectNum;
	private Scanner sc = new Scanner(System.in);
	
	public void viewMenu() {
		System.out.println("-------]중국집[-------");
		for(int i=0; i<foods.length;i++) {
			System.out.println(i+"."+foods[i]);
		}
	}
	public void selectFood() {
		System.out.print("어떤 음식을 선택하시겠습니까?>>");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		String food = foods[selectNum];
		System.out.println(food + "나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	}
	public void keyboardEnd() {
		sc.close();
	}
	

}
