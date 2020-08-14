package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("cal.add(10, 20): " + cal.add(10, 20));
		System.out.println("cal.add(10.0, 20.0): " + cal.add(10.0, 20.0));
		cal.getArea(4);
		cal.getRectagle(4, 5);
		int a= 4, b =5;
		System.out.println("Q2: 가로" + a + ", 세로" + b + "인 사각형의 넓이는 " + cal.getRectagle2(a, b) + "입니다.");
		System.out.println(cal.getRectangle3(4, 5));
		
	}
}
