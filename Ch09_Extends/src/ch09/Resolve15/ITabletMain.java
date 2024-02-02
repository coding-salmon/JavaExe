package ch09.Resolve15;

import java.util.Arrays;

import ch09.Resolve15.factory01.*;
import ch09.Resolve15.TabletTest.*;
import ch09.Resolve15.*;

public class ITabletMain {
	public static void main(String[] args) throws InterruptedException {
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[]	{
				new Samsung(),
				new Sony(),
				new Lg()
		};
		
		int[] score = new int[tabletArr.length];
		
		for(int i=0;i<tabletArr.length;i++) {
			int tempScore =0;
			tabletTester.setTablet(tabletArr[i]);
			
			tempScore += tabletTester.movieTest();
			System.out.printf("---movie 테스트 점수는 %d입니다\n", tempScore);
			tempScore += tabletTester.musicTest();
			System.out.printf("---music 테스트 점수는 %d입니다\n", tempScore);
			tempScore += tabletTester.readBookTest();
			System.out.printf("---readBook 테스트 점수는 %d입니다\n", tempScore);
			
			score[i] = tempScore;
			
			System.out.printf("---->전체 테스트 점수는 %d입니다", score[i]);
			System.out.println("-------------------------------");
		}
		
		int max = score[0];
		int maxIdx =0;
		for(int i=1; i<score.length;i++) {
			if(max<score[i]) {
				max = score[i];
				maxIdx =i;
			}
		}
		System.out.printf("가장 높은 점수를 받은 테블릿은 %d번째 태블릿이고 점수는 %d입니다.\n",maxIdx+1, max);
		System.out.println(tabletArr[maxIdx].getClass().getName());
	}

}
