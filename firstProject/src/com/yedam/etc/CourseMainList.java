package com.yedam.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseMainList {
	public static void main(String[] args) {
		   Scanner scn = new Scanner(System.in);
		   List<CourseList> course = new ArrayList<>();
		   while(true) {
		      System.out.println("------------------------------"); 
		      System.out.println("1.과정생성 2.학생입력 3.과정조회 9.종료");
		      System.out.println("------------------------------");
		      int selectNum = scn.nextInt();
		      if(selectNum == 1) {
		         System.out.print("과정명>");
		         String name = scn.next();
		         System.out.print("수강인원>");
		         int size = scn.nextInt();
		         course.add(new CourseList(name, size));
		         
//		         //자동생성기
//		         String name = "자바";
//		         int size = 5;
//		         course.add(new CourseList(name, size));
//		         name = "디비";
//		         size = 3;
//		         course.add(new CourseList(name, size));
//		         name = "서버";
//		         size = 7;
//		         course.add(new CourseList(name, size));
		         
		         for(CourseList A : course) {
		            System.out.println("이름: " + A.name + ", 수강인원: " + A.size);
		         }
		      } else if (selectNum == 2) {
		         int a = 0;
		         System.out.println("추가할 과정의 번호를 선택하세요?");
		         for(CourseList A : course) {
		            a++;
		            System.out.println(a + ". 이름: " + A.name + ", 수강인원: " + A.size);
		         }
		         int courseNum = scn.nextInt()-1;
		         System.out.println("[" + course.get(courseNum).getName() + "]");
		         System.out.print("이름>");
		         String name = scn.next();
		         System.out.print("나이>");
		         int age = scn.nextInt();
		         System.out.print("점수>");
		         int score = scn.nextInt();
		         StudentList student = new StudentList(name,age,score);
		         course.get(courseNum).setStudent(student);
		      } else if (selectNum == 3) {
		         int a = 0;
		         System.out.println("조회하고 싶은 과정의 번호를 선택하세요.");
		         for(CourseList A : course) {
		            a++;
		            System.out.println(a + ". 이름: " + A.name + ", 수강인원: " + A.size);
		         }
		         int courseNum = scn.nextInt()-1;
		         System.out.println("과정명: " + course.get(courseNum).getName() + ", 수강인원: " + course.get(courseNum).getSize());
		         for(StudentList A : course.get(courseNum).getStudent()) {
		            System.out.println("이름: " + A.getName() + " 나이: " + A.getAge() + " 점수: " + A.getScore());
		         }  
		      }  else if (selectNum == 9) {
		    	  break;
		      }
		   }  System.out.println("시스템 종료");
		}
}
