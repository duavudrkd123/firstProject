package com.yedam.cond;

public class SwitchExample {
	public static void main(String[] args) {
		double m1 = Math.random(); //0~1사이의 임의의 실수 생성(0<m<1)
		System.out.println("m1은: " + m1);
		double m2= Math.random() *6; //0~6사이의 임의의 실수 생성
		System.out.println("m2은: " + m2);
		int m3=(int) (Math.random() *6); //0~6사이의 임의의 정수 생성
		System.out.println("m3은: " + m3);
			for(int a=0;a <100; a+=1) {
		int m4=(int) (Math.random() *6) +1; //1~7사이의 임의의 정수 생성
		//System.out.println("m4는: " + m4);	
		switch(m4) {
		case 1:
			System.out.println("m4는 1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("m4는 2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("m4는 3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("m4는 4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("m4는 5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("m4는 6번이 나왔습니다.");
			break;
		}
				}
	}
}
