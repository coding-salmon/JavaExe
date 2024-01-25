package ch02_orderOperator13;

import java.util.Arrays;

public class OrderOperator {

	public static void main(String[] args) {
		int result = 10 + 50 *3;
		System.out.println(result);
		
		result = (10+50)*3;
				System.out.println(result);
		
				
	    int[] num = {1,2,3,4,5,6,7,8,9};
	    
	    System.out.println(num[2]);
	    int length= num.length;
	    num[2] = 100;
	    System.out.println(num[2] +","+ num[3]+","+ num[4]);
	    System.out.println();
	}

}
