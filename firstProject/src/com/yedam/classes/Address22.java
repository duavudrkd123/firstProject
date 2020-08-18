package com.yedam.classes;

import java.util.Scanner;

public class Address22 {
	public static void main(String[] args) {
		
		//1, 정보입력(이름, 나이, 전화번호)
		//2. 리스트\
		//3. 이름조회
		//4. 이름조회 후 수정
		//9. 종료
		Friend friends2 = new Friend("가나다", 11, "123");
		Friend[] friends = new Friend[100];
		Scanner scn = new  Scanner(System.in);
		boolean run  =true;
//		System.out.println(friends2.name); //->private 되어 있어 값을 볼 수 없다
		//메뉴출력
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 정보입력(이름, 나이, 전화번호) 2. 리스트 3.이름조회 4.이름조회 후 수정 9.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			int selectNo = scn.nextInt(); //-> 엔터값을 처리 못해서 흘린다
			scn.nextLine(); //-> 엔터값을 없애주는 역할
			if(selectNo ==1) {
				System.out.print("이름입력> ");
				String name = scn.nextLine();
				System.out.print("나이입력> ");
				int age = scn.nextInt();
				scn.nextLine();
				System.out.print("전화번호입력> ");
				String phone = scn.nextLine();
				Friend f = new Friend(name, age, phone); //->인스턴스 생성
				for(int i = 0; i <friends.length; i++) {
					if(friends[i] == null) {
						friends[i] = f;
						break;
					}
				}
			} else if(selectNo ==2) {
				for(Friend frnd : friends) { //friends라는 배열의 크기만큼 루핑을 돈다
					if(frnd != null) {
						System.out.println("이름: " + frnd.getName() + ", 나이: " + frnd.getAge() + ", 전화번호: " + frnd.getPhone());
					}
				}
			} else if(selectNo ==3) {
				System.out.println("찾을 이름을 입력하세요>");
				String search = scn.next();
				for(int i=0; i<friends.length; i++) {
					if (friends[i].getName().equals(search)) {
						System.out.println(friends[i].toString());
						break;
					}
				}
			} else if(selectNo ==4) {
				System.out.println("대상을 입력하세요>");
				String search = scn.next();
				for(int i=0; i<friends.length; i++) {
					if (friends[i].getName().equals(search)) {
						System.out.println("어떻게 바꾸시겠습니까?>");
						String change = scn.next();
						friends[i].setName(change);
						System.out.println(friends[i].toString());
						break;
					}
				}
			} else if(selectNo ==9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}//end of main()
}//end of class
