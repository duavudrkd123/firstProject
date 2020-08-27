package com.yedam.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Math {
	public static int min(int a, int b) {
		return (a<b)? a : b;
	}
	public static double min(double a, double b) {
		return (a<b)? a : b;
	}
}

public class NewExample {
	class Member { 
		String id;
		Member(String id) {
			this.id = id;
		}
		@Override
		public boolean equals(Object obj) { //같은 타임에 같은 값을 가지는지 알 수 있다.
			if(obj instanceof Member) {
				Member mem = (Member) obj;
				return id.equals(mem.id);
			} else {
				return false;
			}
		}
		@Override
		public int hashCode() {//문자열이 같은지 알 수 있다
			return Objects.hash(id); //Object.hash는 문자열에 따라 숫자를 부여한다
		}
		
		
	}
	
	public void printMember() {
		Member m1 = new Member("hong");
		System.out.println(m1);
	}
	
	public static void main(String[] args) {
		Math math = new Math();
		int result = Math.min(39, 25);
		double result2 = Math.min(24.6, 3.8);
		System.out.println("result: " + result);
		System.out.println("result2: " + result2);
		
		NewExample ne = new NewExample();
		Member mem = ne.new Member("hong");
		Member m1 = ne.new Member("hong");
		Member m2 = ne.new Member("hong");
		System.out.println(m1.equals(m2));
		
		Objects.hash(1); //hashCode(1)과 같다
		System.out.println(Objects.hash(1));
		
		Set<Member> set = new HashSet<>();
		set.add(m1);
		set.add(m2);
		for(Member m : set) {
			System.out.println(m.id);
		}
	}	
}

