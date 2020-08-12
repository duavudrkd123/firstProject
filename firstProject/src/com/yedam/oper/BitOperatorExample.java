package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 10; //00001010(2)
		int v2 = ~v1; //10001011(2) => -11
		//~n =-(n+1) => 걍 1더해서 음수 붙이면 된다
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		/*연산자 쓰면 int된다!*/
		byte b1 = 10;
		byte b2 =5;
		//byte b3 =b1 + b2; //연산자 쓰면 int된다!
		byte b3 =(byte) (b1 + b2);
		int b4 =b1 + b2;
		
		double result = 10/4; //2.5지만 int타입이라 2으로 계산된다.
		double result2 = 10/4.0; //하나를 double로 바꾸면 해결!
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
	}
}
