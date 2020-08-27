//package com.yedam.test;
//
//import java.util.HashSet;
//import java.util.Set;
//import com.yedam.collection.Person;
//
//public class Examples04 {
////	public static void main(String[] args) {
////		int[] intAry = new int[3];
////		int Randnum = 0;
////		for (int a = 0; a <intAry.length; a++) {
////			Randnum = (int) (Math.random() * 6)+1;
////				intAry[a] = Randnum;
////			for(int b=0; b<a; b++) {
////				if(intAry[b] == Randnum) {
////					a--;
//////					break;
////				}
////			}
////		}
////		for(int i = 0; i <3; i++) {
////			System.out.println(intAry[i]);	
////		}
////	}
//	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
//		while (true) {
//			int temp = (int) (Math.random()*6) +1;
//			set.add(temp);
//			if(set.size() == 6) {
//				break;
//			}
//		}
//		for(Integer it : set ) {
//			System.out.println(it);
//		}
//		
//		Set<Person> pSet = new HashSet<>();
//		pSet.add(new Person("Hong1", 20));
//		pSet.add(new Person("Hong2", 20));
//		pSet.add(new Person("Hong3", 20));
//		for(Person p : pSet) {
//			System.out.println(p.name + ", " + p.Age);
//		}
//	}
//}
