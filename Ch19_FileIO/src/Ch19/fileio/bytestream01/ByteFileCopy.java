package Ch19.fileio.bytestream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 파일입출력 3단계 (Device통신 , Network통신도 동일)
 * - 특히 Linux는 사용하는 함수도명도 동일하다.
 * 1) 스트림 생성(create, open)
 * 2) 쓰기 / 읽기 (write/read, send/recv)
 * 3) 스트림종료 (close)
 * 
 */
public class ByteFileCopy {
	public static void main(String[] args) throws IOException {
		//스트림 생성
		//putty.exe 파일과 연결된 입력 스트림 생성
		InputStream in =new FileInputStream("putty.exe");
		//putty.exe 를 푸티.exe로 저장할 출력 스트림 생성
		OutputStream out = new FileOutputStream("푸티.exe");
		int copyByte = 0;
		int bData;
		long stime = System.currentTimeMillis();
		// 스트림 통해 입출력
		while(true) {
			bData = in.read(); //1byte씩 읽는다.
			if(bData ==-1) //더이상 읽을 것이 없으면
				break;
			out.write(bData);
			copyByte++;
			
		}
		long etime = System.currentTimeMillis();
		//스트림 연결 종
		in.close();
		out.close();
		System.out.println((etime-stime));
		System.out.println(copyByte);
		
		
	}

}
