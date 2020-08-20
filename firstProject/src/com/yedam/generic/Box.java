package com.yedam.generic;

public class Box<T> {//Box클래스를 쓸 때 T의 타입을 정하겠다 => 제네릭
//	private Object obj; //최상위 클래스라서 모든 클래스가 올 수 있다!
	private T obj; 
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return this.obj;
	}
}
