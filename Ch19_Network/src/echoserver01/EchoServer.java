package echoserver01;

import java.net.ServerSocket;

public class EchoServer {
	public static void main(String[] args) {
		final int PORT = 9000;
		try {
			//이 서버 프로그램이 돌아가는 환경의 ip 주소를 자동으로 소켓에 할당
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("Client 접속을 기다립니다.....");
			
			
			
		}
		
	}

}
