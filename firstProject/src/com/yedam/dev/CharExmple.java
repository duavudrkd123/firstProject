package com.yedam.dev;

public class CharExmple {
	public static void main(String[] args) {
		char c1 = 44032;
		for (int i = 0; i < 26; i++) {
			System.out.print(c1++ + "\t");
		}

		char c2 = '가';
		System.out.println((char) c2);
	}
}
