package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class treeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "최재영");
		scores.put(new Integer(98), "민해주");
		scores.put(new Integer(75), "김상민");
		scores.put(new Integer(95), "최형준");
		scores.put(new Integer(80), "허성준");
		
		Map.Entry<Integer, String> entry = scores.firstEntry();
		System.out.println("최소 점수: " + entry.getKey() 
								   + ", 이름: " + entry.getValue());
		entry = scores.lastEntry();
		System.out.println("최대 점수: " + entry.getKey() 
								   + ", 이름: " + entry.getValue());
		Integer icnt = scores.firstKey();
		System.out.println("키로 가져온 점수: " + icnt
								   + ", 이름: " + scores.get(icnt));
		Map.Entry<Integer, String> pEntry =  scores.pollFirstEntry();
		//poll는 collection에서 값을 뽑고 collection에서 그 값을 삭제함!
		
	}
}
