package com.yedam.etc;

public class StudentList {
	String name;
	   int age;
	   int score;
	   
	   public StudentList() {};
	   
	   public StudentList(String name, int age, int score) {
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

	   public int getScore() {
	      return score;
	   }

	   public void setScore(int score) {
	      this.score = score;
	   }
}
