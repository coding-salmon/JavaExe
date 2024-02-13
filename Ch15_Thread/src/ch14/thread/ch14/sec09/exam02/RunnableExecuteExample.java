package ch14.thread.ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
	public static void main(String[] args) {
		//1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length;i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "신상품 입고";
		}
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		//스레드풀은 5개의 스레드를 보유하고있다.
		
		
		
		//이메일을 보내는 작업 생성 및 처리 요청
		for(int i=0;i<1000;i++) {
			final int idx =i;
			//스레드풀의 스레드에 함수 지정해줌
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("["+thread.getName()+"]" +from + "==>" +to
							+":"+content);
					//어떤 쓰레드가 어떤 이메일을 처리했는지 알 수 있도록 출력
				}
			});	
			}
		//ExecutorService 종료
		executorService.shutdown();
		}
}
	
	
