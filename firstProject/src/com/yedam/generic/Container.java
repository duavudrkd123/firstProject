package com.yedam.generic;

public class Container <T, M> {
	T Key;
	M Value;
	
	public T getKey() {
		return Key;
	}
	public void setKey(T Key) {
		this.Key = Key;
	}
	public M getValue() {
		return Value;
	}
	public void setValue(M Value) {
		this.Value = Value;
	}
	
	public void set(T Key, M Value) {
		this.Key = Key;
		this.Value = Value;
	}
	@Override
	public String toString() {
		return "Key=" + Key + ", Value=" + Value;
	}
	
	
}
