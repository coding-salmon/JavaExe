package sec06.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{
		OutputStream os = new FileOutputStream("D:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os,"UTF-8");
		//FileOutputStream에 OutputStreamWriter 보조 스트림을 연결
		writer.write(str);
		writer.flush();
		//OutputStreamWriter 보조 스트림을 이용해서 문자 출력
		writer.close();
	}
	public static String read() throws Exception {
		InputStream is = new FileInputStream("D:/Temp/test.txt");
		Reader reader = new InputStreamReader(is,"UTF-8");
		//FileInputStream에 InputStreamReder 보조 스트림을 연결
		char[]data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		//char 배열에서 읽은 문자수만큼 문자열로 변환
		return str;
	}

}
