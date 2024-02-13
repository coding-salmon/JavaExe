package ch14.thread.ch14.sec06.exam02;

public class WaitNotifyExmaple {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject(); //공유 작업 개체 생성
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
	} //작업스레드 생성 및 실행

}
