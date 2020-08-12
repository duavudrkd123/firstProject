package com.yedam.test;

public class Example03 {
	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
		System.out.println(!(score>90));
	}
}
