package sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new FileReader("src/sec07/exam02/ReadLineExample.java")
		); // FileReader 에 BufferedReader 보조 스트림 연결
		
		int lineNo = 1; 
		while (true) {
			String str = br.readLine(); //1행에 읽음
			if(str == null)break; // 더이상 읽을 내용이 없으면 while 문 종료
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
				
		br.close(); //BufferedReader를 닫으면 연결된 FileReader도 닫힘
		
	}

}
