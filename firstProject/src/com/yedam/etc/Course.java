package com.yedam.etc;

public class Course {
	String courseName; //과정명
	int courseSize; //학생수
	Student[] stu;
	
	public String getCourseName() {return courseName;}
	public void setCourseName(String courseName) {this.courseName = courseName;	}
	public int getCourseSize() {	return courseSize;	}
	public void setCourseSize(int courseSize) {this.courseSize = courseSize;}
	public Student getStudent(int i) {
		return stu[i];
	}
	
	public Course(String courseName, int courseSize)  {
		this.courseName = courseName;
		this.courseSize = courseSize;
		this.stu = new Student[courseSize];//
	}
	
	public void creCourse (String courseName, int courseSize) {
		this.courseName = courseName;
		this.courseSize = courseSize;
	}
	
	public void creStu (Student stu) {
		for(int i=0; i<courseSize; i++) {
			if (this.stu[i] == null) {
				this.stu[i] = stu;
				break;
			}
		}
	}
}
