package ch10.hashmap04;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
	public static void testInstanceOf() {
		RegularEmployee regEmp = 
				new RegularEmployee("1111", "홍길동", 7000, 3000);
		Employee emp = regEmp;
		
		if(emp instanceof RegularEmployee)
			System.out.println("emp는 RegularEmployee의 객체이거나"
								+ " 자식 객체입니다.");
		if(emp instanceof TempEmployee)
			System.out.println("emp는 TempEmployee의 객체이거나"
								+ " 자식 객체입니다.");
		if(emp instanceof PartTimeEmployee)
			System.out.println("emp는 ParTimeEmployee의 객체이거나"
								+ " 자식 객체입니다.");		
	}
	public static void main(String[] args) {
		//List<String> em = new ArrayList<String>();
		
		
		
	EmployeeManager em = new EmployeeManager();
		em.run();
		
//		testInstanceOf();
	}
}
