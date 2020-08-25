package com.yedam.lambda;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int a = 0;
		int strikeCount = 0;
		int ballCount = 0;
		int array[] = new int[3];
		int arrayBall[] = new int[3];
		Scanner scn = new Scanner(System.in);
		boolean bool = true; 
		for (int i=0; i <3; i++) {
			a = (int) (Math.random() * 9) +1;
			array[i] = a;
			for(int t =0; t < i; t++) {
				if(array[t] == a) {
					i =i -1;
					break;
				}
			}
		}
		while(bool) {
//			for(int i =0; i <3; i++) {
//				System.out.print(array[i]);	
//			}
//			System.out.println();
			
			for(int i = 0; i <3; i++) {
			System.out.print(i +1 + "구 >");
			arrayBall[i] =scn.nextInt();
				if(array[i] == arrayBall[i]) {
					strikeCount++;
				} else if (arrayBall[i] == array[0] || arrayBall[i] == array[1] || arrayBall[i] == array[2]) {
					ballCount++;
				}
			}
			System.out.println("스트라이크 :" + strikeCount);
			System.out.println("볼 :" + ballCount);
			if (strikeCount == 3) {
				bool = false;
			} else {
				strikeCount = 0;
				ballCount =0;
			}
		}
		System.out.println("삼진아웃!");
	}
}