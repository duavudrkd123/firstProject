package com.yedam.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal anm = new Animal(); //추상클래스는 인스턴스 생성 불가능!
		Animal anm = new Cat();
		anm.breathe();
		anm.sound();
		
		anm = new Dog();
		anm.breathe();
		anm.sound();
		
		int a =10;
		double b = a; //promotion(자동형변환)
		a=(int)b; //casting
		
		Dog dog = (Dog)anm; //자식클래스의 메서드를 부모클래스의 메서드로 형 변환
		dog.sound();
	}
}
