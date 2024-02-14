package sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "D:/Temp/test.jpg";
		String targetFileName = "D:/Temp/test2.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		//입출력 스트림 생성
//		byte[] data = new byte[1024]; //읽은 바이트를 저장할 배열 생성
//		while(true) {
//			int num = is.read(data); //최대 1024바이트를 읽고 배열에 저장, 읽은 바이트는 리턴
//			if(num==-1)break; //파일을 다읽으면 while 문 종료
//			os.write(data,0,num); //읽은 바이트 수만큼 출력
//		}
		
		is.transferTo(os); //17~22라인을 한줄로 대체가능함
		
		
		os.flush(); //내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
		os.close();
		is.close();
		System.out.println("복사가 잘 되었습니다.");
	
	}
		
		
		
	}


