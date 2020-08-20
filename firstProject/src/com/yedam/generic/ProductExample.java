package com.yedam.generic;

import com.yedam.classes.Person;

public class ProductExample {
	public static void main(String[] args) {
		Product<String, Person> pr1 = new Product<>();
		pr1.setModel(new Person());
		pr1.setType(new String("유형"));
		
		Product<String, Integer> p1 = new Product<> ();
		p1.setModel(10);
		p1.setType("최재영");
		Product<String, Integer> p2 = new Product<> ();
		p2.setModel(10);
		p2.setType("최재영");
		
		boolean A = (p1 ==p2);
		if (A)
			System.out.println("주소값이 같습니다.");
		else
			System.out.println("주소값이 다릅니다.");
		
		boolean tof = Utils.compare(p1, p2);
		if(tof)
			System.out.println("논리적으로 동등합니다.");
		else
			System.out.println("논리적으로 다릅니다.");
	}
}
