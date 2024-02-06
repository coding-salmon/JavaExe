package ch10.collection01.ch15.sec03.exam01.exam02;

/*
 * Member객체의 내용(이름,나이)로 객체가 같은지 다른지 비교하기 위해서
 * Object로부터 상속받은 hashCode()와 equals()를 overriding 해야 한다.
 * overriding하지 않으면 각각 객체의 해시값과 객체의 주소를 가지고 비교하지만
 * 아래처럼 overriding하면 객체내의 필드 내용으로 비교한다.
 * 
 * 그러므로 주소록이나 이런 데이터를 저장할 때는 아래처럼 하는 것이 필요하다.
 */
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
//		Member target = null;
//		if(obj instanceof Member) {
//			target = (Memer)obj;
//		}
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age); 
			//name과 age 값이 같으면 true가 리턴됨
		}else {
			return false;
		}
	}
}
