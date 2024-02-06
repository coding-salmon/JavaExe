package ch11_string;

public class StringCompare {
	public static void main(String[] args) {
		String str0 = "Hello, java";
		String str1 = "Hello, java";
		String str2 = new String("Hello, java");
		/*
		 * 같은 공간의 객체인가를 비교
		 */
		// str0 과 str1은 같은 객체를 가르키고, str2는 다른 객체이다
		if(str0 == str1)
			System.out.println("str0은 str1과 같습니다.");
		else
			System.out.println("str0은 str1과 다릅니다.");
		if(str0 == str2)
			System.out.println("str0은 str2과 같습니다.");
		else
			System.out.println("str0은 str2과 다릅니다.");

		System.out.println("--------------------");
		
		if(str0.equals(str1))
			System.out.println("str0은 str1과 같습니다.");
		else
			System.out.println("str0은 str1과 다릅니다.");
		if(str0.equals(str2))
			System.out.println("str0은 str2과 같습니다.");
		else
			System.out.println("str0은 str2과 다릅니다.");


		
		
		
		
		/*
		 *  Java의 String은 그래서 문자열 내용을 비교할때
		 *  ==를 사용하지 않고 equals를 사용한다. 
		 */
	
	}
}
