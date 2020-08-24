package com.yedam.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<> ();
		long startTime = System.nanoTime();
		for (int i = 0; i < 30000; i ++) {
			aList.add(0, new Integer(i)); //aList.add(자리, 값);
		}
		long endTime = System.nanoTime();
		System.out.println("ArrayList 앞에 넣기 걸린시간: " +  (endTime - startTime));
		
		List<Integer> cList = new ArrayList<> ();
		startTime = System.nanoTime();
		for (int i = 0; i < 30000; i ++) {
			cList.add(i, new Integer(i)); //aList.add(자리, 값);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 뒤에 넣기 걸린시간: " + (endTime - startTime));
		
		List<Integer> bList = new LinkedList<> ();
		startTime = System.nanoTime();
		for (int i = 0; i < 30000; i ++) {
			bList.add(0, new Integer(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime));

	}
}
