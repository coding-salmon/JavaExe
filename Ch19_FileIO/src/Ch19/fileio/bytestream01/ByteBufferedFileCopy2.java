package Ch19.fileio.bytestream01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ibyte씩 파일에서 읽어서 저장하는 방식은 너무느림
 * ex. 퍼티 파일기준 8초
 * 이것을 개선하려면 3가지
 * 1. 한번에 많이 읽기
 * 2. jdk 입력 버퍼 클래스를 사용해서 미리 읽어들인 것을 1byte씩 가져오고 다시출력 
 * 버퍼 클래스에 1byte씩 저장하면 알아서 파일에 한
 * 1번과2번 합치기 
 * 
 * 물류시스템과 동일
 * 하드디스크 (물류센터)
 * App프로세스 (아파트)
 * 버퍼클래스 (택배차량)
 * 
 */
public class ByteBufferedFileCopy2 {
	public static void main(String[] args) throws IOException {
		//입력 스트림
		InputStream in = new FileInputStream("putty.exe");
		//입력 스트림과 연결된 저장소(버퍼) 필터 클래스
		BufferedInputStream bin = new BufferedInputStream(in);
		
		//출력 스트림
		OutputStream out = new FileOutputStream("퍼티티티.exe");
		//출력 스트림과 연결된 저장소(버퍼) 필터 클래스
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		// 1byte씩 입출력을 하지만 버퍼필터 클래스를 쓴다.
		int copyByte =0;
		int bData;
		long stime = System.currentTimeMillis();
		while(true) {
			bData = bin.read();
			if(bData==-1)
				break;
			bout.write(bData);
			copyByte++;
			
		}
		long etime = System.currentTimeMillis();
		
		System.out.println((etime-stime));
		System.out.println(copyByte);
	}
}
