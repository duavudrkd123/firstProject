package com.yedam.text05;

import java.lang.reflect.Array;
import java.util.Scanner;
public class Q9_2 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		int avg = 0;
		int Beststu = 0;
		Scanner scanner = new Scanner(System.in);
			System.out.println("---------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------");
		while(run) {
				System.out.println("학생수를 입력하세요> ");
				studentNum = scanner.nextInt();
				System.out.println("학생수는 " + studentNum + "명 입니다");
				System.out.println("점수를 입력하세요");
				scores = new int[studentNum];
				for(int i = 0; i <scores.length; i++) {
					System.out.print("학생" + (i+1) + "의 점수: ");
					scores[i] = scanner.nextInt();
				}
				System.out.println("점수리스트를 출력합니다.");
				for(int i = 0; i <scores.length; i++) {
					System.out.println("학생" + (i+1) + ": " + scores[i]);
				} 
				for(int i =0; i < scores.length; i++) {
						if(max < scores[i]) {
							max = scores[i];
						}
						sum = sum + scores[i];
						avg = sum / scores.length;
				}
				for(int i =0; i < scores.length; i++) {
						if (max == scores[i]) {
							Beststu = i;
						}
				}
										System.out.println("점수를 분석합니다.");
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				System.out.println("최고의 학생: " + Beststu + "");
				run = false;
			}
		System.out.println("프로그램 종료");
	}
}
