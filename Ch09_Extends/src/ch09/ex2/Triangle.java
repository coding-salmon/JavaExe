package ch09.ex2;

public class Triangle {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) { 
		this.base = base;
		this.height = height;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double calculateArea() {
		return (base*height) /2.0;
	}
	public void showResult() {
		System.out.println("밑변:" + base);
		System.out.println("높이:" + height);
		System.out.println("넓이:" + calculateArea());
	}
	
	
}
