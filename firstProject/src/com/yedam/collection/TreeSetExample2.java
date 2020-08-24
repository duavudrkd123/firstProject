package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Hong1", 10));
		set.add(new Person("Hong2", 14));
		set.add(new Person("Hong3", 12));
		set.add(new Person("Hong4", 11));
		set.add(new Person("Hong5", 13));

		Iterator<Person> iter = set.iterator();
//		while(iter.hasNext()) { //hasNext()한거를 next()로 안 빼주면 무한반복한다!
//			Person A =iter.next();
//			System.out.println("이름: " + A.name + ", 나이: " + A.Age); 
//		}

//		//next()를 만날때 마다 값을 새로 뽑아서 오류!
//		while(iter.hasNext()) {
//			System.out.println(iter.next().name + ", " + iter.next().Age); 
//		}

		SortedSet<Person> sSet = set.headSet(new Person("Sorted", 13));
		// 13보다 큰 값만 담기(내림차순일때)
		// 13보다 작은 값만 담기(오름차순일때)
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.Age);
		}
		System.out.println("--------------1-----------------");
		NavigableSet<Person> nSet = set.headSet(new Person("Sorted", 12), true);
		for (Person person : nSet) {
			System.out.println(person.name + ", " + person.Age);
		}
		System.out.println("--------------2-----------------");
		sSet = set.tailSet(new Person("Sorted", 13));
		// 13보다 큰 값만 담기(오름차순일때)
		// 13보다 작은 값만 담기(내림차순일때)
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.Age);
		}
		System.out.println("--------------3-----------------");
		sSet = set.subSet(new Person("Temp", 10), false, new Person("Temp2", 13), false);
		// 10보다 크거나 같고 13보다 작은 값을 가져오겠다(구간 지정 기능 [A<=n<B])
		// true, false로 <=랑 < 조정 가능
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.Age);
		}
		System.out.println("--------------4-----------------");
		nSet = set.headSet(new Person("Sorted", 12), true);//12도 포함하겠다
		sSet = set.subSet(new Person("Temp", 10), true, new Person("Temp2", 13), true);//10이랑 13도 포함하겠다
		for (Person person : nSet) {
			System.out.println(person.name + ", " + person.Age);
		}
	}
}