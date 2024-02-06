package ch10.collection01.ch15.sec05.exam01.exam03;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		//TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//객체 저장
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		treeSet.add(new Person("임꺽정", 15));
		treeSet.add(new Person("김파이썬",35));
		treeSet.add(new Person("김길동", 13));
		treeSet.add(new Person("이길동", 44));
		treeSet.add(new Person("차자바", 26));
		treeSet.add(new Person("김지원", 30));
		treeSet.add(new Person("이길동", 22));
		treeSet.add(new Person("박자바", 29));
		treeSet.add(new Person("이지원", 34));
		
		//객체를 하나씩 가져오기
		for(Person person : treeSet) {
			System.out.println(person.name + ":"+ person.age);
		}
	}

}
