package ch14.thread.ch14.sec07.exam02;

public class InterruptedExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
	}
		
		Thread.interrupted(); //interrupt 메소드 호출

}
}
