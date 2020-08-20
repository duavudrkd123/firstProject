package com.yedam.collection;
//com.yedam.classes.Member 같은 이름에 클래스는 package를 통해 구별
//com.yedam.collection.Member
public class Member {
	private String name;
	private int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	// hashcode와 equals 활용하면 논리적으로 동일한 객체 생성가능
	@Override
	public int hashCode() { //hashCode는 문자에 Code를 부여해서 글자가 같은지 판별
//		return 0; //=> 다 같은 값으로 입력해버림
		return this.age; //=>age가 같으면 같은 값으로 입력
//		return this.name; //=>name이 같으면 같은 값으로 입력
//		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
//		return true;
		Member mem = (Member) obj;//=>name이 같으면 같은 값으로 입력
		return this.name.equals(mem.name);
//		return super.equals(obj);
	}
	
}
