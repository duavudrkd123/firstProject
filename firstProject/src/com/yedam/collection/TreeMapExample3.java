package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");
		
		SortedMap<Student, String> sMap = tMap.headMap(new Student("A",80,70)); //80점 이하
		Set<Student> set = sMap.keySet();
		System.out.println("---------headMap---------");
		for(Student s : set) {
			System.out.println(s.getName() + ", " + s.getMathScore());
		}
		
		SortedMap<Student, String> sMap2 = tMap.tailMap(new Student("A",80,70)); //80점 이상
		Set<Student> set2 = sMap2.keySet();
		System.out.println("---------tailMap---------");
		for(Student s : set2) {
			System.out.println(s.getName() + ", " + s.getMathScore());
		}
		
		int lowMath = 65; int highMath = 90;
		int lowEng =79 ; int highEng = 86;
		int lowSum = lowMath + lowEng;
		int hignSum = highMath + highEng;
		SortedMap<Student, String> sMap3 = tMap.subMap(new Student("A",lowMath,lowEng), 
																								  new Student("A",highMath,highEng)); //70~80
		Set<Student> set3  = sMap3.keySet();
		System.out.println("---------subMap---------");
		System.out.println("최소값: " +lowSum + ", 최대값: " + hignSum );
		for(Student s : set3) {
			int A = s.getMathScore() + s.getEngScore();
			System.out.println(s.getName() + ", " + A + "(" + s.getMathScore() + "+" + s.getEngScore() + ")");
		}
	}
}
