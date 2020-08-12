//논리 연산자 2개(&&, ||) 쓰면 끝까지 연산하지 않고 값을 출력할 수 있으면 바로 출력
package com.yedam.oper;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; //A=65
		//Q1
		if(charCode >= 65 & charCode <= 90) {
			System.out.println("Q1 : 대문자입니다.");
		}
		
		//Q2
		int num1 = 10;
		int num2 = 20;
		if(num1++ < 10 && num2++ > 20) { //num1++ < 10 하면 boolean 타입이 된다!
			System.out.println("Q2 : 참입니다.");
		} else {
			System.out.println("Q2 : 거짓입니다.");
		}
		System.out.println(("num1 : " + num1 + ", " + "num2 : " + num2));
		
		int a = 10; //1010(2) 
		int b = 11;//1011(2)
			  //a&b = 1010(2) = 10
		int result = a & b;
		System.out.println("논리곱 10 & 11 = " + result);
	
		result = a << 2;
		System.out.println("비트이동결과: " + result);
		// 10 = 1010(2)
		// (10 << 2) = 101000(2) = 40
		
		result = 30 << 3;
		System.out.println("비트이동결과2 : " + result);
		// 30 = 11110(2)
		// 30 << 3 = 11110000(2)
		System.out.println(128+64+32+16);
		
		result += 30; //result = result + 30;
		
		result = 80;
		boolean pass = false;
		if(result>=80) {
			pass = true;
		} else {
			pass = false;
		}
		System.out.println("if문 값은: " + pass);
		pass = (result >= 80) ? true : false;
		System.out.println("3항 연산자 값은: " + pass);
	}
}
