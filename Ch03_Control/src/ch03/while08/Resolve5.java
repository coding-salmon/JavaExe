package ch03.while08;

public class Resolve5 {

	public static void main(String[] args) {
		int i =0;
				while (i<9) {
		i++;
		//if(i == 2 || i==4 || i==6 || i== 8) {
			//continue;}
		
		if((i%2)==0) {
		continue;
		}
		
		System.out.println((i+1) + ",");
		}
		

	}
}


