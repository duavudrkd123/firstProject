package com.yedam.classes;

public class Friend { //클래스는 대문자로 시작! 나머지는 소문자로 시작!
	
	//필드
	private String name; //private은 다른 클래스에서 값을 못 보게 한다
//	String name;
	private int age;
	private String phone;
	
	//생성자
	public Friend(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	//생성자 오버로딩
	public Friend () {}
// 변수 값만 다르면 오버로딩 X
//	public Friend2(String n, int a, String p) {
//	}
	
	
//	@Override
//	public String toString() {
//		return "이름: " + name + ", 나이: " + age + ", 번호: " + phone;
//	}
	//메소드
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "일반친구 이름: " + this.getName()
		+ ", 연락처: " +this.getPhone();
	}
	
	
	
	
}
