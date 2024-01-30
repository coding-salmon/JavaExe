package ch07.enum01.ch05.sec12;

public class m9 {

	public static void main(String[] args) {
		while(true) {
			int num =(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num ==6) {
				break;
			}
		}
		System.out.println("당첨");
		
	}

}
