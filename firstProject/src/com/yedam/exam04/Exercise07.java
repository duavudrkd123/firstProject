package com.yedam.exam04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0, input = 0;
		Scanner scanner = new Scanner(System.in);
		
				while (run) {
					System.out.println("-----------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-----------------------------------------");
					System.out.println("선택> ");
					int menu = scanner.nextInt();
					
					if (menu == 1) { //예금
						System.out.println("예금 금액을 입력하세요> ");
						input = scanner.nextInt();
						balance = balance + input;
					} else if (menu ==2) { //출금
						System.out.println("출금 금액을 입력하세요> ");
						input = scanner.nextInt();
						balance = balance - input;
					} else if (menu ==3) {//잔고
						System.out.println("잔액: " + balance);
					} else if(menu == 4) {//종료
						run = false;
					}
					
				}//end of while
				System.out.println("프로그램종료.");
	}//end of main
}//end of class
