package ch05.array06;

import java.util.Arrays;

public class ex2 {
	public static void main(String[] args) {
		
		String[] names = new String[]{"1","2",null};
		
		String[] names2 = Arrays.copyOf(names, 5);
		
			for(String name: names2) {
			System.out.println(name);
		}
	}

}
