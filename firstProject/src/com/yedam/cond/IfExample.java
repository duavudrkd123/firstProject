package com.yedam.cond;

public class IfExample {
	public static void main(String[] args) {
		int score = 99;
		String grade = ""; //빈 값이다 널 아니다 => 빈 값 안 넣으면 오류 난다
					for(score = 99; score>60; score-= 5) {
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if(score >= 80){
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if(score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			if(score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		}
		System.out.println(score -5 + "점은 " + grade + "입니다.");
						}
	}
}
