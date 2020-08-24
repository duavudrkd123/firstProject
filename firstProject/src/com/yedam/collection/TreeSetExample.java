package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));
		
//		Integer t = tSet.first(); //tSet.first =>제일 작은 값
//		System.out.println("제일 작은 값 " + t);
//		Integer l = tSet.last(); //tSet.last =>제일 큰 값
//		System.out.println("제일 큰 값 " + l);
//		Integer f = tSet.floor(new Integer(87)); 
//		System.out.println("기준 보다 작거나 같은  값" + f);
//		Integer lower = tSet.lower(new Integer(87));  
//		System.out.println("기준 보다 작은 값 " + lower);
//		Integer ceiling = tSet.ceiling(new Integer(87)); 
//		System.out.println("기준 보다 크거나 같은 값 " + ceiling);
//		Integer higher = tSet.higher(new Integer(87)); 
//		System.out.println("기준 보다 큰 값 " + higher);
//		
//		int size = tSet.size(); //최소값부터 출력하고 배열에서 삭제
//		for(int i = 0; i < size; i++) {
//			Integer poll= tSet.pollFirst();
//			System.out.println("poll: " + poll + ", " + tSet.size());	
//		}
		
		System.out.println("descendingIterator");
		Iterator<Integer> dIter = tSet.descendingIterator(); //tSet.descendingIterator() => 내림차순 정렬
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		
		System.out.println("descendingSet");
		NavigableSet<Integer> nSet = tSet.descendingSet(); //순차적으로 저장
		for(Integer icnt : nSet) {
			System.out.println(icnt);
		}
		
//		int size = tSet.size(); //최대값부터 출력하고 배열에서 삭제
//		for(int i = 0; i < size; i++) {
//			Integer poll= tSet.pollLast();
//			System.out.println("poll: " + poll + ", " + tSet.size());	
//		}
		
		
//		Iterator<Integer> iter = tSet.iterator(); //반복자
//		while(iter.hasNext()) { //iter.hasNext() => 배열 안에 가져올 것이 있으면 true, 없으ㄴ면 false
//			Integer icnt = iter.next();
//			System.out.println(icnt);
//			
//		}
	}
}
