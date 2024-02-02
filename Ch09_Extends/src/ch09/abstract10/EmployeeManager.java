package ch09.abstract10;

import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100; // 100명 사원이 최대라고 가정함
	// Employee의 자식객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0; //저장된 사원객체 수
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println(" [ 사원 선택 ] ");
		System.out.println("1. 정규직 " );
		System.out.println("2. 임시직 ");
		System.out.println("3. 일용직 " );
		System.out.println("4. 정규직 정보만 보기 " );
		System.out.println("5. 임시직 정보만 보기 " );
		System.out.println("6. 일용직 정보만 보기 " );
		System.out.println("7. 전체정보보기 " );
		System.out.println("8. 종료 ");
		System.out.println(" 번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	
	
	private RegularEmployee createregularEmployee() {
		System.out.print("사번>>");
		String empno =sc.next();
		System.out.print("이름>>");
		String name =sc.next();
		System.out.print("연봉>>");
		int yearSalary =sc.nextInt();
		System.out.print("보너스>>");
		int bonus =sc.nextInt();
		RegularEmployee emp = 
				new RegularEmployee(empno, name, yearSalary, bonus);
		return emp;
	}
	private TempEmployee createTempEmployee() {
		System.out.print("사번>>");
		String empno =sc.next();
		System.out.print("이름>>");
		String name =sc.next();
		System.out.print("연봉>>");
		int yearSalary =sc.nextInt();
		System.out.print("계약기간>>");
		int hireYear =sc.nextInt();
		TempEmployee emp =
				new TempEmployee(empno, name, yearSalary,hireYear);
		return emp;
		
	}
	private PartTimeEmployee creatPartTimeEmployee() {
		System.out.print("사번>>");
		String empno =sc.next();
		System.out.print("이름>>");
		String name =sc.next();
		System.out.print("일당>>");
		int dailyPay =sc.nextInt();
		System.out.print("일한 일수>>");
		int workDay =sc.nextInt();
		PartTimeEmployee emp =
				new PartTimeEmployee(empno, name, dailyPay,workDay);
		return emp;
		
	}
	private boolean saveEmployee(Employee emp) {
		boolean isSave =true;
		
		if(this.numOfEmp < EMP_NUM) {
			this.empArr[this.numOfEmp] = emp;
			this.numOfEmp++;
			isSave = true;
		}else {
			isSave = false;
		}
		return true;
	}
	private void viewAllEmployeeInfo() {
		for(int i =0; i<this.numOfEmp;i++) {
			this.empArr[i].showEmployeeInfo();
		}
	}
		private void viewRegEmployeeInfo() {
			for(int i =0; i<this.numOfEmp;i++) {
				if(empArr[i] instanceof RegularEmployee) { 
					{empArr[i].showEmployeeInfo();
				}
			}
		
	}
		}
		private void viewTemEmployeeInfo() {
			for(int i =0; i<this.numOfEmp;i++) {
				if(empArr[i] instanceof TempEmployee) { 
					{empArr[i].showEmployeeInfo();
			}
		
	}
			}
		}
		private void viewParEmployeeInfo() {
			for(int i =0; i<this.numOfEmp;i++) {
				if(empArr[i] instanceof PartTimeEmployee) { 
					{empArr[i].showEmployeeInfo();
			}
		
	}
			}
		}
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			switch(selNum) {
			
			case EmpMenu.REG_EMP:
				emp =createregularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp=createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp=creatPartTimeEmployee();
				break;
			case EmpMenu.REG_INFO:
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
				viewTemEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
				viewParEmployeeInfo();
				break;
			case EmpMenu.ALL_INFO:
				viewAllEmployeeInfo();
				break;
			case EmpMenu.EXIT:
				emp=null;
				isRun = false;
				break;
			default:
				emp=null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
		}
		
	}
		System.out.println("Program Exit...");
	}
}

