package com.yedam.classes;

public class Cal {
	int r; //반지름
	double pi = 3.14;
	
	public void setRadius(int r) {
		if(r<0)
			this.r=0;
		else
			this.r=r;
	}
	
	public int getRadius() {
		return r;
	}
	
	public double getArea() {
		double result = pi *r*r;
		return result;
	}
}
