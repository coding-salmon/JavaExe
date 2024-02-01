package ch08.class09.Ex5;

public class Rectangle {
	private int x1, y1, x2, y2;
	
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 =x1;
		this.y1 =y1;
		this.x2 =x2;
		this.y2 =y2;
	}
	
	public int square() {
		int width = Math.abs(x2-x1);
		int height = Math.abs(y2-y1);
		return width*height;
	}
	
	public void show() {
		System.out.println("좌표:(" +x1 +"," + y1 +")" +
								"(" +x2 +"," + y2 +")");
		
		System.out.println("넓이:" + square());
		
	}
	public boolean equals(Rectangle r) {
		return this.x1 == r.x1 &&
				this.y1 == r.y1 &&
				this.x2 == r.x2 &&
				this.y2 == r.y2;
	}

}
