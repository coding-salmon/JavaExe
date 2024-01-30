package ch07.enum01.ch05.sec12;

public class m6 {

	public static void main(String[] args) {
		for(int dan = 2; dan<=9; dan++) {
			System.out.println(dan+"단");
			for(int n=1;n<=9;n++) {
				System.out.print(dan+"*"+n+"=>>"+dan*n);
				System.out.println();
			}
		}

	}

}
