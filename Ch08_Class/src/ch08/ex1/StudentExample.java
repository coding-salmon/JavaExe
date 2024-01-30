package ch08.ex1;

public class StudentExample {
	
	public static void viewInfo(Student student) {
		System.out.println("이름: "+ student.StName);
		System.out.println("나이: "+ student.StAge);
		System.out.println("학점: "+ student.StScore);
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.StName ="홍길동";
		student.StAge = 24;
		student.StScore = 4.5;
		
		viewInfo(student);
		
		
	}

}
