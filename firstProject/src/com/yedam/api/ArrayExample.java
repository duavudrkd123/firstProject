package com.yedam.api;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
//		int[] scores = {95, 80, 36, 88};
//		Arrays.parallelSort(scores);
//		for(int A : scores) {
//			System.out.print(A + " ");
//		}
//		System.out.println();

		String[] names = { "Hong", "Park", "Choi" };
		System.out.println("------정렬전-------");
		for (String A : names) {
			System.out.println(A);
		}
		System.out.println("------정렬후-------");
		Arrays.parallelSort(names);
		for (String A : names) {
			System.out.println(A);
		}
		
		System.out.println("--------grade로 정렬--------");
		User[] users = { new User("user1", 1), new User("user2", 2), new User("user3", 3) };
		Arrays.sort(users);
		for (User s : users) {
			System.out.println("이름: " + s.name + ", " + "등급: " + s.grade);
		}
	}
}
