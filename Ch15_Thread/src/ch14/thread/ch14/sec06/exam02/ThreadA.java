package ch14.thread.ch14.sec06.exam02;

public class ThreadA extends Thread{
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {//공유 객체를 받음
		setName("ThreadA");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA(); //동기화 메소드 호출
		}
	}

}