package com.yedam.oper;

public class OverflowExample {
	public static void main(String[] args) {
		System.out.println("최대값 :" + Integer.MAX_VALUE);
		System.out.println("최소값 :" + Integer.MIN_VALUE);
		int result = safeAdd(-2147483648, -10);
		System.out.println("a+b로 계산하면 : " + result);
		
		int result2 = safeAdd2(-2147483648, -10);
		System.out.println("결과2: " + result2);
	
		int AA = Integer.MAX_VALUE, BB = 1;
		int AB = AA + BB;
		System.out.println("AB는 : " + AB);
		
	}
	public static int safeAdd(int a, int b) {
		int sum = a + b;
		if(Integer.MAX_VALUE - b < a ) { //a+b를하면 음수값으로 변한다!
			System.out.println("유효값이 아닙니다.");
		} else if (0 - b > a) {
			System.out.println("a + b는 음수다");
		}
		else {
			sum = a + b;
		}
		return sum;
	}
	
	public static int safeAdd2(int a2, int b2) {
		int sum2 = a2 +b2;
		if(Integer.MAX_VALUE - b2 < a2 ) {
			System.out.println("참이요!");	
		} else {
			System.out.println("거짓이요!");
		}
		return sum2;
		
	}
}
	