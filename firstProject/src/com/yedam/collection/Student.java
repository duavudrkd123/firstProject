package com.yedam.collection;

import java.util.Comparator;

public class Student implements Comparable <Student> {//Student를 기준으로 대소를 정한다
	private String name;
	private int mathScore;
	private int engScore;

	public Student(String name, int mathScore, int engScore) {
		super();
		this.name = name;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	@Override
	public int compareTo(Student o) {
		return (this.mathScore + this.engScore)  - (o.mathScore+o.engScore);
		
//		if((this.mathScore + this.engScore)  < (o.mathScore+o.engScore))
//			return -1;
//		else
//			return 1;
	}


}
