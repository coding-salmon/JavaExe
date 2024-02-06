package ch10.collection01.ch15.sec03.exam01.exam01;

import java.util.*;

/*
 * Set은 집합이다.
 * 집합의 데이터의 모음일 뿐 ' 순서가 보장되지 않는다 '
 * 그러므로 중복을 허용하지 않는다.
 *  A = { 1, 2, 3}
 *  B = { 3, 4, 5}
 *  C = A∪B  
 *  C = { 1, 2, 3, 4, 5}
 *  
 *  데이터가 입력될때 기존 데이터가 있는지 확인한다.
 *  이때 사용하는 알고리즘이 Hash알고리즘이다.
 *  
 *  입력값에서 Hash 로 변환은 가능하나
 *  Hash 에서 입력값을 추론할순없다
 *  그래서 주로 패스워드 관리에 쓰인다.
 *  
 *  검색속도가 엄청 빠르다
 *  데이터베이스에 사용된다.
 *  중복을 허용 않는다.
 *  순서 보장되지 않는다.
 *  
 *  
 */
public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // <- 중복 객체이므로 저장하지 않음
		set.add("Spring");
		set.add("Python");
		set.add("Algorithm");
		set.add("iBATIS");
		set.add("java");
		
		
		//저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수: "+size);
		
		for(String element : set	) {
			System.out.println(element);
		}
	}

}
