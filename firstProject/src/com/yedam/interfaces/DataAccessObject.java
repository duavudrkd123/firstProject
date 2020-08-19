package com.yedam.interfaces;

public interface DataAccessObject {//인터페이스를 통해 사용할 메소드 틀을 정의한다
	public void select(); //인터페이스의 메소드는 모두 추상메소드다!
	public void insert();
	public void update(); 
}
