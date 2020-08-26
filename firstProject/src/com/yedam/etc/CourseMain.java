package com.yedam.etc;

import java.util.Scanner;

public class CourseMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Course course = new Course(null, 0); 
		Student stu = new Student("",0,0);
		Course arrayCourse[] = new Course[10];
		while( run) {
			System.out.println("------------------------------------------");
			System.out.println("1.과정등록 2.학생등록 3.과정정보확인 4. 종료");
			System.out.println("------------------------------------------");
			int selectNum = scn.nextInt();
			if(selectNum == 1) {
				System.out.println("과정을 등록합니다.");
				System.out.print("과정명>");
				String courseName = scn.next();
				System.out.print("수강인원>");
				int courseSize = scn.nextInt();
				course = new Course(courseName, courseSize);
				for(int i =0; i <= arrayCourse.length; i++) {
					if(arrayCourse[i] == null) {
						arrayCourse[i] = course;
						break;
					}
				}
				System.out.println("과정: " + course.getCourseName() + ", 수강인원: " + course.getCourseSize());
				System.out.println("등록되었습니다.");
				System.out.println("<현재 등록된 과정>");
				for(Course A : arrayCourse) {
					if(A != null) {
						System.out.println("과정: " + A.getCourseName() + ", 수강인원: " + A.getCourseSize());	
					}
				}
			} else if (selectNum == 2) {
				for(int i =0 ; i <arrayCourse.length; i++) {
					if(arrayCourse[i] != null) {
						System.out.print(i + 1 + ". ");
						System.out.println("과정: " + arrayCourse[i].courseName + ", 수강인원: " + arrayCourse[i].courseSize);	
					}
				}
				System.out.println("어떤 과정에 등록하시겠습니까?");
				int num = scn.nextInt()-1;
				System.out.println("학생을 등록합니다.");
				System.out.print("이름>");
				String name = scn.next();
				System.out.print("나이>");
				int age = scn.nextInt();
				System.out.print("점수>");
				int score = scn.nextInt();
				stu = new Student(name, age, score);
				arrayCourse[num].creStu(stu);
				System.out.println(arrayCourse[num].getCourseName() + "에 학생이 등록되었습니다.");
			}  else if (selectNum == 3) {
				for(int i =0 ; i <arrayCourse.length; i++) {
					if(arrayCourse[i] != null) {
						System.out.print(i + 1 + ". ");
						System.out.println("과정: " + arrayCourse[i].courseName + ", 수강인원: " + arrayCourse[i].courseSize);	
					}
				}
				System.out.println("어떤 과정의 정보를 확인하시겠습니까?");
				int num = scn.nextInt()-1;
				System.out.println("코스명: " + arrayCourse[num].getCourseName());
				System.out.println("수강인원: " + arrayCourse[num].getCourseSize());
				for(int i =0; i <  arrayCourse[num].stu.length; i++) {
					if(arrayCourse[num].getStudent(i) != null) {
						System.out.print("이름: " + arrayCourse[num].getStudent(i).getName()+ " ") ;	
						System.out.print("나이: " + arrayCourse[num].getStudent(i).getAge()+ " ");
						System.out.print("점수: " + arrayCourse[num].getStudent(i).getscore());	
					} else {
						break;
					}
					System.out.println();
				}
				int stuNum = 0;
				int high = 0;
				int sum = 0;
				for(int i =0; i < arrayCourse[num].stu.length; i++) {
					if(arrayCourse[num].getStudent(i) != null) {
						sum = sum + arrayCourse[num].getStudent(i).getscore();
						stuNum ++;
						if(high < arrayCourse[num].getStudent(i).getscore()) {
							high = arrayCourse[num].getStudent(i).getscore();
						}
					} else {
						break;
					}
				}
				double avg = (double) sum / stuNum;
				System.out.println("평균: " + avg);
				System.out.println("최고점수: " + high);
			} else  if (selectNum == 4) {
				break;
			}
		}
		System.out.println("종료되었습니다.");
	}
}
