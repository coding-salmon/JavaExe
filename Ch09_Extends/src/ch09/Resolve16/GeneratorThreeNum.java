package ch09.Resolve16;

public class GeneratorThreeNum {

	public static int[] generatorNumbers() { //컴퓨터가 3개의 숫자를 생성함
		int[] randomNumbers = new int[3];
		int count =0;
		
		while (count <3) {
			int randomNum = (int)(Math.random()*10);
			
			if(!isNumberInArray(randomNumbers, randomNum, count)) {
				randomNumbers[count] = randomNum;
				count++;
			}
		}
		
		return randomNumbers;
	}
	private static boolean isNumberInArray(int[] array, int number, int count) {
		for(int i = 0; i<count; i++) {
			if (array[i] == number) {
				return true;
			}
		}
	

		return false;
 
}
}
