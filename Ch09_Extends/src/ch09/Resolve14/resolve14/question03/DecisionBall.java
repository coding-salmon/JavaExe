package ch09.Resolve14.resolve14.question03;

public class DecisionBall {
	public static boolean decisionBall(int[] comArr, int[] userArr) {
		boolean isGameRun = true;
		String result = "";
		
		int strike = 0, ball =0;
		for(int i=0;i<comArr.length;i++) {
			for(int j=0;j<userArr.length;j++) {
			if(comArr[i] == userArr[j]) {
				if(i==j)
					strike++;
				else
					ball++;
			}
			
		}
	}
		if(strike==3)
			isGameRun = false;
	result = "strike=" + strike + ", ball="	+ ball;
	System.out.println(result);
	return isGameRun;

}
}
