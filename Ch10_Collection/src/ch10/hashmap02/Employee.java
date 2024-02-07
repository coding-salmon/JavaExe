package ch10.hashmap02;

public abstract class Employee {
	protected String empno;		// 사번
	protected String name;		// 이름
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	public String getEmpno() {
		return empno;
	}
	
	public void showEmployeeInfo() {
		System.out.println("----------------------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}
	public abstract double getMonthPay();	// 추상메서드
	
		
	}

	
	

