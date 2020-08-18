package com.yedam.inherit;

public class Child extends Parent {
	private int grade;
	
	public Child(String name, int age) {
			super(name, age); //부모클래스의 생성자를 가져옴 
	}
	public Child(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
