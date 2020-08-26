package com.yedam.examH;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {
		
		// 과정등록
		Course j = new Course("자바", 2);
		// 학생등록
		j.course(new Student("자바1", 11, 100)); 
		j.course(new Student("자바2", 20, 21));
		j.course(new Student("자바3", 21, 90));
		j.studentList(); 
		System.out.println();
		j.showCourseInfo();
		
		System.out.println();
		Course o = new Course("오라클", 3);
		
		o.course(new Student("오라클1", 11, 10));
		o.course(new Student("오라클2", 20, 20));
		o.course(new Student("오라클3", 21, 90));
		
		o.studentList(); 
		System.out.println();
		o.showCourseInfo();
		// 과정정보확인 (과정-등록된 학생 리스트 ) + 최고점수, 평균점수
		
		
		
	}

}
