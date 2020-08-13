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
		double avg = 0;
		Scanner scanner = new Scanner(System.in);
			System.out.println("---------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------");
			System.out.println("선택> ");
			int selectNo =scanner.nextInt();
		while(run) {
						
			
			
			if(selectNo ==1) {
				System.out.println("학생수를 입력하세요> ");
				studentNum = scanner.nextInt();
				System.out.println("학생수에 " + studentNum + "이 입력되었습니다");
			} else if(selectNo ==2) {
				System.out.println("점수를 입력하세요");
				scores = new int[studentNum];
				for(int i = 0; i <scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo ==3) {
				System.out.println("점수리스트를 출력합니다.");
				for(int i = 0; i <scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				System.out.println("아무키나 입력하면 처음으로 돌아갑니다");
				int A = scanner.nextInt();
			} else if(selectNo ==4) { 
				for(int i =0; i < scores.length; i++) {
						if(max < scores[i]) {
							max = scores[i];
						}
						sum = sum + scores[i];
						avg = (double) sum / scores.length;
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(selectNo ==5) {
				run = false;
			}
			selectNo +=1 ;
		}
		
		System.out.println("프로그램 종료");
	}
}
