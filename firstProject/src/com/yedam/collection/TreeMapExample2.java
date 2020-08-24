package com.yedam.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class Fruit {
	String name;
	int price;
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
}

class FruitComp implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.price-o2.price; //오름차순(음수), 내림차순(양수)
	}
	
}
public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Fruit, Integer> map = new TreeMap<>(new FruitComp()); //new FruitComp()를 통해 값들의 대소 비교
		map.put(new Fruit("Orange", 1000), 1);
		map.put(new Fruit("Grape", 3000), 2);
		map.put(new Fruit("Banana", 2000), 3);
		Set<Fruit> set = map.keySet(); //key값만 빼오기
		//NavigableSet은 값에 대소의 의미를 부여해준다
		NavigableSet<Fruit> dSet = map.descendingKeySet(); //내림차순으로 가져오기
		dSet = map.navigableKeySet();//순번대로 가져오기 
		Iterator<Fruit> iter = dSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
			
	}
}
