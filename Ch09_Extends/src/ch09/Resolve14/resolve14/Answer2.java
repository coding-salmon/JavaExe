package ch09.Resolve14.resolve14;

import java.util.Scanner;

import ch09.Resolve14.resolve14.question02.order01.TabletTester;
import ch09.interface13.order01.CarTester;
import ch09.Resolve14.resolve14.question02.ITablet;
import ch09.Resolve14.resolve14.question02.factory01.LenovoTablet;
import ch09.Resolve14.resolve14.question02.factory01.LgTablet;
import ch09.Resolve14.resolve14.question02.factory01.SamsungTablet;

public class Answer2 implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "2. ITablet 인터페이스를 만드세요.\r\n"
				+ "   아래 메서드를 멤버로 추가하세요.\r\n"
				+ "   void movie();\r\n"
				+ "   void music();\r\n"
				+ "   void readBook();\r\n"
				+ "   \r\n"
				+ "   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고\r\n"
				+ "   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.\r\n"
				+ "   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.\r\n\r\n";
		
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		sc.nextLine();		// Enter치기 전까지 멈춰 있음

		TabletTester tabletTester = new TabletTester();
		ITablet[] tArr = new ITablet[] {
				new LenovoTablet(),
				new LgTablet(),
				new SamsungTablet()
		};
		int[] score = new int[tArr.length];
		
		for(int i=0;i<tArr.length;i++) {
			/* DI(Dependency Injection) : 의존성 주입
			 * IoC(Inversion of Control) : 역제어
			 * */
			TabletTester.setT(tArr[i]);
			int onOff =0 , speed =0, footBreak =0;
			try {
			score[i] += tabletTester.onOffTest();
			System.out.printf("---OnOff 테스트 점수는 %d입니다\n", score[i]);
			score[i] += tabletTester.speedTest();
			System.out.printf("---Speed 테스트 점수는 %d입니다\n", score[i]);
			score[i] += tabletTester.footBreakTest();
			System.out.printf("---Break 테스트 점수는 %d입니다\n", score[i]);
			score[i] += tabletTester.driveTest();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			System.out.printf("===>전체 테스트 점수는 %d입니다\n", score[i]);
			System.out.println("---------------------------------------");
		}
		
		
		// 가장 큰 점수를 받은 값과 인덱스 찾기
		int max = score[0];
		int maxIdx = 0;
		for(int i=1;i<score.length;i++) {
			if(max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		
		System.out.printf("가장 높은 점수를 받은 차는 %d번째 차이고 점수는 %d입니다\n",
				maxIdx+1, max);
		System.out.println(tArr[maxIdx].getClass().getName());
		
		sc.nextLine();		// Enter치기 전까지 멈춰 있음

	}

	@Override
	public boolean isRun() {
		// TODO Auto-generated method stub
		return true;
	}

}
