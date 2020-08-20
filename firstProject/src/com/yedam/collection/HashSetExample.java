package com.yedam.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		System.out.println("A".hashCode());
		set.add(new Member("김다희", 20));
		set.add(new Member("김다희", 20));//같은값
		set.add(new Member("김도은", 20));//같은 나이
		set.add(new Member("김다희", 21));//같은 이름
		set.add(new Member("김도은", 21));//다른 값
		
		
		for(Member mem : set) {
			System.out.println(mem.getName() + ", " + mem.getAge());
		}
	}
}
