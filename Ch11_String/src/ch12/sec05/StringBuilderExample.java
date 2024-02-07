package ch12.sec05;

import java.util.ArrayList;
import java.util.List;

class Human{
	private String name;
	private int age; 
	private float height;
	private float weight;
	
}
public class StringBuilderExample {
	public class MyStringBuilder{
		private List<Character> chList = new ArrayList<>();
		
		public MyStringBuilder append(String str) {
			char[] chArr = str.toCharArray();
			for(char ch : chArr)
				/* Boxing
				 * 기본타입 / 지역변수 ch는 스택에 존재
				 * chList.add(ch)
				 */
				chList.add(ch);
			
			return this;
			}
		public MyStringBuilder insert(int idx, String str) {
			char[] chArr= str.toCharArray();
			for(int i=idx;i<idx+str.length();i++)
				chList.add(i, chArr[i]);
			
			return this;
		}
		}
	
	public static void main(String[] args) {
		
		/* StringBuilder는 내부에 char[]로 문자열을 저장한다.*/
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
		
		String data1 = new StringBuilder()
				.append("def")
				.insert(0, "abc")
				.delete(0, 5)
				.toString();
		System.out.println(data1);
		
		
	}

}
