package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class Client {
	static boolean isPending = false;
	
	public static void main(String[] args) {
		final String IP = "127.0.0.1";
		final int PORT = 9001;
		String id = "";
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		Scanner scan = null;
		
		try {
			
			socket = new Socket (IP, PORT);
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			ReceiveThread rt = new ReceiveThread(br);
			rt.start();
			
			id = sendId(scan, pw);
			Thread.sleep(300);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void sendAllChat (Scanner sc, PrintWriter pw, String id) {
		boolean isRun = true;
		while(isRun) {
			System.out.println("전송 메세지 (quit는 종료)>>");
			String msg = sc.nextLine();
			if(msg.equals("quit")) {
				isRun = false;
				break;
			}
			JSONObject packetObj = new JSONObject();
			packetObj.put("cmd", "ALLCHAT");
			packetObj.put("id", id);
			packetObj.put("msg", msg);
			
			String packet = packetObj.toString();
			
			pw.println(packet);
			pw.flush();
		}
	}
	
	public static String sendId(Scanner sc, PrintWriter pw) {
		System.out.println("당신의 id 입력 >>");
		String id = sc.nextLine();
		
		JSONObject idObj = new JSONObject();
		idObj.put("cmd", "ID");
		idObj.put("id", id);
		
		String packet = idObj.toString();
		pw.println(packet);
		pw.flush();
		
		return id;
	}

}

class ReceiveThread extends Thread{
	private BufferedReader br = null;
	
	public ReceiveThread(BufferedReader br) {
		this.br =br;
	}
	@Override
	public void run() {
		try {
			while(true) {
				String packet = br.readLine();
				if(packet==null)
					break;
				
				JSONObject packetObj = new JSONObject(packet);
				processPacket(packetObj);
				Client.isPending =false;
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void processPacket(JSONObject packetObj) {
		String cmd = packetObj.getString("cmd");
		if(cmd.equals("ID")) {
			String ack = packetObj.getString("ack");
			if(ack.equals("ok"))
				System.out.println("[서버 응답] ID 등록 성공");
			else if(ack.equals("fail"))
				System.out.println("[서버 응답] ID 등록 실패");
			else
				System.out.printf("[서버 응답] ID 등록 %s\n", ack);
		}
	
	else if(cmd.equals("ALLCHAT")) {
		String ack = packetObj.getString("ack");
		if(ack.equals("ok"))
			System.out.println("[서버 응답] 채팅 전송 성공");
		else if(ack.equals("fail"))
			System.out.println("[서버 응답] 채팅 전송 실패");
		else
			System.out.printf("[서버 응답] 채팅 전송 %s\n", ack);
		}
		//서버의 1:1 채팅에 대한 응답
	else if(cmd.equals("ONECHAT")) {
		
	}
	else if(cmd.equals("BROADCHAT")) {
		String id = packetObj.getString("id");
		String msg = packetObj.getString("msg");
		System.out.printf("채팅 메세지 [%s] %s\n", id,msg);
	}
	else if(cmd.equals("UNICHAT")) {
		
	}
}
}
