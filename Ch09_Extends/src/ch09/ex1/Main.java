package ch09.ex1;

public class Main {
	public static void main(String[] args) {
	int a=30 ,b=40;
	
	Add add = new Add();
	add.setValue(a, b);
	add.Calculate();
	
	Sub sub = new Sub();
	sub.setValue(a, b);
	sub.Calculate();
	
	Mul mul = new Mul();
	mul.setValue(a, b);
	mul.Calculate();
	
	Div div = new Div();
	div.setValue(a, b);
	div.Calculate();
	
	

	
	
	
	}
	
	

}
