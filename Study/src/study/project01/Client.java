package study.project01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		//서버 연결중
		
		String address = "127.0.0.1"; //server ip주소
		int port = 8888;	//server 포트 번호 변수
		InputStream is = null; 
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//서버 연결
			System.out.println("서버에 연결중입니다.");
			Socket socket = new Socket(address, port);
			System.out.println("채팅 서버에 접속하였습니다.");
			
			//채팅 준비
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와의 채팅을 시작합니다.");
			
			while(true) {
				//데이터받기
				String recMsg = dis.readUTF();
				System.out.printf("서버(상대) : %s\n", recMsg);
				
				//데이터보내기
				System.out.println("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
