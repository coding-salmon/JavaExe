package ch14.thread.ch14.sec07.exam03;

public class PrintThread extends Thread {

	
	public void run() {
		
		while(true) {
			System.out.println("실행 중"); //stop 필드값에 따라 반복 여부 결정
			if(Thread.interrupted()) {
				break;
			} //interrupt() 메소드가 호출되었다면 while문을 빠져나감
		}
		
		System.out.println("리소스 정리"); //리소스 정리
		System.out.println("실행 종료");
	}

}

