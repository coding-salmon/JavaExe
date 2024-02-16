package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.json.JSONObject;

public class Server {
	public static void main(String[] args) {
		
		//사이렌오더 서버 포트 9001
		final int PORT = 9001;
		Hashtable<String, Socket> clientHt = new Hashtable<>();
		SalesDatabase salesDatabase = new SalesDatabase();
		
		
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			String mainThreadName = Thread.currentThread().getName();
			
		while(true) {
			System.out.printf("[서버-%s] Client의 접속을 기다립니다...\n", mainThreadName);
			Socket socket = serverSocket.accept();
			WorkerThread wt = new WorkerThread(socket, clientHt, salesDatabase);
			wt.start();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			salesDatabase.close();
		}
	}
}
class WorkerThread extends Thread{
	private Socket socket;
	private Hashtable<String, Socket> ht;
	private SalesDatabase salesDatabase;
	
	public WorkerThread(Socket socket, Hashtable<String, Socket> ht,
			SalesDatabase salesDatabase) {
		this.socket =socket;
		this.ht = ht;
		this.salesDatabase = salesDatabase;
	}
	
	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.printf("<서버-%s> %s로부터 접속했습니다.\n", getName(), inetAddr.getHostAddress());
			
			InputStream in = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			
			
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				JSONObject packetObj = new JSONObject(line);
				processPacket(packetObj);
			}
		} catch(Exception e) {
			System.out.printf("<서버-%s>%s\n", getName(), e.getMessage());
		}finally {
			try {
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void processPacket(JSONObject packetObj) throws IOException{
		JSONObject ackObj = new JSONObject();
		String cmd = packetObj.getString("cmd");
		
		//id등록요청
		if(cmd.equals("ID")) {
			String id = packetObj.getString("id");
			ht.put(id, this.socket);
			
			ackObj.put("cmd", "ID");
			ackObj.put("ack", "ok");
			
			String ack = ackObj.toString();
			
			OutputStream out = this.socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
		}
		
		//커피주문 요청
		else if(cmd.equals("ORDER")) {
			int coffeeId = packetObj.getInt("coffeeId");
			int quantity = packetObj.getInt("quantity");
			String id = packetObj.getString("id");
			
			double totalPrice =processOrder(coffeeId, quantity);
			
			salesDatabase.saveSales(id, getCoffeeName(coffeeId), quantity, totalPrice);
			
			ackObj.put("cmd", "ORDER_ACK");
			ackObj.put("totalPrice", totalPrice);
			String ack = ackObj.toString();
			
			OutputStream out = this.socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
			
			salesDatabase.getSalseInfo();
		}
		
		//접속자 전체한테 채팅 메시지 전송
		else if(cmd.equals("ALLCHAT")) {
			String id = packetObj.getString("id");
			String msg = packetObj.getString("msg");
			
			ackObj.put("cmd", "ALLCHAT");
			ackObj.put("ack", "ok");
			
			String ack = ackObj.toString();
			
			OutputStream out = this.socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
			
			//특정 yourid 사용 클라이언트에 전송 패킷
			JSONObject broadObj = new JSONObject();
			broadObj.put("cmd", "BROADCHAT");
			broadObj.put("id", id);
			broadObj.put("msg",msg);
			String strBroad = broadObj.toString();
			
			//전체 전송
			broadcast(strBroad);
			
		}
		//특정 id 대상한테 1:1 채팅
		else if(cmd.equals("ONECHAT")) {
			String id = packetObj.getString("id");
			String yourid = packetObj.getString("yourid");
			String msg = packetObj.getString("msg");
			
			ackObj.put("cmd", "ONECHAT");
			ackObj.put("ack", "ok");
			
			String ack = ackObj.toString();
			
			OutputStream out = this.socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
			
			JSONObject uniObj = new JSONObject();
			uniObj.put("cmd", "UNICHAT");
			uniObj.put("id", id);
			uniObj.put("msg", msg);
			String strUni = uniObj.toString();
			
			unicast(strUni, yourid);
		}
	}
	
	private void unicast(String packet, String yourid) throws IOException{
		Socket sock = (Socket) ht.get(yourid);
		
		OutputStream out = sock.getOutputStream();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
		pw.println(packet);
		pw.flush();
	}
	
	private void broadcast(String packet) throws IOException{
		Set<String> idSet = ht.keySet();
		Iterator<String> idIter = idSet.iterator();
		while(idIter.hasNext()) {
			String id = idIter.next();
			Socket sock = (Socket) ht.get(id);
			
			if(sock==this.socket)
				continue;
			
			OutputStream out = sock.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(packet);
			pw.flush();
		}
		
		//주문 처리 메소드
		private double processOrder(int coffeeId, int quantity) {
		
			double coffeePrice = getCoffeeprice(coffeeId);
		}
	}
	
}












