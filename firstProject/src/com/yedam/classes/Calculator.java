package com.yedam.classes;

public class Calculator {
	double pi = 3.14;
	
	public int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
	//원 넓이 구하는 메서드
	public void getArea(int a) { //a는 반지름
		double result = pi * a * a;
		System.out.println("반지름 " + a + "인 원의 넓이는 " + result);
	}
	
	public void getRectagle(int x, int y) {
		int result = (x * y);
		System.out.println("Q1: 가로" + x + ", 세로" + y + "인 사각형의 넓이는 " + result + "입니다.");
	}
	
	public String getRectangle3(int x, int y) {
		return "Q3: 가로" + x + ", 세로" +  y + "인 사각형의 넓이는 " + calRectagle(x, y) + "입니다.";
	}
	
	public int getRectagle2(int x, int y) {
		return x * y;
	}
	
	public int calRectagle(int x, int y) {
		return x * y;
	}
}
