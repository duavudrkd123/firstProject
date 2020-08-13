package com.yedam.dev;

public class MorningCode13 {
	public static void main(String[] args) {
//		int num = 0;
//		for(int i = 0; i <10; i++) {
//			if(i%2 !=0)
//				continue; //continue를 만나면 반복문 시작으로 이동한다!
//			System.out.println(i);
//		}
		
		int n = 0;
		while(true) {
			if(n++ ==5)
				break;
			else if (n ==3) {
				System.out.println("n은 3입니다.");
				continue;
				
			}
				
			System.out.println("프로그램 진행중...");
		}
		
//		int i = 0, j = 0;
//		while(j>10) {
//			j=0; //j값 초기화 안 시켜주면 j=10으로 시작한다!
//			while(i<10 ) {
//				i++;
//			}
//		}
			
		
//		int sum = 0;
//		for(int j=0; j<5; j++) {
//			for(int i =0; i<10; i++ ) {
//				sum = sum +i;
//				System.out.println(i);
//			}
//		}
		
//		int score = 90;
//		for(score = 99;score >60; score-=5) {
//		if (score >= 90) {
//			if(score >= 95)
//				System.out.println(score + "는 95이상입니다");
//			else
//				System.out.println(score + "는 90 이상입니다.");
//		} else if(score >= 80) {
//			System.out.println(score + "는 80 이상입니다");
//		} else {
//			System.out.println(score + "는 80 미만입니다.");
//		}
//		}
	}
}
