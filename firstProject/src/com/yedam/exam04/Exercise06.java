package com.yedam.exam04;

public class Exercise06 {
	public static void main(String[] args) {
		int d = 10;
		for (int b = 10; b > 0; b-=1) {
			for (int a = b; a > 0; a--) {
				System.out.print(" ");
			}
			for (int c = 11 ; c > d; c-=1) {
				System.out.print("*");
			}
			d -=2;
			System.out.println();
		}
	}
}
