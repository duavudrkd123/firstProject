package com.yedam.classes;

public class Main3 {
	public static void main(String[] args) {
		String[][] studAry = new String[2][3];
		Student s1 = new Student();
		s1.setStuNum(111);
		s1.setName("홍길동");
		s1.setMajor("역사");
		//System.out.println("s1: " + s1.stuNum + " " + s1.name + " " + s1.major);
	
		Student s2 = new Student(222, "김유신", "말타기");
		Student s3 = new Student(333, "최재영", "역사");
		Student s4 = new Student(444, "민해주", "말타기");
		//System.out.println("s2: " + s2.stuNum + " " + s2.name + " " + s2.major);
		
		//찾고 싶은 값만 찾기
		String searchName = "김유신";
		String searchMajor= "역사";
		Student[] sAry = {s1, s2, s3, s4};
		for (Student s : sAry) {
			if(s.getmajor().equals(searchMajor))
			System.out.println(s);  
		}
		
		// 배열로 저장하기
//		Student[] sAry = {s1, s2};
		for (Student s : sAry) {
			System.out.println(s); //=> s.toString()으로 변환함 
		}
//		
//		studAry[0][0] = Integer.toString(Stu.stuNum);
//		studAry[0][1] = Stu.name;
//		studAry[0][2] = Stu.major;
//
//		Stu.getstuNum(456);
//		Stu.getname("마바사");
//		Stu.getmajor("경영학");
//		//System.out.println(Stu.stuNum + " " + Stu.name + " " + Stu.major);
//		studAry[1][0] = Integer.toString(Stu.stuNum);
//		studAry[1][1] = Stu.name;
//		studAry[1][2] = Stu.major;
//		
//		for (int a = 0; a < studAry.length; a++) {
//			for (int b = 0; b < studAry[a].length; b++) {
//				System.out.print(studAry[a][b]);
//			}
//			System.out.println();
//		}
//		System.out.println();
	}
}
