package ch06.method01;


	
	

	//1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
	//작은 값을 반환하는 메서드를 작성하고 사용하세요
	public class abc {
		public static int max(int b0, int b1) {
			int _max = 0;
			if(b0 > b1)
				_max = b0;
			else
				_max = b1;
			
			return _max;
		}
		
		public static int min(int a0, int b1) {
			int _min = 0;
			if(a0 > b1)
				_min = b1;
			else
				_min = a0;
			
			return _min;
		}
		
		public static void main(String[] args) {
			int a0 = 100, a1 = 200;
			int result = max(a0, a1);
			System.out.println("큰 값은 " + result);
			
			int a = 99, b = 22;
			int result1 = min(a, b);
			System.out.println("작은 값은 " + result1);
		}
	}

	

