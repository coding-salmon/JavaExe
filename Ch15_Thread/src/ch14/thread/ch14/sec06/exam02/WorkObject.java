package ch14.thread.ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {//동기화 메소드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+": methodA 작업 실행");
		
		/*
		 * notify 부분을 주석처리하면 스레드A와 스레드B가 제각각 동작하는걸 볼 수 있다.
		 * 기다리는 스레드는 웨잇에서 탈출하고 동작시작한다. 
		 */
		notify();//다른 스레드를 실행 대기 상태로 만듦
		try {
			wait();//자신의 스레드는 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
		}
	}

	public synchronized void methodB() { //동기화 메소드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+": methodB 작업 실행");
		notify();//다른 스레드를 실행 대기 상태로 만듦
		try {
			wait();//자신의 스레드는 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
		}
	}
	}


