package ch14.thread.ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
	
	//main 함수는 메인 스레드가 해야할일
	public static void main(String[] args) {
		
		//main스레드(주인아저씨)가 work스레드(알바생)을 고용한다.
		Thread thread = new Thread() {
			
			
			//알바생이 해야할일
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} 
					catch(Exception e) {}
				}
			}
		};
		
		//메인스레드가 해야할일
		thread.start();
			for(int i=0; i<5 ; i++) {
				System.out.println("띵");
				try { Thread.sleep(500);}
				catch(Exception e) {}
			}
	}

}
