package com.yedam.Note;

import java.util.Scanner;

public class LottoInstance {
	public static void main(String[] args) {
		LottoClass Lot = new LottoClass();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("1.번호 뽑기 2.중복 검출기 9.종료");
			System.out.print(">");
			int num = scan.nextInt();
			if(num == 1) {
				Lot.Creat();//번호 뽑기
				System.out.println();
			} else if(num == 2) {
				for(int i=1; i<100; i++) { //중복 검출기
					Lot.Creat();
					System.out.println();
					System.out.println();
					Lot.vriRep();	
				} 	
			}
			else if(num == 9) {
				run = false;
			} else {
				System.out.println("번호를 다시 입력해 주십시오.");
			}
		}
		System.out.println("종료합니다.");
	}
}
