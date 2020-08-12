package com.yedam.oper;

public class InfinityExample {
	public static void main(String[] args) {	
	int x = 5;
	double y = 0.0;
	
	double z1 = x / y;
	double z2 = x % y;
	if(Double.isInfinite(z1) || Double.isNaN(z2)) {
		System.out.println("의미없는 값입니다.");
		System.out.println("z1: " + z1);
		System.out.println("z2: " + z2);
	} else {
		System.out.println("의미있는 값입니다.");
		System.out.println("z1: " + z1);
		System.out.println("z2: " + z2);	
	}
	//int 넣어보자 
	int x2 = 5;
	int y2 = 0;
	
	double z12 = x / y;
	double z22 = x % y;
	if(Double.isInfinite(z1) || Double.isNaN(z2)) {
		System.out.println("의미없는 값입니다.");
		System.out.println("z1: " + z12);
		System.out.println("z2: " + z22);
	} else {
		System.out.println("의미있는 값입니다.");
		System.out.println("z1: " + z12);
		System.out.println("z2: " + z22);	
	}
}
	
}	
