package ch14.thread.ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} 
			catch(Exception e) {
		}
		}
			for(int i=0; i<5 ; i++) {
				System.out.println("띵");
				try { Thread.sleep(500);}
				catch(Exception e) {
			}
	}

}
}