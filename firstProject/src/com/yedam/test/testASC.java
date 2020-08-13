package com.yedam.test;

import java.util.Scanner;

public class testASC {
	public static void main(String[] args) {
		int[] numAry = new int[3];
		int i = 0;
		while(i<=2) { //반복문 시작
		System.out.println("숫자를 입력하세요> ");
		Scanner scanner = new Scanner(System.in);
		int input;
		input = scanner.nextInt();
		numAry[i] = input;
		i++;
		}
		if((numAry[0]-numAry[1]>=0)) { //1번-2번이 양수이면 //A가 제일 클때
			if(numAry[0]-numAry[2]>=0) {//1번-3번이 양수이면
				System.out.print(numAry[0] + ", ");
				if(numAry[1]-numAry[2]>=0) {//2번-3번이 양수이면
					System.out.print(numAry[1] + ", ");
					System.out.println(numAry[2]);
				} else {
					System.out.print(numAry[2] + ", ");
					System.out.println(numAry[1]);
				}
			}
		} else {
			if(numAry[1]-numAry[2]>=0) {
				System.out.print(numAry[1] + ", ");
				if(numAry[0]-numAry[2]>=0) {
					System.out.print(numAry[0] + ", ");
					System.out.println(numAry[2]);
				} else {
					System.out.print(numAry[2] + ", ");
					System.out.println(numAry[0]);
				}
			} else {
				System.out.print(numAry[2] + ", ");
				System.out.print(numAry[1] + ", ");
				System.out.println(numAry[0]);
			}
		}
		System.out.println("배열값 : " + numAry[0] + ", " + numAry[1] + ", " + numAry[2]);
		int AA = numAry[0]-numAry[1];
		//System.out.println(input);
	}
}
