package ch07.enum01.ch05.sec12;

public class m4 {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		System.out.println("현재시간"+ time);
		
		switch(time) {
		case 9:
			System.out.println("출근");
		default :
			System.out.println("외근중");
		}
	}
}
