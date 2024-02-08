package study.ex01;

public class S02 {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		System.out.println(strVar1 == strVar2);
		
		String strVar3 = new String("홍길동");
		
		System.out.println(strVar1 == strVar3);
		System.out.println(strVar1.equals(strVar3));
		
	}

}
