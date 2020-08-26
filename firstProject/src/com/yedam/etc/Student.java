package com.yedam.etc;

public class Student {
	String name;
	int age;
	int score;
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
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

	public int getscore() {
		return score;
	}

	public void setscore(int score) {
		this.score = score;
	}
	
}
