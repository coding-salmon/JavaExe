package ch10.collection01.ch15.sec03.exam01.exam02;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode()+ age; //name과 age 값이 같으면 동일한 hashCode가 리턴됨
	}
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age); 
			//name과 age 값이 같으면 true가 리턴됨
		}else {
			return false;
		}
	}
}
