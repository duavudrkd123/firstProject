package com.yedam.interfaces;
class Anonymous {
	void run() {
		System.out.println("실행.");
	}
}

interface AnonymInterface {
	void run();
}

public class AnonymousExample {
	public static void main(String[] args) {
		AnonymInterface anonymIntf = new AnonymInterface() {//인터페이스 구현
			
			@Override
			public void run() {
				System.out.println("자식 구현 객체 실행.");
			}
		};
		anonymIntf.run();
		
		Anonymous anonym = new Anonymous() { //자식 클래스 만들기
			String str;

			@Override
			void run() {
				System.out.println("자식 실행.");
			}
			
		};
		anonym.run();
	}
}
