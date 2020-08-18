package com.yedam.classes.statics;

import com.yedam.classes.Person;

public class SingletonExample {
	private void mian() {
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance(); //-> getInstance메소드로만 호출 가능
		Singleton s2 = Singleton.getInstance();
		
		if(s1==s2 ) {
			System.out.println("동일한 instance입니다.");
		} else {
			System.out.println("다른 instance입니다.");
		}
		
		Person p1 = new Person();
		//p1.name = "111";//패키지가 다르면 호출 불가
		p1.setName("1111"); //public 붙은 메서드는 패키지가 달라도 접근 가능
	}
}
