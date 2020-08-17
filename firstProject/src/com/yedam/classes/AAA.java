package com.yedam.classes;

import java.lang.reflect.Array;
import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
		boolean run = true;
		int friendNum = 0;
		Friend[] Fri = null;
//		Friend F1 = new Friend("", 0, "");

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.정보입력 | 2.리스트 | 3.이름조회 | 4.수정 | 9.종료");
			System.out.println("---------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("친구 수를 입력하세요> ");
				friendNum = scanner.nextInt();
				System.out.println("친구 수에 " + friendNum + "가 입력되었습니다");
				Fri = new Friend[friendNum];
				for (int i = 0; i < Fri.length; i++) {
					Friend F1 = new Friend("", 0, "");
					System.out.print("이름");
					F1.setname(scanner.nextLine());
					scanner.nextLine();//엔터키 제거
					System.out.print("나이");
					F1.setage(scanner.nextInt());
					System.out.print("번호");
					F1.setpNum(scanner.nextLine());
					scanner.nextLine();
					Fri[i] = F1;
				}
			} else if (selectNo == 2) {
				System.out.println("입력된 리스트를 출력합니다.");
				for (int i = 0; i < Fri.length; i++) {
					System.out.println(Fri[i].toString());
				}
			} else if (selectNo == 3) {
				System.out.println("조회할 이름을 입력하시오.");
				scanner.nextLine();
				String sname = scanner.nextLine();
				for (int i = 0; i < Fri.length; i++) {
					if(sname.equals(Fri[i].getname())) {
						System.out.println(Fri[i].toString());
					}
				}
			} else if (selectNo == 4) {
				System.out.println("조회할 이름을 입력하시오.");
				String sname2 = scanner.next();
				String sname3 = "";
				for (int i = 0; i < Fri.length; i++) {
					if(sname2.equals(Fri[i].getname())) {
						System.out.println("수정할 이름");
						Fri[i].setname(sname3 = scanner.next());
					}
				}
			} else if (selectNo == 9) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}
}
