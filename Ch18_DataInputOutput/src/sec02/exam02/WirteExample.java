package sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WirteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("D:/Temp/test2.db");
			//데이터 도착지를 test2.db 파일로 하는 바이트 출력 스트림 생성
			
			byte[] array = {10,20,30};
			
			os.write(array); //배열의 모든 바이트를 출력
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
			
	

