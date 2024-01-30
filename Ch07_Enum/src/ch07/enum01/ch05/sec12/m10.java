package ch07.enum01.ch05.sec12;

public class m10 {

	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-"+lower);
				if(lower=='z') {
					break Outter;
				}
			}
		}
		System.out.println("종료");
	}

}
