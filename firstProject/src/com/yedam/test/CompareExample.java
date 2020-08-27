package com.yedam.test;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		//static 없앤 버전
//		CompareExample ce = new CompareExample();
//		Student s1 = ce.new Student(1);
//		Student s2 = ce.new Student(1);
//		Student s3 = ce.new Student(2);
		
		// StudentComparator 클래스 사용하기
//		StudentComparator A = new StudentComparator();
//		int result = Objects.compare(s1, s2, A);
//		System.out.println(result);
//		result = Objects.compare(s1, s3, A);
//		System.out.println(result);
		
		//static 없앤 버전
//		int result = Objects.compare(s1, s2, ce.new StudentComparator());
//		System.out.println(result);
//		result = Objects.compare(s1, s3, ce.new StudentComparator());
//		System.out.println(result);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}
	
	static class Student {
		int sno;
		Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			/*if(o1.sno<o2.sno) return -1;
			else if(o1.sno == o2.sno) return 0;
			else return 1;*/
			return Integer.compare(o1.sno, o2.sno);
		}
		
	}
}
