package ch09.Resolve16;

import java.util.Arrays;

public class DecisionBall {
	
	
	
	
	
	
		
		
	public void randomNum() {
		int[] randomNum = GeneratorThreeNum.generatorNumbers();
		
		
	
	//public void userNumbers() {
		BaseBall baseBall = new BaseBall();
		
		int[] userNumbers = baseBall.getNumbers();
		
	
	
		
	
	//public void checkStrikeAndBall() {
	int strike =0;
	int ball =0;
	
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
	
	

}

}
