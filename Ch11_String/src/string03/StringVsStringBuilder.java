package string03;


// https : // 12bme.tistory.com/42

/*
 * String : immutable(불편)
 * StringBuilder : mutable (변함)
 * StringBuffer : mutable(변함), 멀티스레드 동기화 처리 
) */
public class StringVsStringBuilder {
	
	public static long getStringSpeed(){
		
		String str = "";
		long start = System.nanoTime();
		for(int i=0;i<26;i++)
			str += (char)('a' + i);
		long end = System.currentTimeMillis();
		System.out.println("String: " + str);
		return end - start;
	}
	public static long getStringBilderspeed() {
		StringBuilder strBuilder = new StringBuilder(26);
		long start = System.nanoTime();
		for(int i=0;i<26;i++)
			strBuilder.append((char)('a' + i));
		long end = System.currentTimeMillis();
		System.out.println("strBuilder: " + strBuilder.toString());
		return end - start;
	}
	
	public static void main(String[] args) {
		long strMillis = getStringSpeed();
		long strBuilderMillis = getStringBilderspeed();
		System.out.println("String시간" + strMillis);
		System.out.println("Stringuilder" + strBuilderMillis);
	}
}
	
	
	
	
	
	
	
	
