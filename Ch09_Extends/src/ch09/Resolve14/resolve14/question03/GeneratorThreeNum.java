package ch09.Resolve14.resolve14.question03;

public class GeneratorThreeNum {
	public static int[] getRandomNum() {
		int[] numArr = new int[3];

		// 1번째 난수 생성
		numArr[0] = (int) (Math.random() * 10); // 0~9 난수 생성

		// 2번째 난수 생성
		boolean isRun = true;
		while (isRun) {
			int rNum = (int) (Math.random() * 10);
			if (rNum == numArr[0])
				continue;

			numArr[1] = rNum;
			isRun = false;

		}
		isRun = true;
		while (isRun) {
			int rNum = (int) (Math.random() * 10);
			if (rNum == numArr[0] || numArr[1] == numArr[2])
				continue;

			numArr[1] = rNum;
			isRun = false;
		}
		return numArr;
	}
}
