package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.r =5;
		cal.getArea();
		System.out.println("반지름: " + cal.r +  "일 때 원의 넓이는: " + cal.getArea());
		
		//필드에 부적절한 값(-5)가 들어가도 계산이 된다.
		cal.r =-5;
		cal.getArea();
		System.out.println("반지름: " + cal.r +  "일 때 원의 넓이는: " + cal.getArea());
		
		//조건을 통해 부적절한 값을 방지할 수 있다.
		cal.setRadius(-5);
		System.out.println("반지름: " + cal.getRadius() +  "일 때 원의 넓이는: " + cal.getArea());
		
		//sout은 오만 형식을 다 출력할 수 있다!
		System.out.println(10); //int타입
		System.out.println(10.5); //double타입
		System.out.println("10"); //String타입
		
		print(200);
		print(200.5);
		print("200.5");
	}
	
	//메소드 오버로딩(매개값의 타입이 다르거나 갯수가 다르면 동일한 메소드명을 사용 가능)
	public static void print(int a) {
		System.out.println("입력값은: " + a);
	}
	public static void print(double a) {
		System.out.println("입력값은: " + a);
	}
	public static void print(String a) {
		System.out.println("입력값은: " + a);
	}
}
