package ch08.class09.Ex5;

public class RectangleMain {
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		
		rect1.set(1, 4, 5, 6);
		rect2.set(1, 4, 5, 6);
		
		
		rect1.show();
		rect2.show();
		
		if(rect1.equals(rect2)) {
			System.out.println("동일한좌표입니다.");
		} else {
			System.out.println("다른좌표이니다.");
		}
		
		
	}

}
