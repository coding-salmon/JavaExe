package sec01;

public class GenericExample {
	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<String>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		//Box를 생성할 때 타입 피라미터 T 대신 String으로 대체
		
		// Box<Integer> box2 = new Box<InTeger>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	
	}

}