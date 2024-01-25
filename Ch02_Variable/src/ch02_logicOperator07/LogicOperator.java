package ch02_logicOperator07;

public class LogicOperator {

	public static void main(String[] args) {
		boolean logic;
		// and 연산
		logic = true && true;
		System.out.println("true && true = >" + logic);
		logic = true && false;
		System.out.println("true && false = >" + logic);
		
		//Or 연산
		logic = true || true;
		System.out.println("true || true = >" + logic);
		logic = true || false;
		System.out.println("true || false = >" + logic);
		
		//Xor
		logic = true ^ true;
		System.out.println("true ^ true = >" + logic);
		logic = false ^ false;
		System.out.println("false ^ false =>" + logic);
		logic = true ^ false;
		System.out.println("true ^ false =>" + logic);
		
		// Not 연산
		logic = !true;
		System.out.println("!true = >" + logic);
		logic = !false;
		System.out.println("!false = >" + logic);
		

	}

}
