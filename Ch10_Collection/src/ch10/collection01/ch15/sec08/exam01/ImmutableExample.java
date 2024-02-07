package ch10.collection01.ch15.sec08.exam01;

import java.util.List;
import java.util.Set;

public class ImmutableExample {
	public static void main(String[] args) {
		//List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A", "B", "C");
		//immutableList1.add("D"); 실행불가
		
		//Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A", "B", "C");
	}

}
