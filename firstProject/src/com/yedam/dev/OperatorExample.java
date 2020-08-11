package com.yedam.dev;

public class OperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		int result = 3 + 8 - 5 * 4; //산술(사칙연산)은 순서 원래와 같음
		int result2 = 3 + (8 - 5) * 4; //괄호로 순서 변경 가능
		int result3 = 3 + 8 - 5 * 4 + val1++; //++이 산술보다 더 빠름
		int result4 = -3 + 8 - 5 * 4 + val1++; //-n(부호)가 ++보다 더 빠름
		System.out.println(result + ", " + result2 + ", " + result3 + ", " + result4 );
		
		//나머지
		int result5 = 10 % 7; //10을 7로 나눈 나머지
		System.out.println("나머지 : " + result5);
		int result6 = 10 / 7; //10을 7로 나누기
		System.out.println("나누기1 : " + result6);
		
		double r1 = 10/7;
		double r2 = 10/7.0;//.0을 붙여서 정수를 실수로 바꿈
		System.out.println("나누기2-1 : " + r1 + ", 나누기2-2 : " + r2);
		
		for(int i=1; i<=10; i++) {
			//System.out.println(i);
			if(i%2 == 1) 
				System.out.println(i +"는 홀수입니다.");
			else 
				System.out.println(i +"는 짝수입니다.");
		}
	}
}
