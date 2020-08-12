//비교 연산자 P.87~
 package com.yedam.oper;

public class StringEqualExample {
	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 30;
		
		//Q1
		if(v1 == v2) {
			System.out.println("Q1 :같습니다");
		} else {
			System.out.println("Q1: 다릅니다.");
		}
		
		String str1 = "Hello";
		String str2 = "Hello"; 
		String str3 = new String("Hello");
		//Q2
		if(str1 == str2) {
			System.out.println("Q2: str1, str2는 같은 문자입니다."); //str1과 str2는 같은 주소값
		} else {
			System.out.println("Q2: str1, str2는 다른 문자입니다."); 
		}
		//Q3
		if(str1 == str3) {
			System.out.println("Q3: str1, str3는 같은 문자입니다.");//str1과 str3는 다른 주소값
		} else {
			System.out.println("Q3: str1, str3는 다른 문자열입니다.");
		}
		//Q4
		if(str1.equals( str3)) {
			System.out.println("Q4: str1, str3는 같은 문자열입니다.");//str1과 str3를 문자열로 비교
		} else {
			System.out.println("Q4: str1, str3는 다른 문자열입니다.");
		}
		//논리 연산자 
		boolean A =true;
		boolean B = false;
		boolean C = A && A;
		System.out.println("&& 둘다 참이면 : " + C);
		System.out.println(A && B);
		System.out.println(B && B);
		System.out.println(A || A);
		System.out.println(A || B);
		System.out.println(B || B);
}
	
}
