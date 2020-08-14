package com.yedam.classes;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = null;
		int b=0, c=0;
		
//			System.out.print("이름을 입력하세요> ");
//			a = scanner.nextLine();
//			System.out.print("나이를 입력하세요> ");
//			b = scanner.nextInt();
//			System.out.print("전화번호를 입력하세요> ");
//			c = scanner.nextInt();
//			Friend F1 = new Friend(a, b, c);
//			
//			System.out.print("이름을 입력하세요> ");
//			a = scanner.nextLine();
//			a = scanner.nextLine();
//			System.out.print("나이를 입력하세요> ");
//			b = scanner.nextInt();
//			System.out.print("전화번호를 입력하세요> ");
//			c = scanner.nextInt();
//			Friend F2 = new Friend(a, b, c);
//			
//			System.out.print("이름을 입력하세요> ");
//			a = scanner.nextLine();
//			a = scanner.nextLine();
//			System.out.print("나이를 입력하세요> ");
//			b = scanner.nextInt();
//			System.out.print("전화번호를 입력하세요> ");
//			c = scanner.nextInt();
//			Friend F3 = new Friend(a, b, c);
//			
			
			a = "가나";
			b = 11;		
			c = 1111;
			Friend F1 = new Friend(a, b, c);			
			a = "다라";			
			b = 22;			
			c = 2222;
			Friend F2 = new Friend(a, b, c);			
			a = "마바";			
			b = 33;			
			c = 3333;
			Friend F3 = new Friend(a, b, c);
	
			Friend[] sAry = {F1, F2, F3};
			for (Friend f : sAry) {
				System.out.println(f); 
			}
			String A = null; 
//			System.out.print("찾고 싶은 이름을 입력하세요.>");
//			A = scanner.nextLine();	
			String searchName = A;
//			
//			for (Friend f : sAry) {
//				if(f.getname().equals(searchName))	
//				System.out.println(f); 
//			}
//			System.out.print(F1.name + "어떻게 바꾸시겠습니까?>");
//			a = scanner.nextLine();
//			F1.setname(a);
//			System.out.println("수정한 이름: " + F1.name);
			
			System.out.print("원래 이름을 입력하세요.>");
			A = scanner.nextLine();
			searchName = A;
			System.out.print("수정할 이름을 입력하세요.>");
			String B = scanner.nextLine();
//			System.out.println(A);
			if (F1.name.equalsIgnoreCase(A))  {
//				System.out.println("실행했습니다.");
				a = B;
				b = 11;		
				c = 1111;
				F1 = new Friend(a, b, c);	
			} else {
//				System.out.println("틀리다는데여");
			}
			
			sAry[0] = F1;
			sAry[1] = F2;
			sAry[2] = F3;
			
			System.out.println("수정완료");
			for(Friend f : sAry) {
//				if(f.getname().equals(B))	
				System.out.println(f); 
			}
			
	}
}
