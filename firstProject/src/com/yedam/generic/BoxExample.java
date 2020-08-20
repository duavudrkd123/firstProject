package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set(new String("Hello"));
		String result = box.get();
		
		Box<Person> box2 = new Box<>();//뒤에 <>내용은 생략가능
		box2.set(new Person());
//		result = box2.get(); // String타입에 넣으려고 하면 오류 발생
		Person p1 = box2.get();
		
		Box<Person> box3 = Utils.boxing(new Person());
		
		Box<String> box4 = Utils.boxing(new String("hhh"));
		
//		Box box = new Box();
//		String str1 = new String("Hello");
//		box.set(str1);
//		String result = (String) box.get(); 
//		//box.get()은 부모클래스의 Object타입을 리턴한다! => String으로 형 변환
//		
//		Person p1 = new Person();
//		box.set(p1);
//		Person p2 = (Person) box.get();
//		
//		result = (String) box.get(); //runtime error(실행오류)
		
		
	}
	
	
}
