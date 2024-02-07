package ch10.Linkedlist04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ch10.hashmap02.Employee;
import ch10.hashmap02.PartTimeEmployee;
import ch10.hashmap02.RegularEmployee;
import ch10.hashmap02.TempEmployee;

public class EmployeeManager {
	private final int EMP_NUM = 100;	// 100명 사원이 최대
	// Employee의 자식객체들을 저장
	private Map<String, Employee> empArr = new HashMap<>();
	//private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0;	// 저장된 사원객체 수, 다음 사원이 저장될 index
	private Scanner sc = new Scanner(System.in);
	
	
	private void modifyEmployee(Employee emp) { //사번으로 수정하는 메서드
		Employee emp = empMap.get(empno);
		if (emp != null) {
		if (emp instanceof RegularEmployee) {
	        RegularEmployee = (RegularEmployee) emp;
			System.out.print("새로운 이름 입력 >> ");
	        String newName = sc.next();
	        regEmp.setName(newName);
	        
	        System.out.print("새로운 연봉 입력 >> ");
	        int newYearSalary = sc.nextInt();
	        regEmp.setYearSalary(newYearSalary);
	        
	        System.out.print("새로운 보너스 입력 >> ");
	        int newBonus = sc.nextInt();
	        regEmp.setBonus(newBonus);
	        
	        System.out.println("정규직 사원 정보가 수정되었습니다.");
	    } else if (emp instanceof TempEmployee) {
	        System.out.print("새로운 이름 입력 >> ");
	        String newName = sc.next();
	        tempEmp.setName(newName);
	        
	        System.out.print("새로운 연봉 입력 >> ");
	        int newYearSalary = sc.nextInt();
	        ((TempEmployee) emp).setYearSalary(newYearSalary);
	        
	        System.out.print("새로운 계약기간 입력 >> ");
	        int newHireYear = sc.nextInt();
	        temp.setHireYear(newHireYear);
	        
	        System.out.println("임시직 사원 정보가 수정되었습니다.");
	    } else if (emp instanceof PartTimeEmployee) {
	        PartTimeEmployee partEmp = (PartTimeEmployee) emp;
	    	System.out.print("새로운 이름 입력 >> ");
	        String newName = sc.next();
	        ((PartTimeEmployee) emp).setName(newName);
	        
	        System.out.print("새로운 일당 입력 >> ");
	        int newDailyPay = sc.nextInt();
	        ((PartTimeEmployee) emp).setDailyPay(newDailyPay);
	        
	        System.out.print("새로운 근무일 입력 >> ");
	        int newWorkDay = sc.nextInt();
	        ((PartTimeEmployee) emp).setWorkDay(newWorkDay);
	        
	        System.out.println("일용직 사원 정보가 수정되었습니다.");
	    } else {
	        System.out.println("해당 사번을 가진 사원이 존재하지 않습니다.");
	}
	}
	
	private void deleteEmployee(String empno) {
		 Employee emp = empArr.get(empno);
		    if (emp != null) {
		        empArr.remove(empno);
		        System.out.println("사원 정보가 삭제되었습니다.");
		    } else {
			System.out.println("해당 사번을 가진 사원이 존재하지 않습니다.");
		}
		
	}
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 사번으로 검색/수정/삭제");
		System.out.println("9. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp = 
				new RegularEmployee(empno, name, yearSalary, bonus);
		return emp;
	}
	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp = 
				new TempEmployee(empno, name, yearSalary, hireYear);
		return emp;
	}
	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = 
				new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}
	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;
		
		if(this.numOfEmp < EMP_NUM) {
			String empno = emp.getEmpno();
			this.empArr.put(empno, emp);
			this.numOfEmp++;
			isSave = true;
		}else {
			isSave = false;
		}
		
		return isSave;
	}
	private void viewAllEmployeeInfo() {
		for(Employee emp : this.empArr.values()) {
			emp.showEmployeeInfo();
		}
	}
	private void viewRegEmployeeInfo() {
		for(Employee emp : this.empArr.values()) {
			if(emp instanceof RegularEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewTempEmployeeInfo() {
		for(Employee emp : this.empArr.values()) {
			if(emp instanceof TempEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewPartTimeEmployeeInfo() {
		for(Employee emp : this.empArr.values()) {
			if(emp instanceof PartTimeEmployee)
				emp.showEmployeeInfo();
		}
	}
	private Employee search(String empno) {
	    for (Map.Entry<String, Employee> entry : empArr.entrySet()) {
	        if (entry.getKey().equals(empno)) {
	            return entry.getValue();
	        }
	    }
	    return null; // 해당 사번을 가진 사원이 없을 경우 null 반환
	}
	
	private void empnoSearch() {
		System.out.println("사번으로 검색/수정/삭제 할수있습니다. 사번입력>>");
		String searchEmpno = sc.next();
		Employee emp = search(searchEmpno);
		
		if(emp != null) {
			System.out.println("사번"+searchEmpno+"에 해당하는 사원정보:");
			if(emp instanceof RegularEmployee) {
				((RegularEmployee) emp).showEmployeeInfo();
			} else if (emp instanceof TempEmployee) {
		        ((TempEmployee) emp).showEmployeeInfo();
		    } else if (emp instanceof PartTimeEmployee) {
		        ((PartTimeEmployee) emp).showEmployeeInfo();
		    }
			System.out.println("1.수정 2.삭제 3 돌아가기");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				modifyEmployee(emp);
				break;
			case 2:
				deleteEmployee(searchEmpno);
				break;
			case 3:
				return;
			default:
				System.out.println("번호를 다시 입력하셨습니다.");
				break;
			}
		}else {
			System.out.println("해당 사번을 가진 사원이 존재하지 않습니다.\n");
		}
		
		
	
			
				
			}
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO:
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
				viewPartTimeEmployeeInfo();
				break;
			case EmpMenu.EMPNO_SEARCH:
				empnoSearch();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			
			// emp객체가 존재한다면
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}
		}
		System.out.println("Program Exit...");
	}
}






