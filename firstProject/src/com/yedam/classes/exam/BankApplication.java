package com.yedam.classes.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	int a = 0;
	
	public static void main(String[] args) {
		boolean run = true;
				while(run) {
					System.out.println("-------------------------------");
					System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
					System.out.println("-------------------------------");
					System.out.println("선택> ");
					
					int selectNo = scanner.nextInt();
					
					if(selectNo == 1) {
						createAccount();
					} else if(selectNo == 2) {
						accountList();
					} else if(selectNo == 3) {
						deposit();
					} else if(selectNo == 4) {
						withdraw();
					} else if(selectNo == 5) {
						run = false;
					}
				}
				System.out.println("프로그램 종료");
	}//end of main
	
//계좌생성하기
private static void createAccount() {
	System.out.println("-------------------------------");
	System.out.println("계좌생성");
	System.out.println("-------------------------------");
	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("계좌번호: ");
//	String ano = scan.next();
//	System.out.println("계좌주: ");
//	String owner = scan.next();
//	System.out.println("초기입금액: ");
//	int balance = scan.nextInt();
//	Account acc = new Account(ano,owner,balance);
//	for(int i=0; i<accountArray.length; i++) {
//		if(accountArray[i] == null) {
//			accountArray[i] = acc;
//			break;
//		}
//	}
	
	//random 생성기
//	System.out.println("몇 개 생성하시겠습니까?");
//	Scanner scan = new Scanner(System.in);
//	int accountN = scan.nextInt();
//	for(i=0; i = accountN; i++) {
//		
//	}
	Account AA = new Account("","",0); 
	String ano =  AA.rand() + "-" + AA.rand(); 
	String owner = "홍길동";
	int balance = 10000;
	Account acc = new Account(ano,owner,balance);
	accountArray[0] = acc;
	ano = "111-222";
	owner = "강자바";
	balance = 20000;
	acc = new Account(ano,owner,balance);
	accountArray[1] = acc;
	System.out.println("결과: 계좌가 생성되었습니다.");
}

//계좌목록보기
private static void accountList() {
	System.out.println("-------------------------------");
	System.out.println("계좌목록");
	System.out.println("-------------------------------");
	
	for(int i=0; i<accountArray.length; i++) {
		if(accountArray[i] !=null) {
			System.out.println(accountArray[i].toString());
		}
	}
}

//예금하기
private static void deposit() {
	Scanner scan = new Scanner(System.in);
	System.out.println("-------------------------------");
	System.out.println("예금");
	System.out.println("-------------------------------");
	System.out.print("계좌번호: ");
	String search = scan.next();
	System.out.print("예금액: ");
	Account a=findAccount(search);
	a.setBalance(a.getBalance() + scan.nextInt());
	System.out.println("예금이 성공되었습니다.");
	}
//	for (int i=0; i < accountArray.length; i++) {
//		if(accountArray[i].getAno().equals(search)) {
//			System.out.print("예금액: ");
//			accountArray[i].setBalance(accountArray[i].getBalance() + scan.nextInt());
//			System.out.println("예금이 성공되었습니다.");
//			break;
//		}
//		}
		

//출금하기
private static void withdraw() {
	Scanner scan = new Scanner(System.in);
	System.out.println("-------------------------------");
	System.out.println("출금");
	System.out.println("-------------------------------");
	System.out.print("계좌번호: ");
	String search = scan.next();
	System.out.print("출금액: ");
	Account a=findAccount(search);
	int out = scan.nextInt();
	if (a.getBalance() >= out) {
		a.setBalance(a.getBalance() - out);
		System.out.println("출금이 성공되었습니다.");
	} else { 
		System.out.println("예금액이 부족합니다.");
	}
}	
	
//	for (int i=0; i < accountArray.length; i++) {
//		if(accountArray[i].getAno().equals(search)) {
//			System.out.print("출금액: ");
//			int out =  scan.nextInt();
//			if(accountArray[i].getBalance() >= out) {
//				accountArray[i].setBalance(accountArray[i].getBalance() - out);
//				System.out.println("출금이 성공되었습니다.");
//				break;	
//			} else {
//				System.out.println("예금액이 부족합니다.");
//				break;
//			}
//		}
//		}


//Account 배열에서 ano와 동일한 Account 객체 찾기
private static Account findAccount(String ano) {
	Account searchAcnt = null;
	for (int i=0; i < accountArray.length; i++) {
		if(accountArray[i].getAno().equals(ano)) {
			searchAcnt = accountArray[i];	
			break;
		}
	}
	return searchAcnt;
	
}
}//end of class
