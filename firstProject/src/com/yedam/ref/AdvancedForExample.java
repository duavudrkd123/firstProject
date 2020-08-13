package com.yedam.ref;

import java.util.Scanner;

public class AdvancedForExample {
	public static void main(String[] args) {
		//java.util.Scanner scn = new java.util.Scanner(System.in); //class를 import 안 하면 이렇게 써야한다!
		Scanner scn = new Scanner(System.in);
		
		int[] scores = new int[5];
		for(int i =0; i < scores.length; i++) {
			System.out.println("점수를 입력하세요.");
			scores[i] = scn.nextInt(); //콘솔에 입력하는 값을 scores에 입력하겠다
		}
//		int[] scores = {9,3,8,7,5};
		int sum = 0;
		double avg = 0;
		int maxVal = 0;
		int avgi = 0;
		
		for(int num : scores ) {
			sum += num;
			if(maxVal<num) {
				maxVal = num;
			}
		}
		avg = (double) sum/scores.length; //실수
		avgi = sum/scores.length; //정수
//		System.out.println("avg는 " + avg + ", avgi는 " + avgi + ", sum은 " + sum);
		System.out.println("합계점수: " + sum + ", 평균: " + avg + ",  최고점수" + maxVal);
	}
}
