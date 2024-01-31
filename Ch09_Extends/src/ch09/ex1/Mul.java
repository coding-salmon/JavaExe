package ch09.ex1;

public class Mul {
	private int a;
	private int b;
	
	
	
	public void setValue(int _a, int _b) {
		a = _a;
		b = _b;
		
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public void Calculate() {
		int result = a*b;
		System.out.println("Mul:" + result);
		
		
	
}
}
