package ch09.ex2;

public class TriangleMain {
	
	public static void main(String[] args) {
	
		Triangle triangle = new Triangle(5.0,7.0);
		
		triangle.showResult();
		
		triangle.setBase(7.0);
		triangle.setHeight(8.0);
		
		triangle.showResult();
		
		
	}
}
