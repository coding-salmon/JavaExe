package ch08.ex5;

public class ComputerExample {
	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		int result1 = myCom.sum(1,2,3,4,5,6,7,8,9);
		System.out.println("result1:" + result1);
		
		
		int[] values = {1,2,3,4,5,6,7,8,9};
		int result2 = myCom.sum(values);
		System.out.println(result2);
		
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println(result4);
	}

}
