package ch09.Resolve16;

import java.util.Arrays;
import java.util.Scanner;

public class DecisionBall { // 스트라이크와 볼을 확인하고 계속 진행과 끝을 결정함
	
	private String sel;
	Scanner scanner = new Scanner(System.in);
	public void randomNum() {
		int[] randomNum = GeneratorThreeNum.generatorNumbers();
		BaseBall baseBall = new BaseBall();
	//public void userNumbers() {
		int[] userNumbers = baseBall.getNumbers();
		
	
	//public void checkStrikeAndBall() {
	int strike =0;
	int ball =0;
	
	while(strike < 3) {
		strike=0;
		ball=0;
		
		baseBall.inputNumbers();
	
	
	for(int i =0; i<randomNum.length;i++) {
		for (int j=0 ; j<userNumbers.length;j++) {
			if(randomNum[i] == userNumbers[j]) {
				if(i==j){
					strike++;
				}else {
					ball++;
					
	
				}
			}
		}
	}
	
	
	System.out.println(strike + ":스트라이크!");
	System.out.println(ball + ":볼!");
	System.out.println(Arrays.toString(userNumbers)+","+Arrays.toString(randomNum));
	
	
	if(strike <3) {
		
		
	}

}	
	System.out.println("-*-*-*-*-*-*-*-*-*-");
	System.out.println("삼진아웃! 당신의 승리입니다!");
	System.out.println("-*-*-*-*-*-*-*-*-*-");
	System.out.println("-*-*-*-*-*-*-*-*-*-");
	
	System.out.println("다시 하시겠습니까? [Y/N]");
	sel = scanner.next();
	
	
	switch (sel.toLowerCase()) {
		
		case "y":
		
		break;
		
		
		case "n":
			System.out.println("게임을 종료합니다.");
			return;
			
		default: 
	 	System.out.println("잘못입력했습니다.");
	 	break;
	 	}
	}
	

}

