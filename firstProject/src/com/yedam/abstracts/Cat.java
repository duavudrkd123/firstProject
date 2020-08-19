package com.yedam.abstracts;

public class Cat extends Animal { //add unimplemented method로 추상메소드를 구현

	@Override //재정의
	public void sound() {
			System.out.println("야옹야옹..");
	}
}
