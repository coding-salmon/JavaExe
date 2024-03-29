package ch17.stream01;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Stream;
	import java.util.*;


	public class StreamCalc {
		public static void main(String[] args) {
			List<String> nameList = new ArrayList<>();
			nameList.add("홍길동");
			nameList.add("알렉산드라");
			nameList.add("톨스토이");
			nameList.add("김수한무거북이와두루미삼천갑자동방삭");
			nameList.add("Cristoper");
			nameList.add("프랑스대왕루이14세");
			nameList.add("영국예무인성명효대왕");
			nameList.add("일본왕");
			nameList.add("일본왕몰라몰라몰라");
			
			
			for(String name : nameList) {
				if(name.length()>=5) {
					System.out.print(name+",");
				}
			}
			
			System.out.println();
			
			Stream<String> strm = nameList.stream();
			Stream<String> strmF = strm.filter(s->s.length()>=5);
			strmF.forEach(s->System.out.print(s+","));
		//	strmF.forEach(s->System.out.print(s+",")); 한번쓰면 또 쓸수 없다.
			
			System.out.println();
			
			nameList.stream()								//스트림객체
					.filter(s->s.length()>=5)				//중간연산(참일때 새로운 스트림)
					.forEach(s->System.out.print(s+","));	//최종연산
			System.out.println();
		}
	}



