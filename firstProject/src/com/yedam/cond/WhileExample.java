package com.yedam.cond;

public class WhileExample {
	public static void main(String[] args) {
		// 1~10까지 출력
		int i = 0; // 초기값
//		while(i<10) {			//조건
//			i++;					//증감치
//			System.out.println(i);
//		}
		// 1~10까지 합
		int sum = 0;
		int a = 0;
//		while(sum<10) {
//			sum++;
//			a = a + sum;
//		}
//		System.out.println("1~" + sum + "까지 합: " + a);
		i = 1;
		while (i < 10) {
			a = 1;
			while (a < 10) {
				System.out.println(i + "*" + a + " = " + (i * a));
				a++;
			}
			i++;
		}

	}
}
