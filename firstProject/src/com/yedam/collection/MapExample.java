package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, Member> map = new HashMap<>();
		map.put(11, new Member("김현동", 20)); //put(Key값, Value값)으로 들어감
		map.put(12,  new Member("박진규", 21));
		map.put(13,  new Member("오재훈", 22));
		
//		System.out.println("Key값이 11인 데이터>");
//		System.out.println(map.get(11).getName() + ", " + map.get(11).getAge());
		//get은 Key값을 넣으면 그에 맞는 Value를 호출해 준다!
		
		Set<Integer> set = map.keySet(); //set에다 map의 key값을 넣겠다.
		for(Integer i : set) {
			Member m = map.get(i);
			System.out.println("<Key값이 " + i + "인 데이터>");
			System.out.println(m.getName() + ", " + m.getAge());
		}
		
		Set<Map.Entry<Integer, Member>> entSet = map.entrySet();
		for(Map.Entry<Integer, Member> m : entSet) {
			System.out.println("<Key값이 " +m.getKey() + "인 데이터>");
			System.out.println(m.getValue().getName() + ", " + m.getValue().getAge());
		}
		
		Map<String, String> m = new HashMap<>();
		m.put("이름", "김상민"); 
		m.put("전공", "심리학");
		getInfo(m);
	
//		Map<String, Integer> m2 = new HashMap<String, Integer>();
//		m2.put("최재영", 20);//Map 클래스에 Key값으로 "최재영" Value로 20을 입력함
//		m2.put("김현동", 23);
//		m2.put("허성준", 26);
//		getAge(m2, "최재영");//getAge(Map 클래스, Key 값)
//		getAge(m2, "김현동");
//		getAge(m2, "허성준");
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("최재영", 20);//Map 클래스에 Key값으로 "최재영" Value로 20을 입력함
		m2.put("김현동", 23);
		m2.put("허성준", 26);
		getAge(m2);
		
//		Set<Map.Entry<String, Integer>> entSet = map.entrySet();
//		for(Map.Entry<String, Integer> m : entSet) {
//			getAge(m);
//		}
	}
	
	
//	public static void getAge(Map<String, Integer> m, String K) {
//		System.out.println(K + "은 " + m.get(K) + "살 입니다.");//Key값이 K인 Value를 가져옴 
//	}
	public static void getAge(Map<String, Integer> m) {
		Set<String> set = m.keySet();
		for(String str : set) {
			System.out.println("이름은: " + str + " 나이는 " + m.get(str) + "살 입니다.");	
		}
		
	}

	public static void getInfo(Map<String, String> m) {	//인수로 <String, String>을 인수로 가지는 Map클래스를 받겠다
		System.out.println("이름: " + m.get("이름")); //Key값이 이름인 Value를 가져옴
		System.out.println("전공: " + m.get("전공"));//Key값이 전공인 Value를 가져옴
	}
	
}
