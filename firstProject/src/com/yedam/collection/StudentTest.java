package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		Student stu = null;
		
		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("1.점수입력 2. 평균 3. 최고학생보기 9. 종료");
			System.out.println("---------------------------------------");
			
			int selectNum = scn.nextInt();
		if(selectNum == 1) {
//			System.out.print("이름:");
//			String name = scn.next();	 
//			System.out.print("수학 점수:");
//			int math = scn.nextInt();
//			System.out.println();
//			System.out.println("영어 점수:");
//			int eng = scn.nextInt();
//			Student stu = new Student(name,math,eng);
			
//			stu = new Student("",0,0);
//			System.out.println("학생의 이름을 입력하세요");
//			stu.setName(scn.next());
//			System.out.println(stu.getName() + "의 수학 점수를 입력하세요");
//			stu.setMathScore(scn.nextInt());
//			System.out.println(stu.getName() + "의 영어 점수를 입력하세요");
//			stu.setEngScore(scn.nextInt());
//			System.out.println("입력한 값");
//			System.out.println("이름: " + stu.getName() + ", 수학 점수: " + stu.getMathScore() + ", 영어 점수: " + stu.getEngScore());
			
			stu = new Student("1번",100,100);
			list.add(stu);
			stu = new Student("2번",90,80);
			list.add(stu);
			stu = new Student("3번",80,60);
			list.add(stu);
			System.out.println("현재 리스트");
			for(Student stu1 : list) {
				System.out.println("이름: " + stu1.getName() + ", 수학 점수: " + stu1.getMathScore() + ", 영어 점수: " + stu1.getEngScore());
			}
		} else if(selectNum == 2) {
			double a = 0;
			double b = 0;
			for(Student math : list) {
				a = a + math.getMathScore();
			}
			b = a / list.size();
			System.out.println("수학점수의 평균은: " + b + "점 입니다");
			a = 0;
			b = 0;
			for(Student eng : list) {
				a = a + eng.getEngScore();
			}
			b = a / list.size();
			System.out.println("영어점수의 평균은: " + b + "점 입니다");
		} else if(selectNum == 3) {
			int a = 0; 
			String b = "";
			for(Student math : list) {
				if(math.getMathScore() > a) {
					a = math.getMathScore();
					b= math.getName();
				}
			}
			System.out.println("최고 점수를 받은 학생: " + b);
			System.out.println("최고 점수: " + a + "점");
		} else if(selectNum == 9){
			break;
		}
		}//end of while
		System.out.println("시스템 종료");
	}//end of main
}//end of class
