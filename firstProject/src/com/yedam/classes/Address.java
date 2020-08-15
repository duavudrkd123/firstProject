package com.yedam.classes;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {
		Friend[] FriA = null;
//		Friend F1 = new Friend(); //??????????????????????
		Scanner Scan = new Scanner(System.in);
		boolean run = true;
		
		System.out.print("몇 명을 입력하시겠습니까?>");
		int FNum = Scan.nextInt();
		FriA = new Friend[FNum];
		System.out.println(FNum + "명의 자료를 입력합니다.");
		for(int a = 0; a < FriA.length; a++) {
			Friend F1 = new Friend();
			F1.setname("실험" + (a + 1));
			F1.setage((int) (Math.random() * 45) + 1);
			F1.setpNum("010" + F1.mkPN() + F1.mkPN() + F1.mkPN() + F1.mkPN() + F1.mkPN() + F1.mkPN() + F1.mkPN() + F1.mkPN());
			FriA[a] = F1; 
			System.out.println(FriA[a]);
		}
		
		
//		for(int a = 0; a < FriA.length; a++) {
//			Friend F1 = new Friend(); //??????????????????
//			System.out.println(a + 1 + "번의 자료입니다.");
//			System.out.print("이름>");
//			F1.setname(Scan.next());
//			System.out.print("나이>");
//			F1.setage(Scan.nextInt());
//			System.out.print("번호>");
//			F1.setpNum(Scan.next());
//			FriA[a] = F1; 
//			System.out.println(FriA[a]);
//		}
		System.out.println("입력한 자료를 확인합니다.");
		for(int a=0; a<FriA.length; a++) {
			System.out.println(a + 1 + "번: " + FriA[a]);
		}
		while(run) {
			System.out.println("1.조회 2.조건 조회 3.조회 및 수정 9.종료");
			int num = Scan.nextInt();
			if(num == 1) {
				System.out.println("입력한 자료를 확인합니다.");
				for(int a=0; a<FriA.length; a++) {
					System.out.println(a + 1 + "번: " + FriA[a]);
				}
			} else if(num == 2) {
				System.out.println("조건에 맞는 자료만 조회합니다.");
				System.out.print("찾고 싶은 이름>");
				String search = Scan.next();
				for(int a = 0; a < FriA.length; a ++) {
					if(FriA[a].getname().equals(search)) {
						System.out.println(FriA[a]);
					}
				}	
			} else if(num == 3) {
				System.out.print("수정할 대상을 입력하세요>");
				String search = Scan.next();
				for(int a = 0; a < FriA.length; a ++) {
					if(FriA[a].getname().equals(search)) {
						System.out.print("어떻게 바꿀까요?>");
						FriA[a].setname(Scan.next());
						System.out.println(FriA[a]);
					}
				}	
			} else if(num == 9) {
				run = false;
				System.out.println("종료합니다.");
			}
		}
	
	}
}
