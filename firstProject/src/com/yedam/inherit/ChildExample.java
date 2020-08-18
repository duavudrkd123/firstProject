package com.yedam.inherit;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child("홍길동", 15, 10);
		child.getName();//부모의 getName()
		child.getAge();//부모의 getAge()
		child.getGrade();//자신의 getGrade()
		
		Parent parent = new Child("김유신", 20, 20); //부모 클래스에 자식 클래스 할당 가능
		parent.getName();
		parent.getAge();
		//parent.getGrade(); //자식 클래스의 메소드는 사용 불가능
	
		Vehicle v1 = new Taxi();
		v1.run();
		v1=new Bus();
		v1.run(); //다형성(같은 식에 다른 출력 값이 나옴)
		
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
	}
}
