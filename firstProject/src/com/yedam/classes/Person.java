package com.yedam.classes;

public class Person {//클래스 생성
	//필드
	String name; 
	int age;
	//생성자(public이랑 변수 사이에 형식(int, String)이 안 들어감, class와 이름이 같음
		public Person() { //매개값으로 필드를 초기화
			name = "anonymous";
			age = 10;
		}
		public Person(String name) {
			this.name = name;
			//this는 매개값이랑 필드를 구분하기 위해 사용
			//this 붙이면 인스턴스를 나타낸다
		}
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	
	//메소드(public 반환타입 이름)
	public String introduce() {//return값을 String형식으로 반환해라
		return "이름은 " + name + " 나이는 " + age;
	}
	public String getName() {//getName메소드를 쓰면 name값을 호출하라
		return name;
	}
	public void setName(String name) {//name필드에 ()값을 넣어라
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {//void는 반환되는 값(return)이 없다는 뜻
		this.age = age;
	}
	
}
