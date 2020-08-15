package com.yedam.classes;

public class Friend {
	
	String name = "";
	int age = 0;
	String pNum="";
	//기본생성자
	public Friend() {
	}
	public Friend(String name, int age, String pNum) {
		this.name = name;
		this.age = age;
		this.pNum = pNum;
	}
	//메소드
	public void setname(String name) {
		this.name =name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setpNum(String pNum) {
		this.pNum = pNum;
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public String pNum() {
		return pNum;
	}
	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age + ", 전화번호: " + pNum;
	}
	
	public int mkPN() {
		int A = 0;
		for (int a = 0; a<8; a++) {
			A = (int)(Math.random() * 10);
		}
	return A;
	}
	
}
