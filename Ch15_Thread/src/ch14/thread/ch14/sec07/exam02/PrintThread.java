package ch14.thread.ch14.sec07.exam02;

public class PrintThread extends Thread {

	
	public void run() {
		try {
		
		while(true) {
			System.out.println("실행 중"); //stop 필드값에 따라 반복 여부 결정
			Thread.sleep(1); //일시 정지를 만듦 (InterruptedException이 발생할수있도록)
		}
		}catch(InterruptedException e) {
		}
		System.out.println("리소스 정리"); //리소스 정리
		System.out.println("실행 종료");
	}

}

