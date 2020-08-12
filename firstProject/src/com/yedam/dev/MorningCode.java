package com.yedam.dev;
public class MorningCode {	
	//1
	public static void introduce() {//void = 반환되는 값이 없다. => 메소드 안에서 값이 다 처리된다. 
		System.out.println("안녕하세요. 저는 김상민입니다.");
	}
	//2
	public static void introduce2(String name) {//String을 통해 매개값(name)을 추가한다.  
		System.out.println("안녕하세요. 저는 " + name + "입니다.");	
	}
	//3
	public static int add( int x, int y) { 		//메소드 add는 정수 변수 x와 y를 가진다.
		int sum = x + y;									//정수 변수 sum은 x+y이다.
		return sum; 										//retrun은 메소드의 결과값을 반환한다.
	}
	//4
	public static int minus( int v1, int v2) {
		int mm = v1 - v2;
		return mm;
	}
	public static void main(String[] args) { //main 메소드
		String str1 = "Hello";
		String str2 = "World";
		String name = "김상민";
		System.out.println(str1 + ", " + name);

		//1
		introduce(); // 메소드 introduce실행 
		//2
		introduce2("홍길동"); // 메소드 introduce2실행
		//3
		int v1 =150, v2 = 270; //정수변수 v1은 150, v2는 270이다.
		int result = add(v1, v2); // 변수 result는 메소드 add의 결과값이 된다. 
		System.out.println("v1+v2의결과값: " + result);
		//4
		int result2 = minus(v1, v2);
		System.out.println("v1-v2의 결과는 " + result2);
	}
}
