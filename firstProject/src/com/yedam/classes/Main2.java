package com.yedam.classes;

public class Main2 {
	public static void main(String[] args) {
		String[][] studAry = new String[2][3];
		Student Stu = new Student();
		Student Stu2 = new Student();
		Stu.SetstuNum(333);
		Stu.Setname("가나다");
		Stu.Setmajor("심리학");
		//System.out.println(Stu.stuNum + " " + Stu.name + " " + Stu.major);
		studAry[0][0] = Integer.toString(Stu.getstuNum());
		studAry[0][1] = Stu.name;
		studAry[0][2] = Stu.major;

		Stu2.SetstuNum(456);
		Stu2.Setname("마바사");
		Stu2.Setmajor("경영학");
		//System.out.println(Stu.stuNum + " " + Stu.name + " " + Stu.major);
		studAry[1][0] = Integer.toString(Stu2.stuNum);
		studAry[1][1] = Stu2.name;
		studAry[1][2] = Stu2.major;
		
		
		for (int a = 0; a < studAry.length; a++) {
			for (int b = 0; b < studAry[a].length; b++) {
				System.out.print(studAry[a][b]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
