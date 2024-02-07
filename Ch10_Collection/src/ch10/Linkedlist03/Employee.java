package ch10.Linkedlist03;

public abstract class Employee {
	protected String empno;		// 사번
	protected String name;		// 이름
	
	public String getEmpno() {
        return empno;
	}
	public String setName(String newName) {
		return newName;
	}
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	public void showEmployeeInfo() {
		System.out.println("----------------------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}
	public abstract double getMonthPay();	// 추상메서드
	 {
		// TODO Auto-generated method stub
		
	}
}
