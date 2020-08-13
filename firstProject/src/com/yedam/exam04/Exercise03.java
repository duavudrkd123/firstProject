package com.yedam.exam04;

public class Exercise03 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 3; i <100; i +=3) {
			a = a + i;
		}
		System.out.println("3의 배수의 합: " + a);
	}
}
