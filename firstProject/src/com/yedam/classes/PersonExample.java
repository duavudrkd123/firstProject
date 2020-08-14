package com.yedam.classes;

public class PersonExample {
	public static void main(String[] args) {
		
		Person p1 = new Person(); //p1.을 치면 Person class를 사용할 거임
		System.out.println("초기값 : " + p1.introduce());//초기화 안 하면 오류난다
		p1.setName("김상민");
		//Person class의 setName 객체를 매개변수 "김상민"으로 사용한다
		//name필드에 "김상민"을 저장
		System.out.println(p1.getName());
		//Person class의 getName 객체를 사용
		//name필드의 값(김상민)을 출력한다
		p1.setAge(27);
		System.out.println(p1.age);
	
		Person cjy = new Person(); //Person클래스를 이용해 ksm이라는 인스턴스를 만들겠다
			cjy.setName("최재영");//name필드에 최재영을 넣는다
			cjy.setAge(25);//age 필드에 25를 넣는다
			System.out.println("인스턴스 주소:" + cjy);//인스턴스 주소를 찍어준다
				
		Person ksm = new Person(); 
		ksm.setName("김상민");
		ksm.setAge(26);
		Person ksm2 = new Person(); 
		ksm.setName("김상민");
		ksm.setAge(26);
		System.out.println(ksm == ksm2); //값은 같지만 주소가 달라서 false
		System.out.println(ksm.getName().equals(ksm2.getName()));
		System.out.println(ksm.getName()==ksm2.getName());
		
		String str1 = ""; //문자열 생성
		String str2 = "";
		
		System.out.println(cjy.introduce());
		System.out.println(ksm.introduce());
		
		Person[] pAry = {cjy, ksm, ksm2}; //배열 생성
		
		for(int i=0; i<pAry.length; i++) {
			pAry[i].introduce(); //pAry배열의 i번째 값이 가지는 introduce 메소드 결과를 가져와라
		}
		//생성자로 값 만들기
		Person anoy = new Person("민해주");
		anoy.name = "최형준";//필드에 바로 값 넣기
		System.out.println(anoy.introduce());
		
		Person hsj = new Person("허성준", 20);
		hsj.setName("김시무"); //메소드로 허성준 값을 김시무로 바꾼다
		System.out.println(hsj.introduce());
	}
}
