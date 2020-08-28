package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class CreList {
	String name;
	int age;
	List<Pet> pet;
	List<Fruit> fruit;
	
	public CreList() {
	}

	public CreList(String name, int age, Pet pet, Fruit fruit) {
		this.name = name;
		this.age = age;
		this.pet = new ArrayList<Pet>();
		this.fruit = new ArrayList<Fruit>();
		this.pet.add(pet);
		this.fruit.add(fruit);
	}
	
	public void addNew(Pet pet, Fruit fruit) {
		this.pet.add(pet);
		this.fruit.add(fruit);
	}

	public void print() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("애완동물");
		for(Pet A : pet) {
			System.out.println("이름: " + A.name + ", 나이" + A.age + " 성별: " + A.gender);
		}
		System.out.println("과일");
		for(Fruit A : fruit) {
			System.out.println("이름: " + A.name + ", 가격: " + A.expensive);
		}
	}
	
	public void print2() {
		System.out.print(name + ", " + age + ", [");
		for(Pet A : pet) {
			System.out.print("{" + A.name + ", " + A.age + ", " + A.gender + " } ");
		}
		System.out.print("] [" );
		for(Fruit A : fruit) {
			System.out.print("{ " + A.name + ", " + A.expensive + " } ");
		}
		System.out.print("]" );
		System.out.println();
	}
	
	
}
