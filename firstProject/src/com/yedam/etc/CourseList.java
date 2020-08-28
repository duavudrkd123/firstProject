package com.yedam.etc;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
   String name;
   int size;
   List<StudentList> student;
   
   public CourseList(String name, int size) {
      this.name = name;
      this.size = size;
      this.student = new ArrayList<StudentList>(size);
   }

   public String getName() {return name;}
   public void setName(String name) {this.name = name;}
   public int getSize() {return size;}
   public void setSize(int size) {this.size = size;}
   public List<StudentList> getStudent() {return student;}
   public void setStudent(StudentList student) {
      if(this.student.size() <= this.size) {
         this.student.add(student);   
      } else {
         System.out.println("수강인원을 초과하였습니다.");
      }
   }
}