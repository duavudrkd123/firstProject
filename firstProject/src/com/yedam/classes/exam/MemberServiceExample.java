package com.yedam.classes.exam;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {
		//db
		Member[] members = new Member[3];
		members[0] = new Member("홍길동", "hong"); //(name, id)
		members[0].setPassword("hong123");
		members[1] = new Member("김유신", "kim");
		members[1].setPassword("kim123");
		members[2] = new Member("최재영", "choi");
		members[2].setPassword("choi123");
		
		//로그인정보
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요>");
		String name = scn.next();
		System.out.println("ID를 입력하세요>");
		String id = scn.next();
		System.out.println("password를 입력하세요>");
		String password = scn.next();
		Member mem1 = new Member(name,id);
		mem1.setPassword(password);
		
		MemberService mService = new MemberService();
		boolean result = mService.login(mem1.getId(), mem1.getPassword(), members);
		if (result) {
			System.out.println(mem1.getName() + "님 로그인되었습니다.");
		} else {
			System.out.println("id 또는 password를 확인하세요.");
		}
		
//			mService.logout();
	}
	
}
