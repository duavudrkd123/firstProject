package com.yedam.api;

public class User implements Comparable<User>{
	String name;
	int grade;
	
	User(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	@Override
	public int compareTo(User o) {
		return this.grade - o.grade;
//		return o.grade  -  this.grade ;
	}
	
}
