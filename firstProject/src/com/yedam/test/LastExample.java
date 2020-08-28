package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class LastExample {
public static void main(String[] args) {
	
	List<CreList> list = new ArrayList<CreList>();
	Pet pet = new Pet();
	Fruit fruit = new Fruit();
	CreList cre = new CreList();
	
	pet = new Pet("야옹이", 2, "수컷");
	fruit = new Fruit("사과", 500);
	cre = new CreList("최재영",20,pet,fruit);
	list.add(cre);
	pet = new Pet("멍멍이", 1, "암컷");
	fruit = new Fruit("키위", 100);
	list.get(0).addNew(pet, fruit);
	list.get(0).print2();
	
	pet = new Pet("똘똘이", 7, "수컷");
	fruit = new Fruit("멜론", 200);
	cre = new CreList("민해주",21,pet,fruit);
	list.add(cre);
	pet = new Pet("바람이", 6, "수컷");
	fruit = new Fruit("바나나", 200);
	list.get(1).addNew(pet, fruit);
	list.get(1).print2();
	
	pet = new Pet("귀염이", 5, "수컷");
	fruit = new Fruit("포도", 600);
	cre = new CreList("김상민",22,pet,fruit);
	list.add(cre);
	pet = new Pet("허스키", 3, "암컷");
	fruit = new Fruit("딸기", 100);
	list.get(2).addNew(pet, fruit);
	list.get(2).print2();
}
}
