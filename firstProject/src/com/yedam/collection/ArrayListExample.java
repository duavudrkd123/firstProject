package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("허성준");
		list.add("김시무");
		list.add(1, "이광호"); //index 1 자리의 값을 뒤로 밀어낸다
		
		System.out.println("방법1");
		System.out.print(list.get(0) + " ");
		System.out.print(list.get(1) + " ");
		System.out.print(list.get(2));
		System.out.println();
		
		System.out.println("방법2");
		for(int i =0; i <list.size(); i++) {
			System.out.print(list.get(i)  + " ");
		}
		System.out.println();
		
		System.out.println("방법3");
		for(String str : list ) {
			System.out.print(str + " ");
		}
		
		
		
	}
}
