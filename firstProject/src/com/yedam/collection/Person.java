package com.yedam.collection;

public class Person implements Comparable<Person> {
	public String name;
	public int Age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		Age = age;
	}

	@Override
	public int compareTo(Person o) {
		return this.Age - o.Age; //나이를 기준으로 정렬 시킴(음수: 오름차순)
//		return o.Age - this.Age ; //나이를 기준으로 정렬 시킴(양수: 내림차순)
	}
}
