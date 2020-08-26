package com.yedam.examH;

import java.util.ArrayList;
import java.util.List;

public class Course  {
	
	List<Student> list = new ArrayList<>();
	
	private String course;
	private int sNum;
	
	
	// 과정등록 (생성자로)
	public Course(String course, int sNum) {
		this.course = course;
		this.sNum = sNum;
		
	}

	// 수강할 인원의 정보를 등록하는 메소드 이름, 나이, 성적
	public void course(Student s) {
		if(list.size() < sNum) {
			list.add(s);
		}
		
	}
	
	 // 학생 리스트 출력 메소드
	public void studentList() {
		System.out.println("[리스트 출력]");
		System.out.println("수강인원: " + sNum +" 명");
		for(Student ss : list) {
			System.out.println(ss);
		}
	}
	
	public void showCourseInfo() {
		System.out.println("[과정 정보 출력]");
		int sum =0, max=0;
		System.out.println("과정명: " + course);
		for(Student ss : list) {
			System.out.println( ss );
			sum += ss.getScore();
			if(ss.getScore() >= max) {
				max = ss.getScore();
			} else {
				max = max;
			}
			
		}
		System.out.println("평균점수: " + (double) (sum / list.size()) + ", 최고점수: " + max);
	}

}
