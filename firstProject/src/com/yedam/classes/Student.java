package com.yedam.classes;

public class Student {
	//필드
	int stuNum = 0;
	String name = "ananymous";
	String major = "no info";
	
	//기본생
	public Student () { //기본 생성자 만들어야함
	}
	public Student (int a) {
		this.stuNum = a;
	}
	
	public Student (int a, String b) {
		this.stuNum = a;
		this.name = b;
	}
//	public Student (int a, String b, String c) {
//		this.stuNum = a;
//		this.name = b;
//		this.major = c;
//	}
	//source - Generate Constructor using field
	public Student(int stuNum, String name, String major) {
		super();
		this.stuNum = stuNum;
		this.name = name;
		this.major = major;
	}

	//메소드
	//source - Generate getters and setters
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void SetstuNum(int i) {
		this.stuNum = i;
	}
	public void Setname(String j) {
		this.name =  j;
	}
	public void Setmajor(String n) {
		this.major = n;
	}
	
	
	public int getstuNum() {
		return stuNum;
	}
	public String getname() {
		return name;
	}
	public String getmajor() {
		return major;
	}
	//source - toString => 주소값을 객체로 변환함
//	@Override
//	public String toString() {
//		return "Student [stuNum=" + stuNum + ", name=" + name + ", major=" + major + "]";
//	}
	@Override
	public String toString() {
		return "학번은 " + stuNum + ", 이름은 " + name + ", 전공은 " + major;
	}
	
}
