package ch10.collection01.ch15.sec03.exam01.exam02;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();
		
		
		
		//Member 객체 저장
		set.add(new Member("홍길동",30)); // 인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장
		set.add(new Member("홍길동",30));
		
		
		Member mem0 = new Member("김길동", 31);
		Member mem1 = new Member("김길동", 31);
		
		System.out.println(mem0.hashCode());
		System.out.println(mem1.hashCode());
		
		//Membe 객체 ㅈ저아
		set.add(mem0);
		set.add(mem1); // 내부에서 hashCode()	-> equals()비교
		
		//저장된 객체 수 출력
		System.out.println("총 객체 수: " + set.size());
		
		set.add(new Member("임꺽정",30));
	}

}
