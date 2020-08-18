package com.yedam.inherit;

public class Parent {
	private String name;
	private int age;
	
	public Parent() {
	}
	
	public Parent(String name, int age) /*extends Object 가 생략되어 있다*/  {
		super(); //부모클래스의 생성자 호출
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
//		return super.toString(); //->object의 toString 은 주소 값을 나타낸다
		return "Parent [name=" + name + ", age=" + age + "]"; //->이렇게 재정의할 수 있다.
	}
	
	
}
