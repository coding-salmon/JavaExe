package ch09.ex1;

public abstract class Calc {
	protected int a,b;
	
	public void setValue(int _a, int _b) {
		this.a = _a;
		this.b = _b;
	}
	
	public abstract int calculate();

}
