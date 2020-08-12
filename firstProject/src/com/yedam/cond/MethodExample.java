package com.yedam.cond;

public class MethodExample {
	public static void main(String[] args) {
		//원하는 단만 출력하기
		multiTable(2,5,8);
//		multiTable(3,5); 
//		multiTable(6);
		//메서드로 구구단 만들기
//		int num = 2;
//		for(;num <=9; num++)
//		multiTable(num);
	}
	//원하는 단 범위만 출력하기
	public static void multiTable(int a, int b) {
		for(int i =a; i<=b; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
	//원하는 단만 출력하기
		public static void multiTable(int a, int b, int c) {
			int i = a;
				for(int j=1; j<10; j++) {
					System.out.println(i + "*" + j + "=" + (i*j));
				}
			i = b;
				for(int j=1; j<10; j++) {
					System.out.println(i + "*" + j + "=" + (i*j));
				}
			i = c;
				for(int j=1; j<10; j++) {
					System.out.println(i + "*" + j + "=" + (i*j));
				}
			}
	//메서드로 구구단 만들기
	public static void multiTable(int a) {
		int num1 = a;
		for (int i = 1; i < 10; i++)
				System.out.println(num1 + "*" + i + "=" + (num1*i));
	}
	
	public static void multiTable() {
		int num1 = 2;
		for (int i = 1; i < 10; i++)
				System.out.println(num1 + "*" + i + "=" + (num1*i));
	}
}

